package com.example.examenparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Talleres extends AppCompatActivity {
    private TextView tv1;
    private ListView lv1;
    private String nombres [] = {"Covid-19", "PowerBI", "C++", "Python", "App moviles"};
    private String edades [] = {"Elias Gomez Flores", "Agusto Silvera", "Jean Carlos Cruz", "Oscar Vilca", "Orlando Ramos"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_talleres);


            tv1 = (TextView)findViewById(R.id.tv1);
            lv1 = (ListView)findViewById(R.id.lv1);

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_nathan, nombres);
            lv1.setAdapter(adapter);

            lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    tv1.setText("El ponente de " + lv1.getItemAtPosition(i) + " es " + edades[i] );
                }
            });




    }
}
package com.example.examenparcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class reglamentos extends AppCompatActivity {
    private TextView tv2;
    private ListView lv2;
    private String nombres [] = {"Ingresar a la hora que se indica.", "Activar el micrófono cuando se le solicite.", "Mantener la cámara encendida.", "Registrar su asistencia.", "Tener conexión estable a internet."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reglamentos);


        tv2 = (TextView)findViewById(R.id.tv2);
        lv2 = (ListView)findViewById(R.id.lv2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_jc, nombres);
        lv2.setAdapter(adapter);

        lv2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv2.setText("El reglamento es " + lv2.getItemAtPosition(i)   );
            }
        });

    }
}
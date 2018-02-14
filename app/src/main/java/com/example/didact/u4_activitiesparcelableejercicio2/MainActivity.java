package com.example.didact.u4_activitiesparcelableejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText etNombre, etOpinion;
    Spinner spValoracion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNombre = (EditText)findViewById(R.id.resetNombre);
        etOpinion = (EditText)findViewById(R.id.resetOpinion);
        spValoracion = (Spinner)findViewById(R.id.resspValoracion);

        String[] valor={"","1","2","3","4","5","6","7","8","9","10"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,valor);
        spValoracion.setAdapter(adaptador);

    }
}

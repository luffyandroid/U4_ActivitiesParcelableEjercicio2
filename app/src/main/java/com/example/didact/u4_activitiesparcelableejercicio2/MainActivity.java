package com.example.didact.u4_activitiesparcelableejercicio2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static final String EXTRA_OPINION="OPINION";

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

    public void clickOpinion(View view){

        String nombre = etNombre.getText().toString();
        String opinion = etOpinion.getText().toString();
        String valoracion = spValoracion.getSelectedItem().toString();

        if (nombre.equals("") || opinion.equals("") || valoracion.equals("")){

            Toast.makeText(getApplicationContext(),"Debes rellenar todos los campos",
                    Toast.LENGTH_LONG).show();

        }else{

            Opinion opinionenviada = new Opinion(nombre, valoracion, opinion);

            Intent i=new Intent(getApplicationContext(),OpinionActivity.class);

            i.putExtra(EXTRA_OPINION, opinionenviada);

            startActivity(i);

        }

    }


}

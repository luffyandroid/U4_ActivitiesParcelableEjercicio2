package com.example.didact.u4_activitiesparcelableejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OpinionActivity extends AppCompatActivity {

    TextView tvNombre, tvValoracion, tvOpinion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opinion);

        tvNombre = (TextView)findViewById(R.id.opiTvNombre);
        tvValoracion = (TextView)findViewById(R.id.opiTvValoracion);
        tvOpinion = (TextView)findViewById(R.id.opiTvopinion);

        Bundle b= getIntent().getExtras();

        if (b!=null){

            Opinion o = b.getParcelable(MainActivity.EXTRA_OPINION);
            tvNombre.setText(o.getNombre());
            tvValoracion.setText(o.getValoracion());
            tvOpinion.setText(o.getOpinion());

        }

    }
}

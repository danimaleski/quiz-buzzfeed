package com.example.quizteste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.quizteste.MainActivity.EXTRA_PONTUACAO;

public class ResultadoActivity extends AppCompatActivity {
    int totalPontuacao = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        totalPontuacao = getIntent().getIntExtra(EXTRA_PONTUACAO, 0);

        TextView textoResult = findViewById(R.id.txtResultado);

        if (totalPontuacao <= 5) {
            textoResult.setText("Vc nem gosta de doce!");
        } else if (totalPontuacao <= 10) {
            textoResult.setText("Quase lá!");
        } else if (totalPontuacao <= 15) {
            textoResult.setText("Doceiro!");
        } else {
            textoResult.setText("Cuidadoooo!!! Vc tem diabetes =( ");
        }

    }
}

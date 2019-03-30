package com.example.quizteste;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static String EXTRA_PONTUACAO = "EXTRA_PONTUACAO";
    private static String EXTRA_QUIZ = "EXTRA_QUIZ";
    int qualQuizEstou = 0;
    int totalPontuacao = 0;

    TextView tituloDaPergunta;

    LinearLayout opcaoUm;
    ImageView imagemUm;
    TextView opcaoUmResposta;

    LinearLayout opcaoDois;
    ImageView imagemDois;
    TextView opcaoDoisResposta;

    LinearLayout opcaoTres;
    ImageView imagemTres;
    TextView opcaoTresResposta;

    LinearLayout opcaoQuatro;
    ImageView imagemQuatro;
    TextView opcaoQuatroResposta;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tituloDaPergunta = findViewById(R.id.tituloDaPergunta);

        opcaoUm = findViewById(R.id.opcaoUm);
        imagemUm = findViewById(R.id.opcaoUmImagem);
        opcaoUmResposta = findViewById(R.id.opcaoUmResposta);

        opcaoDois = findViewById(R.id.opcaoDois);
        imagemDois = findViewById(R.id.opcaoDoisImagem);
        opcaoDoisResposta = findViewById(R.id.opcaoDoisResposta);

        opcaoTres = findViewById(R.id.opcaoTres);
        imagemTres = findViewById(R.id.opcaoTresImagem);
        opcaoTresResposta = findViewById(R.id.opcaoTresResposta);

        opcaoQuatro = findViewById(R.id.opcaoQuatro);
        imagemQuatro = findViewById(R.id.opcaoQuatroImagem);
        opcaoQuatroResposta = findViewById(R.id.opcaoQuatroResposta);

        Intent intent = getIntent();
        qualQuizEstou = intent.getIntExtra(EXTRA_QUIZ, 0);
        totalPontuacao = intent.getIntExtra(EXTRA_PONTUACAO, 0);

        Toast.makeText(this, "" + totalPontuacao, Toast.LENGTH_SHORT).show();

        if (qualQuizEstou == 0) {
            tituloDaPergunta.setText("Escolha algo delicioso para comer com nutella:");

            imagemUm.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.crepe));
            opcaoUmResposta.setText("Crepe de nutella");

            imagemDois.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.waffle));
            opcaoDoisResposta.setText("Waffle de nutella");

            imagemTres.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.panquecas));
            opcaoTresResposta.setText("Panquecas de nutella");

            imagemQuatro.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.torrada));
            opcaoQuatroResposta.setText("Torrada de nutella");
        }

        if (qualQuizEstou == 1) {
            tituloDaPergunta.setText("Escolha uma torta:");

            imagemUm.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.chocolate));
            opcaoUmResposta.setText("Chocolate");

            imagemDois.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.banana_creme));
            opcaoDoisResposta.setText("Banana com creme");

            imagemTres.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.abobora));
            opcaoTresResposta.setText("Abóbora");

            imagemQuatro.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.maca));
            opcaoQuatroResposta.setText("Maça");
        }

        if (qualQuizEstou == 2) {
            tituloDaPergunta.setText("Escolha um bixxxcoito:");

            imagemUm.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.acucar));
            opcaoUmResposta.setText("Açúcar");

            imagemDois.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.manteiga_amendoim));
            opcaoDoisResposta.setText("Manteiga de amendoim");

            imagemTres.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.choco_branco));
            opcaoTresResposta.setText("Chocolate branco");

            imagemQuatro.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.amanteigado));
            opcaoQuatroResposta.setText("Amanteigado");
        }

        if (qualQuizEstou == 3) {
            tituloDaPergunta.setText("Escolha um bolo:");

            imagemUm.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.red_velvet));
            opcaoUmResposta.setText("Red velvet");

            imagemDois.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.cheesecake));
            opcaoDoisResposta.setText("Cheesecake");

            imagemTres.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.morango));
            opcaoTresResposta.setText("Morango");

            imagemQuatro.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.coco));
            opcaoQuatroResposta.setText("Coco");
        }

        if (qualQuizEstou == 4) {
            tituloDaPergunta.setText("Escolha uma massa de pastelaria:");

            imagemUm.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.cannoli));
            opcaoUmResposta.setText("Cannoli");

            imagemDois.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.torta_frutas));
            opcaoDoisResposta.setText("Torta de frutas");

            imagemTres.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.croissant));
            opcaoTresResposta.setText("Croissant de amêndoas");

            imagemQuatro.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.donuts));
            opcaoQuatroResposta.setText("Donuts");
        }

        if (qualQuizEstou == 5) {
            Intent intentResult = new Intent(MainActivity.this, ResultadoActivity.class);
            intentResult.putExtra(EXTRA_PONTUACAO, totalPontuacao);
            startActivity(intentResult);
            finish();
        }

        opcaoUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                intent.putExtra(EXTRA_QUIZ, qualQuizEstou + 1);
                intent.putExtra(EXTRA_PONTUACAO, totalPontuacao + 1);
                startActivity(intent);
            }
        });

        opcaoDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                intent.putExtra(EXTRA_QUIZ, qualQuizEstou + 1);
                intent.putExtra(EXTRA_PONTUACAO, totalPontuacao + 2);
                startActivity(intent);

            }
        });

        opcaoTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                intent.putExtra(EXTRA_QUIZ, qualQuizEstou + 1);
                intent.putExtra(EXTRA_PONTUACAO, totalPontuacao + 3);
                startActivity(intent);

            }
        });

        opcaoQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                intent.putExtra(EXTRA_QUIZ, qualQuizEstou + 1);
                intent.putExtra(EXTRA_PONTUACAO, totalPontuacao + 4);
                startActivity(intent);

            }
        });

    }
}

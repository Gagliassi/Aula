package br.com.up.aula01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textViewTitle;
    private Button buttonAction;
    private ArrayList<String> phrases = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTitle = findViewById(R.id.text_title);
        buttonAction = findViewById(R.id.button_action);
        phrases.add("Eu sou o homem que vai se tornar o rei dos piratas!");
        phrases.add("Eu tenho um sonho, que é ser o rei dos piratas.!");
        phrases.add("Saanji, quero comida.");
        phrases.add("Você dormiu 3 dias, 3 dias?\n" +
                "Quer dizer que perdi 15 refeições");
        phrases.add("É patético desistir de algo, sem nem mesmo ter tentado.");


        View.OnClickListener Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random random = new Random();
                int position = random.nextInt(phrases.size());
                String phrase = phrases.get(position);
                textViewTitle.setText(phrase);
            }
        };

        buttonAction.setOnClickListener(Listener);
    }
}


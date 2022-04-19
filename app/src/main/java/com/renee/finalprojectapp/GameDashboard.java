package com.renee.finalprojectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.VideoView;

public class GameDashboard extends AppCompatActivity {
EditText player1, player2;
RadioButton singlePlay, multiPlay;
//TextView testText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_dashboard);
        getSupportActionBar().hide();

        //testText = findViewById(R.id.textView4);

        player1 = findViewById(R.id.inputOne);
        player2 = findViewById(R.id.inputTwo);
        singlePlay = findViewById(R.id.radioSingle);
        multiPlay = findViewById(R.id.radioMulti);

    }

    public void single(View v){
        player1.setVisibility(View.VISIBLE);
        player2.setVisibility(View.INVISIBLE);
    }
    public void multi(View v){
        player1.setVisibility(View.VISIBLE);
        player2.setVisibility(View.VISIBLE);
    }
    public void start(View v){
        String playerName = player1.getText().toString();
        //testText.setText(playerName);

        Intent intent = new Intent(this, GameDisplay.class);
        intent.putExtra("playerName", playerName);
        startActivity(intent);
    }
    public void quit(View v){
        Intent intent = new Intent(this, LandingPage.class);
        startActivity(intent);
    }
}
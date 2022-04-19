package com.renee.finalprojectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class ResultsPage extends AppCompatActivity {
TextView resultsText, scoreDisplay, playerText;
GifImageView gifImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_page);
        getSupportActionBar().hide();

        gifImage = findViewById(R.id.gifDisplay);
        playerText = findViewById(R.id.playerTxt);
        //Receive player name and display it:
        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String player = extras.getString("player");
            playerText.setText(player);
        }
        resultsText = findViewById(R.id.txtDisplay);
        scoreDisplay = findViewById(R.id.scoreText);

        //Receive score value and display it:
        Intent resIntent = getIntent();
        int results = resIntent.getIntExtra("score", 0);
        scoreDisplay.setText("Score: " + results);
        if (results > 10){
            gifImage.setImageResource(R.drawable.win);
            resultsText.setText("Wow! You did an amazing job.  Clearly you know your Disney Renaissance history!");
        } else {
            gifImage.setImageResource(R.drawable.lose);
            resultsText.setText("It was a test of nostalgic wit...which bested you in the end.  Feel free to try again!");
        }

    }

    public void backToDash(View v){
        Intent intent = new Intent(this, GameDashboard.class);
        startActivity(intent);
    }
}
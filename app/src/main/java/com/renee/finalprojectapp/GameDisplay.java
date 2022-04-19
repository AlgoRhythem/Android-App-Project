package com.renee.finalprojectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class GameDisplay extends AppCompatActivity {
VideoView videoView;
TextView question, tracking;
Button choiceA, choiceB, choiceC, choiceD;
String player;
    int questionCounter = 1;
    int score, questionNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_display);
        getSupportActionBar().hide();

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            player = extras.getString("playerName");
        }

        question = findViewById(R.id.txtQuestion);
        tracking = findViewById(R.id.textView3);
        choiceA = (Button) findViewById(R.id.a);
        choiceB = (Button) findViewById(R.id.b);
        choiceC = (Button) findViewById(R.id.c);
        choiceD = (Button) findViewById(R.id.d);
        videoView = findViewById(R.id.gameVid);

        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.gamedashvid);
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();
        question.setText("Welcome to the 'Disney Renaissance' challenge!");

        choiceA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (questionNum == 1 || questionNum == 7){
                    score+=2;
                    tracking.setText("Correct! You've gained 2 points!");
                } else {
                    score-=1;
                    tracking.setText("Sorry! You've lost 1 point...");
                }
            }
        });
        choiceB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (questionNum == 2 || questionNum == 5 || questionNum == 10){
                    score+=2;
                    tracking.setText("Correct! You've gained 2 points!");
                } else {
                    score-=1;
                    tracking.setText("Sorry! You've lost 1 point...");
                }
            }
        });
        choiceC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (questionNum == 4 || questionNum == 8){
                    score+=2;
                    tracking.setText("Correct! You've gained 2 points!");
                } else {
                    score-=1;
                    tracking.setText("Sorry! You've lost 1 point...");
                }
            }
        });
        choiceD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (questionNum == 3 || questionNum == 6 || questionNum == 9){
                    score+=2;
                    tracking.setText("Correct! You've gained 2 points!");
                } else {
                    score-=1;
                    tracking.setText("Sorry! You've lost 1 point...");
                }
            }
        });

    }

    public void next(View v){
        choiceA.setVisibility(View.VISIBLE);
        choiceB.setVisibility(View.VISIBLE);
        choiceC.setVisibility(View.VISIBLE);
        choiceD.setVisibility(View.VISIBLE);
        
        switch (questionCounter){
            case 1:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.littlemermaid);
                MediaController m1 = new MediaController(this);
                videoView.setMediaController(m1);
                m1.setAnchorView(videoView);
                videoView.start();
                question.setText("In the clip above of the concert Ariel missed, what was the name of the very first sister mentioned in the song?");

                choiceA.setText("Aquata");
                choiceB.setText("Arista");
                choiceC.setText("Adella");
                choiceD.setText("Adrina");
                break;
            case 2:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.resucers);
                MediaController m2 = new MediaController(this);
                videoView.setMediaController(m2);
                m2.setAnchorView(videoView);
                videoView.start();
                question.setText("In ‘The Rescuers Down Under’, what kind of creature hopped out of the truck?");

                choiceA.setText("Swine");
                choiceB.setText("Razorback");
                choiceC.setText("Boar");
                choiceD.setText("Pesky pest");
                break;
            case 3:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.beautyandthebeast);
                MediaController m3 = new MediaController(this);
                videoView.setMediaController(m3);
                m3.setAnchorView(videoView);
                videoView.start();
                question.setText("How long have the servants of the Beast been rusting in the castle?");

                choiceA.setText("5 years");
                choiceB.setText("21 years");
                choiceC.setText("16 years");
                choiceD.setText("10 years");
                break;
            case 4:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.aladdin);
                MediaController m4 = new MediaController(this);
                videoView.setMediaController(m4);
                m4.setAnchorView(videoView);
                videoView.start();
                question.setText("What was the title that Jaffar held in Agrabah?");

                choiceA.setText("Major Domo");
                choiceB.setText("Sultan");
                choiceC.setText("Royal Vizier");
                choiceD.setText("Mage");
                break;
            case 5:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.lionking);
                MediaController m5 = new MediaController(this);
                videoView.setMediaController(m5);
                m5.setAnchorView(videoView);
                videoView.start();
                question.setText("Out of the three hyenas, what was the name of the one Whoopi Goldberg played?");

                choiceA.setText("Banzai");
                choiceB.setText("Shenzi");
                choiceC.setText("Ed");
                choiceD.setText("Linzi");
                break;
            case 6:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.pocahontas);
                MediaController m6 = new MediaController(this);
                videoView.setMediaController(m6);
                m6.setAnchorView(videoView);
                videoView.start();
                question.setText("The famous line ‘listen with your heart’ means what in native Algonquin?");

                choiceA.setText("Whey hey an-to-ra");
                choiceB.setText("Nan de ma-to-ra");
                choiceC.setText("Hen re ga-to-ra");
                choiceD.setText("Que que na-to-ra");
                break;
            case 7:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.hunchbackofnotredame);
                MediaController m7 = new MediaController(this);
                videoView.setMediaController(m7);
                m7.setAnchorView(videoView);
                videoView.start();
                question.setText("What is the name of Claude Frollo’s theme song in the Hunchback of Notre Dame?");

                choiceA.setText("Hellfire");
                choiceB.setText("Brimstone");
                choiceC.setText("Hailrain");
                choiceD.setText("Jezebel");
                break;
            case 8:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.hercules);
                MediaController m8 = new MediaController(this);
                videoView.setMediaController(m8);
                m8.setAnchorView(videoView);
                videoView.start();
                question.setText("Can you name the lovely group of songbirds from this clip?");

                choiceA.setText("The Winx");
                choiceB.setText("Belladonnas");
                choiceC.setText("The Muses");
                choiceD.setText("Nightingales");
                break;
            case 9:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.mulan);
                MediaController m9 = new MediaController(this);
                videoView.setMediaController(m9);
                m9.setAnchorView(videoView);
                videoView.start();
                question.setText("Which member of the Fa family was led to disaster in Mulan?");

                choiceA.setText("Fa Zhou");
                choiceB.setText("Fa Li");
                choiceC.setText("Fa Shang");
                choiceD.setText("Fa Deng");
                break;
            case 10:
                videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.tarzan);
                MediaController m10 = new MediaController(this);
                videoView.setMediaController(m10);
                m10.setAnchorView(videoView);
                videoView.start();
                question.setText("What is the name of the singer that performed the vocal score for Tarzan?");

                choiceA.setText("Elton John");
                choiceB.setText("Phil Collins");
                choiceC.setText("Eric Clapton");
                choiceD.setText("Neil Young");
                break;
            default: //code
        }

        questionCounter+=1;
        questionNum+=1;
        tracking.setText("Question#: " + questionNum + "     Score: " + score);
        if (questionCounter > 11){
            //go to the results page and send the score:
            Intent resIntent = new Intent(this, ResultsPage.class);
            resIntent.putExtra("score", score);
            resIntent.putExtra("player", player);
            startActivity(resIntent);
        }
    }
    public void back(View v){
        Intent i = new Intent(this, GameDashboard.class);
        startActivity(i);
    }
}
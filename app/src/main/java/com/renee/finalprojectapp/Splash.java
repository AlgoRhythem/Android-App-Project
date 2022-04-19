package com.renee.finalprojectapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.renee.finalprojectapp.databinding.ActivitySplashBinding;

public class Splash extends AppCompatActivity {
    Handler handler = new Handler();

    // Used to load the 'finalprojectapp' library on application startup.
    static {
        System.loadLibrary("finalprojectapp");
    }

    private ActivitySplashBinding binding;
TextView subHeading;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivitySplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        subHeading = findViewById(R.id.disney);

        //Hide the action bar:
        getSupportActionBar().hide();

        // Example of a call to a native method
        TextView tv = binding.sampleText;
        tv.setText(stringFromJNI());

        //Create animation for the TextView 'tv':
        Animation splashAnim = AnimationUtils.loadAnimation(this, R.anim.splash_animations);
        subHeading.startAnimation(splashAnim);

        //Delay and Intent to go to Landing Page:
        Intent intent = new Intent(this, LandingPage.class);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(intent);
            }
        }, 3000);
    }

    /**
     * A native method that is implemented by the 'finalprojectapp' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
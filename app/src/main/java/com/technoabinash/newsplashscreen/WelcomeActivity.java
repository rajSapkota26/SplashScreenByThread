package com.technoabinash.newsplashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //first set welcome activity from manifest file
        // create thread object set timer and finally forward to main activity
        Thread thread = new Thread() {
            public void run() {
                try {
                    sleep(4000);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                   startActivity( new Intent(WelcomeActivity.this, MainActivity.class));

                }
            }
        };thread.start();
    }
}
package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    Timer timer;
    boolean click=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            timer=new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    Intent i1=new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(i1);

                }
            },5000);




    }
}
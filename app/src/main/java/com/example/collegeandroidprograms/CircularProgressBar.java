//TODO Practical No. 13: Develop a program to implement Progress Bar
//Ques 1: Write a program to display circular progress bar.

package com.example.collegeandroidprograms;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CircularProgressBar extends AppCompatActivity {

    private TextView txtProgress;
    private ProgressBar progressBar;
    private int pStatus = 0;
    private Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circular_progress_bar);

        txtProgress = (TextView) findViewById(R.id.txtProgress);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        Button strtBTN = (Button) findViewById(R.id.strtBTN);

        strtBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (pStatus <=100)
                        {
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar.setProgress(pStatus);
                                    txtProgress.setText(pStatus + "%");
                                }
                            });
                            try {
                                Thread.sleep(50);
                            }
                            catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            pStatus++;
                        }
                    }
                }).start();
            }
        });

    }
}
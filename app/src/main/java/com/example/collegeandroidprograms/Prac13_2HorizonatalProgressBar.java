package com.example.collegeandroidprograms;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Prac13_2HorizonatalProgressBar extends AppCompatActivity {

    private int progressBarStatus = 0;
    private Handler progressBarHandler = new Handler();
    private long level = 0;
    ProgressDialog progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horizonatal_progress_bar);

        Button strtDownload = (Button) findViewById(R.id.strtDownload);

        strtDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                progressBar = new ProgressDialog(view.getContext());
                progressBar.setCancelable(true);
                progressBar.setMessage("File is Downloading...");
                progressBar.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                progressBar.setProgress(0);
                progressBar.incrementProgressBy(10);
                progressBar.setMax(100);
                progressBar.show();

                progressBarStatus = 0;
                level = 0;

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (progressBarStatus < 100) {

                            progressBarStatus = progresslevel();

                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            progressBarHandler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar.setProgress(progressBarStatus);
                                }
                            });
                        }

                        if (progressBarStatus >= 100) {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    new AlertDialog.Builder(Prac13_2HorizonatalProgressBar.this)
                                            .setTitle("File Downloaded")
                                            .setMessage("File Downloaded Succesfully!!!")
                                            .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                                                @Override
                                                public void onClick(DialogInterface dialogInterface, int i) {

                                                }
                                            }).show();
                                }
                            });
                            progressBar.dismiss();
                        }
                    }
                }).start();
            }
        });
    }

    public int progresslevel() {
        level++;

        if (level == 10) {
            return 10;
        } else if (level == 20) {
            return 20;
        } else if (level == 30) {
            return 30;
        } else if (level == 40) {
            return 40;
        } else if (level == 50) {
            return 50;
        } else if (level == 60) {
            return 60;
        } else if (level == 70) {
            return 70;
        } else if (level == 80) {
            return 80;
        } else if (level == 90) {
            return 90;
        }
        return 100;
    }
}
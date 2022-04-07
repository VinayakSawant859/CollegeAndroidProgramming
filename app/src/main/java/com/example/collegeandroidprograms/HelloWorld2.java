package com.example.collegeandroidprograms;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;

public class HelloWorld2 extends AppCompatActivity {

    private TextView thanks, authorINFO;
    private ImageView thanksIMG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world2);

        ButterKnife.bind(this);

        thanks = findViewById(R.id.thanks);
        authorINFO = findViewById(R.id.authorINFO);
        thanksIMG = findViewById(R.id.thanksIMG);

        Button prac21 = findViewById(R.id.prac21);
        Button prac22_1 = findViewById(R.id.prac22_1);
        Button prac22_2 = findViewById(R.id.prac22_2);
        Button prac23_1 = findViewById(R.id.prac23_1);
        Button prac23_2 = findViewById(R.id.prac23_2);
        Button prac24 = findViewById(R.id.prac24);
        Button prac25 = findViewById(R.id.prac25);
        Button prac26 = findViewById(R.id.prac26);
        Button prac27 = findViewById(R.id.prac27);
        Button prac28 = findViewById(R.id.prac28);
        Button prac29 = findViewById(R.id.prac29);
        Button prac30 = findViewById(R.id.prac30);
        Button prac31_1 = findViewById(R.id.prac31_1);
        Button prac31_2 = findViewById(R.id.prac31_2);


        prac21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloWorld2.this, BroadcastReceiverExample.class));
            }
        });

        prac22_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloWorld2.this, AndroidSensorsExample.class));
            }
        });

        prac22_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloWorld2.this, SensorsListExample.class));
            }
        });

        prac23_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloWorld2.this, CameraCaptureExample.class));
            }
        });

        prac23_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloWorld2.this, VideoRecordingExample.class));
            }
        });

        prac24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloWorld2.this, BluetoothAdminExample.class));
            }
        });

        prac25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloWorld2.this, AnimationExample.class));
            }
        });

        prac26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloWorld2.this, SQLiteAsyncTaskExample.class));
            }
        });

        prac27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloWorld2.this, SMSManagerExample.class));
            }
        });

        thanks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                authorINFO.setText("Developer: Vinayak Suresh Sawant\n" +
                                    "Course: Information Technology\n" +
                                    "MH Saboo Siddik Polytechnic");
                thanksIMG.setImageResource(R.drawable.namaste);
            }
        });
    }
}
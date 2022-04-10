package com.example.collegeandroidprograms;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;

public class MainPage2 extends AppCompatActivity {

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
                startActivity(new Intent(MainPage2.this, Prac21BroadcastReceiverExample.class));
            }
        });

        prac22_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac22_1AndroidSensorsExample.class));
            }
        });

        prac22_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac22_2SensorsListExample.class));
            }
        });

        prac23_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac23_1CameraCaptureExample.class));
            }
        });

        prac23_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac23_2VideoRecordingExample.class));
            }
        });

        prac24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac24BluetoothAdminExample.class));
            }
        });

        prac25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac25AnimationExample.class));
            }
        });

        prac26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac26SQLiteAsyncTaskExample.class));
            }
        });

        prac27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac27LoginAndRegisterUsingSQLIte.class));
            }
        });

        prac28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac28_LoginActivityWithValidation.class));
            }
        });

        prac29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac29SMSManagerExample.class));
            }
        });

        prac30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac30EmailClientExample.class));
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
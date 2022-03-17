package com.example.collegeandroidprograms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HelloWorld extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button prac4_2 = (Button) findViewById(R.id.prac4_2);
        Button prac5_1 = (Button) findViewById(R.id.prac5_1);
        Button prac5_2 = (Button) findViewById(R.id.prac5_2);
        Button prac6_1 = (Button) findViewById(R.id.prac6_1);
        Button prac6_2 = (Button) findViewById(R.id.prac6_2);
        Button prac7_1 = (Button) findViewById(R.id.prac7_1);
        Button prac7_2 = (Button) findViewById(R.id.prac7_2);
        Button prac8_1 = (Button) findViewById(R.id.prac8_1);
        Button prac8_2 = (Button) findViewById(R.id.prac8_2);
        Button prac9_1 = (Button) findViewById(R.id.prac9_1);
        Button prac9_2 = (Button) findViewById(R.id.prac9_2);

        prac4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloWorld.this, StudentName.class));
            }
        });

        prac5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloWorld.this, LinearLayout.class));
            }
        });

        prac5_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloWorld.this, AbsoluteLayout.class));
            }
        });

        prac6_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloWorld.this, TableLayout.class));
            }
        });

        prac6_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloWorld.this, FrameLayout.class));
            }
        });

        prac7_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloWorld.this, UserLogin.class));
            }
        });

        prac7_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloWorld.this, PersonalInfo.class));
            }
        });

        prac8_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloWorld.this, AutoCompleteTxtView.class));
            }
        });

        prac8_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloWorld.this, SixthSemSubjects.class));
            }
        });

        prac9_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloWorld.this, BluetoothToggle.class));
            }
        });

        prac9_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HelloWorld.this, SimpleCalculator.class));
            }
        });
    }
}
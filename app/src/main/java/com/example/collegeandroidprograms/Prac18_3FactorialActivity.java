package com.example.collegeandroidprograms;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Prac18_3FactorialActivity extends AppCompatActivity {

    private TextView ficANS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);

        Bundle bundle = getIntent().getExtras();
        ficANS = findViewById(R.id.ficANS);
        int ans = bundle.getInt("ANSWER");
        int num = bundle.getInt("NUMBER");
        ficANS.setText("Factorial of "+num+" is: "+ans);
    }
}
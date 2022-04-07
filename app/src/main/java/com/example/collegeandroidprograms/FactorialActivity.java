package com.example.collegeandroidprograms;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FactorialActivity extends AppCompatActivity {

    private TextView ficANS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);

        Bundle bundle = getIntent().getExtras();
        ficANS = findViewById(R.id.ficANS);
        int ans = bundle.getInt("ANSWER");
        ficANS.setText("Factorial is: \n"+ans);
    }
}
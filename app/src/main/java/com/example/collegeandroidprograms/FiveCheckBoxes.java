package com.example.collegeandroidprograms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class FiveCheckBoxes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_check_boxes);

        CheckBox mumbai = (CheckBox) findViewById(R.id.mumbai);
        CheckBox chennai = (CheckBox) findViewById(R.id.chennai);
        CheckBox kolkata = (CheckBox) findViewById(R.id.kolkata);
        CheckBox delhi = (CheckBox) findViewById(R.id.delhi);
        CheckBox jaipur = (CheckBox) findViewById(R.id.jaipur);

        mumbai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mumbai.isChecked()){
                    Toast.makeText(FiveCheckBoxes.this, "Your selected city is Mumbai!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        chennai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chennai.isChecked()){
                    Toast.makeText(FiveCheckBoxes.this, "Your selected city is Chennai!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        kolkata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (kolkata.isChecked()){
                    Toast.makeText(FiveCheckBoxes.this, "Your selected city is Kolkata!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        delhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (delhi.isChecked()){
                    Toast.makeText(FiveCheckBoxes.this, "Your selected city is Delhi!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        jaipur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (jaipur.isChecked()){
                    Toast.makeText(FiveCheckBoxes.this, "Your selected city is Jaipur!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
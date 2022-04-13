package com.example.collegeandroidprograms;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Prac12RadioButton extends AppCompatActivity {

    RadioButton genderButton, radioButton1, radioButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        Button showSelected = (Button) findViewById(R.id.showSelected);


        radioButton1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(Prac12RadioButton.this, radioButton1.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                Toast.makeText(Prac12RadioButton.this, radioButton2.getText(), Toast.LENGTH_SHORT).show();
            }
        });

        showSelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            int selectedID = radioGroup.getCheckedRadioButtonId();
            genderButton = findViewById(selectedID);
            if (selectedID == 1){
                Toast.makeText(Prac12RadioButton.this, "Nothing Selected", Toast.LENGTH_SHORT).show();
            }
            else {
                Toast.makeText(Prac12RadioButton.this, genderButton.getText(), Toast.LENGTH_SHORT).show();
            }
            }
        });

    }
}
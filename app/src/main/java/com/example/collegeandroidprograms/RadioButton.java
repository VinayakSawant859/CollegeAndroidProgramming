package com.example.collegeandroidprograms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class RadioButton extends AppCompatActivity {

    android.widget.RadioButton radioButton1, radioButton2, male, female, other;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        radioButton1 = findViewById(R.id.radioButton1);
        radioButton2 = findViewById(R.id.radioButton2);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        Button showSelected = (Button) findViewById(R.id.showSelected);


        showSelected.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (radioButton1.isChecked() & radioButton2.isChecked()){
                    Toast.makeText(RadioButton.this, "You enabled Radio Button 1 and 2", Toast.LENGTH_SHORT).show();
                }
                else if (radioButton1.isChecked()){
                    Toast.makeText(RadioButton.this, "You enabled Radio Button 1", Toast.LENGTH_SHORT).show();
                }
                else if (radioButton2.isChecked()){
                    Toast.makeText(RadioButton.this, "You enabled Radio Button 2", Toast.LENGTH_SHORT).show();
                }

                //////////**********///////////

                if (male.isChecked()){
                    Toast.makeText(RadioButton.this, "You selected Male", Toast.LENGTH_SHORT).show();
                }
                else if (female.isChecked()){
                    Toast.makeText(RadioButton.this, "You selected Female", Toast.LENGTH_SHORT).show();
                }
                else if (other.isChecked()){
                    Toast.makeText(RadioButton.this, "You selected Other", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
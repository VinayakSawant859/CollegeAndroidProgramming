package com.example.collegeandroidprograms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prac7_2PersonalInfo extends AppCompatActivity {

    private EditText Name, branch, rollno, enroll;
    private Button View;
    private TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_info);

        Name = findViewById(R.id.Name);
        branch = findViewById(R.id.branch);
        rollno = findViewById(R.id.rollno);
        enroll = findViewById(R.id.enroll);
        View = findViewById(R.id.viewinfo);
        display = findViewById(R.id.display);

        View.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                display.setText(Name.getText().toString()+"\n"+
                                branch.getText().toString()+"\n"+
                                rollno.getText().toString()+"\n"+
                                enroll.getText().toString());
            }
        });

    }
}
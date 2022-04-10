//TODO: Practical No. 20: Develop a program to implement service.
//Ques 2. Write a program to display the following output (Prac20_2CustomServiceExample).

package com.example.collegeandroidprograms;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Prac20_2CustomServiceExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_service_example);

        View.OnClickListener listener = new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Prac20_2CustomServiceExample.this, Prac20_2MyService.class);
                switch (view.getId()) {
                    case R.id.service_start:
                        //starts service for the given Intent
                        startService(intent);
                        break;
                    case R.id.service_stop:
                        //stops service for the given Intent
                        stopService(intent);
                        break;
                }
            }
        };
        findViewById(R.id.service_start).setOnClickListener(listener);
        findViewById(R.id.service_stop).setOnClickListener(listener);
    }
}
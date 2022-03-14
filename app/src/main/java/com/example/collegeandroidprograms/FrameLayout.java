package com.example.collegeandroidprograms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FrameLayout extends AppCompatActivity {

    private View FL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        FL = findViewById(R.id.FL);

        FL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FrameLayout.this, UserLogin.class));
            }
        });
    }
}
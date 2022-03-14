package com.example.collegeandroidprograms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LinearLayout extends AppCompatActivity {

    private View layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        layout = findViewById(R.id.linearLayout);

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LinearLayout.this, AbsoluteLayout.class));
            }
        });
    }
}
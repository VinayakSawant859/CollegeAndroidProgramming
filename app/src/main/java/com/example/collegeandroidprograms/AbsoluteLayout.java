package com.example.collegeandroidprograms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AbsoluteLayout extends AppCompatActivity {

    private TextView TV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absolute_layout);

        TV = findViewById(R.id.TV);

        TV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AbsoluteLayout.this, TableLayout.class));
            }
        });
    }
}
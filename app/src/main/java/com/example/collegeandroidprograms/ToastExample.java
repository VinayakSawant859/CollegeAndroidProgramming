package com.example.collegeandroidprograms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ToastExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_example);

        Button showToast = (Button) findViewById(R.id.showToast);
        StringBuffer sb = new StringBuffer("Message For You:");

        showToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ToastExample.this, sb.append("\n You have a new Mail!!!"), Toast.LENGTH_LONG).show();
//                sb.delete(15, sb.length()-1);
            }
        });
    }
}
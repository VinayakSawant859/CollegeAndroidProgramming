package com.example.collegeandroidprograms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class SixthSemSubjects extends AppCompatActivity {

    String[] subjects = {"IF6I - Mobile Application Development",
                        "IF6I - Web Based Application Development using PHP",
                        "IF6I - Wireless Mobile Networks",
                        "IF6I - Emerging Trends in Information Technology",
                        "IF6I - Management"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth_sem_subjects);

        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView2);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, subjects);

        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(4);
        autoCompleteTextView.setAdapter(adapter);
    }
}
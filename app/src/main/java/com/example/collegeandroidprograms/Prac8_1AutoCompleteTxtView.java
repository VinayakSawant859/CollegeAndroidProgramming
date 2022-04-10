//TODO Practical No. 8: Develop a program to implement Auto Complete Text View.
//Ques 1. Write a program to create a first display screen of any search engine using Auto Complete Text View.

package com.example.collegeandroidprograms;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

public class Prac8_1AutoCompleteTxtView extends AppCompatActivity {

    String[] states = {"Maharashtra", "Tamil Nadu", "Goa", "Manipur", "Kolkata", "Gujrat", "Madhya Pradesh", "Rajasthan"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_txt_view);

       AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, states);

        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(adapter);

    }
}
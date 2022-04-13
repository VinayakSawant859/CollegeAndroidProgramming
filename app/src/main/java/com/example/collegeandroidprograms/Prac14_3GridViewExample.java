package com.example.collegeandroidprograms;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class Prac14_3GridViewExample extends AppCompatActivity {

    GridView simpleGrid;
    int logos[] = {R.drawable.australia, R.drawable.canada, R.drawable.china, R.drawable.france,
            R.drawable.india, R.drawable.italy, R.drawable.japan, R.drawable.malaysia, R.drawable.mexico,
            R.drawable.russia, R.drawable.spain, R.drawable.sweden, R.drawable.uk, R.drawable.us};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prac143_grid_view_example);

        simpleGrid = (GridView) findViewById(R.id.simpleGridView); // init GridView

        // Create an object of CustomAdapter and set Adapter to GirdView
        Prac14_3CustomAdapter customAdapter = new Prac14_3CustomAdapter(getApplicationContext(), logos);
        simpleGrid.setAdapter(customAdapter);
        // implement setOnItemClickListener event on GridView
        simpleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // set an Intent to Another Activity
                Intent intent = new Intent(Prac14_3GridViewExample.this, Prac14_3SecondActivity.class);
                intent.putExtra("image", logos[position]); // put image data in Intent
                startActivity(intent); // start Intent
            }
        });
    }
}
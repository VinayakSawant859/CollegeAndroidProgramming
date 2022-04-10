package com.example.collegeandroidprograms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;

public class Prac14_2ImageViewExample extends AppCompatActivity {

    int lifecycleIMG[] = {R.drawable.baby, R.drawable.toddler, R.drawable.schoolboy, R.drawable.man, R.drawable.oldman};
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_example);

        TextView lifeTXT = (TextView) findViewById(R.id.lifeTXT);
        Button chngBTN = (Button) findViewById(R.id.chngBTN);
        ImageView lifeCycle = (ImageView) findViewById(R.id.lifeCycle);


        chngBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lifeCycle.setImageResource(lifecycleIMG[i]);
                i++;
                if (i==5){
                    i=0;
                }
                if (i==0)
                    lifeTXT.setText("Oldman");
                if (i==1)
                    lifeTXT.setText("Baby");
                if (i==2)
                    lifeTXT.setText("Toddler");
                if (i==3)
                    lifeTXT.setText("Boy");
                if (i==4)
                    lifeTXT.setText("Man");
            }
        });
    }
}
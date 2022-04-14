//TODO Practical No. 17: Develop a program to create an activity
//Ques 1. Write a program to create a MainPage1 Activity using all lifecycles methods to display messages using Log.d.

package com.example.collegeandroidprograms;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class Prac17ActivityLifeCycle extends AppCompatActivity {

    private static final String HOME_ACTIVITY_TAG = Prac17ActivityLifeCycle.class.getSimpleName();
    private void showLog(String text){
        Log.d(HOME_ACTIVITY_TAG, text);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);

        showLog("Activity Created");
    }

    @Override
    protected void onRestart(){
        super.onRestart();//call to restart after onStop
        showLog("Activity restarted");
    }

    @Override
    protected void onStart() {
        super.onStart();//soon be visible
        showLog("Activity started");
    }

    @Override
    protected void onResume() {
        super.onResume();//visible
        showLog("Activity resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();//invisible
        showLog("Activity paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showLog("Activity stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showLog("Activity is being destroyed");
    }
}
//TODO Practical No. 21: Develop a program to implement broadcast receiver
//Ques 1. Write a program to demonstrate all the system broadcast messages.

package com.example.collegeandroidprograms;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BroadcastReceiverExample extends AppCompatActivity {

    private BroadcastReceiver mNetworkReceiver;
    static TextView tv_check_connection;
    private Animation fadein;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast_receiver_example);

        tv_check_connection=(TextView) findViewById(R.id.tv_check_connection);
        mNetworkReceiver = new ConnectionReceiver();
        registerNetworkBroadcastForNougat();
        fadein = AnimationUtils.loadAnimation(this, R.anim.fadein);
        tv_check_connection.startAnimation(fadein);
    }

    public static void dialog(boolean value){

        if(value){
            tv_check_connection.setText("We are back !!!");
            tv_check_connection.setBackgroundColor(Color.GREEN);
            tv_check_connection.setTextColor(Color.WHITE);
        }else {
            tv_check_connection.setVisibility(View.VISIBLE);
            tv_check_connection.setText("Could not \nConnect to internet");
            tv_check_connection.setBackgroundColor(Color.RED);
            tv_check_connection.setTextColor(Color.WHITE);
        }
    }


    private void registerNetworkBroadcastForNougat() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            registerReceiver(mNetworkReceiver, new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            registerReceiver(mNetworkReceiver, new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION));
        }
    }

    protected void unregisterNetworkChanges() {
        try {
            unregisterReceiver(mNetworkReceiver);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        unregisterNetworkChanges();
    }
}
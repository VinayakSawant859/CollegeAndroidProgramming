//TODO: Practical No. 29: Develop a program to: a) Send SMS b) Receive SMS
//Ques 1. Write a program to send and receive SMS, make use of following GUI.

package com.example.collegeandroidprograms;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SMSManagerExample extends AppCompatActivity {

    EditText tvMessage, tvNumber;
    Button sendBTN;
    IntentFilter intentFilter;

    private BroadcastReceiver intentReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            TextView intTxt = findViewById(R.id.textMsg);
            intTxt.setText(intent.getExtras().getString("message"));
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smsmanager_example);

        intentFilter = new IntentFilter();
        intentFilter.addAction("SMS_RECEIVED_ACTION");
    }

    protected void sendMsg(String theNumber, String myMsg){
        String SENT = "Message Sent";
        String DELIVERED = "Message Delivered";

        PendingIntent sentPI = PendingIntent.getBroadcast(this, 0 , new Intent(SENT), 0);
        PendingIntent deliverdPI = PendingIntent.getBroadcast(this, 0 , new Intent(DELIVERED), 0);

        SmsManager sms = SmsManager.getDefault();
        sms.sendTextMessage(theNumber, null, myMsg, sentPI, deliverdPI);
    }

    @Override
    protected void onResume() {
        registerReceiver(intentReceiver, intentFilter);
        super.onResume();
    }

    @Override
    protected void onPause() {
        unregisterReceiver(intentReceiver);
        super.onPause();
    }

    public void onClick(View view){
        String myMsg = tvMessage.getText().toString();
        String theNumber = tvNumber.getText().toString();
        sendMsg(theNumber, myMsg);
    }

}
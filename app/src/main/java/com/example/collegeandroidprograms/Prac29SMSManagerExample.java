//TODO: Practical No. 29: Develop a program to: a) Send SMS b) Receive SMS
//Ques 1. Write a program to send and receive SMS, make use of following GUI.

package com.example.collegeandroidprograms;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class Prac29SMSManagerExample extends AppCompatActivity {

    private static final int PERMISSION_RQST_SEND = 0;
    ImageView sendBTN;
    EditText phoneNo;
    EditText myMessage;
    String PhoneNo;
    String message;
    TextView textMSG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smsmanager_example);

//We’ll create objects
        sendBTN = (ImageView) findViewById(R.id.sendBTN);
        phoneNo = (EditText) findViewById(R.id.tvNumber);
        myMessage = (EditText) findViewById(R.id.tvMessage);
        textMSG = findViewById(R.id.textMsg);

        sendBTN.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                sendSMSMessage();
                textMSG.setText(message+"\n");
            }
        });
    }
    protected void sendSMSMessage() {
        PhoneNo = phoneNo.getText().toString(); //we’ll get the phone number from the user
        message = myMessage.getText().toString();//we’ll get the Message from the user

         //We’ll check the permission is granted or not . If not we’ll change
        if (ContextCompat.checkSelfPermission(this,Manifest.permission.SEND_SMS) != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.SEND_SMS)) {
            }
            else { ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.SEND_SMS}, PERMISSION_RQST_SEND);
            }
        }else if (ContextCompat.checkSelfPermission(this, Manifest.permission.SEND_SMS) == PackageManager.PERMISSION_GRANTED){
            // This is an exemplary code added by me if you are running in target device higher than 21
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(PhoneNo, null, message, null, null);
            Toast.makeText(getApplicationContext(), "SMS sent.", Toast.LENGTH_LONG).show();
        }
    }
    //Now once the permission is there or not would be checked
    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode) {
            case PERMISSION_RQST_SEND: {
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendTextMessage(PhoneNo, null, message, null, null);
                    Toast.makeText(getApplicationContext(), "SMS sent.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "SMS failed, you may try again later.", Toast.LENGTH_LONG).show();
                    return;
                }
            }
        }
    }
}
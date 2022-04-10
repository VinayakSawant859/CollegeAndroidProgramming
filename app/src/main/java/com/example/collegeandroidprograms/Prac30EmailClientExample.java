package com.example.collegeandroidprograms;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Prac30EmailClientExample extends AppCompatActivity {

    private EditText mailTo, mailSubject, mailContent;
    private Button subbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prac30_email_client_example);

        mailTo = findViewById(R.id.textTo);
        mailSubject = findViewById(R.id.textSubject);
        mailContent = findViewById(R.id.textMessage);
        subbtn = findViewById(R.id.buttonSend);

        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(Intent.ACTION_SEND);
                it.putExtra(Intent.EXTRA_EMAIL, new String[] {mailTo.getText().toString()});
                it.putExtra(Intent.EXTRA_SUBJECT, new String[] {mailSubject.getText().toString()});
                it.putExtra(Intent.EXTRA_TEXT, new String[] {mailContent.getText().toString()});

                it.setType("message/rfc822");
                startActivity(Intent.createChooser(it,"Choose Mail App"));
            }
        });
    }
}
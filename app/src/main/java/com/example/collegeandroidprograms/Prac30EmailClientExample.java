package com.example.collegeandroidprograms;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
                if (!mailTo.getText().toString().isEmpty() && !mailSubject.getText().toString().isEmpty() && !mailContent.getText().toString().isEmpty()){
                    Intent it = new Intent(Intent.ACTION_SEND);
                    it.putExtra(Intent.EXTRA_EMAIL, new String[] {String.valueOf(Uri.parse(mailTo.getText().toString()))});
                    it.putExtra(Intent.EXTRA_SUBJECT, mailSubject.getText().toString());
                    it.putExtra(Intent.EXTRA_TEXT, mailContent.getText().toString());
                    it.setType("message/rfc822");

                    if (it.resolveActivity(getPackageManager()) != null){
                        startActivity(Intent.createChooser(it,"Choose Mail App"));
                    }else {
                        Toast.makeText(Prac30EmailClientExample.this, "There is no application to support this action", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    Toast.makeText(Prac30EmailClientExample.this, "Please fill all the fields", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
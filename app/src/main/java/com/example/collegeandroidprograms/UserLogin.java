package com.example.collegeandroidprograms;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UserLogin extends AppCompatActivity {

    private TextView user, pass, notify;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        //TODO Practical No. 7: Develop a program to implement Text View and Edit Text.
        //Ques 1. Write a program to accept username and password from the end user using Text View and Edit Text.

        user = findViewById(R.id.user);
        pass = findViewById(R.id.pass);
        notify = findViewById(R.id.notify);
        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getText().toString().equals("vinayak") & pass.getText().toString().equals("123456")){
                    notify.setText("Login Succesful!");
                }
                else {
                    notify.setText("Login Unsuccesful!");
                }
            }
        });

    }
}
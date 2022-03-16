package com.example.collegeandroidprograms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class UserLogin extends AppCompatActivity {

    private TextView user, pass, notify;
    private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

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
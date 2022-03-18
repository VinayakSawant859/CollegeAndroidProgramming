package com.example.collegeandroidprograms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class SocialLoginForm extends AppCompatActivity {

    private ImageView loginBTN;
    private EditText username, pw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_login_form);

        loginBTN = findViewById(R.id.loginBTN);
        username = findViewById(R.id.username);
        pw = findViewById(R.id.pw);

        loginBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (username.getText().toString().equals("vinayak") & pw.getText().toString().equals("123456"))
                {
                    Toast.makeText(SocialLoginForm.this, "Login Successful!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(SocialLoginForm.this, "Login Unsuccessful!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
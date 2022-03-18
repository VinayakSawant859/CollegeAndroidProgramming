package com.example.collegeandroidprograms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class SchoolLoginForm extends AppCompatActivity {

    private ImageView studentloginBTN;
    private EditText userName, passW;
    private CheckBox termsCB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_login_form);

        studentloginBTN = findViewById(R.id.studentloginBTN);
        userName = findViewById(R.id.userName);
        passW = findViewById(R.id.passW);
        termsCB = findViewById(R.id.termsCB);

        studentloginBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (userName.getText().toString().equals("1900020212") & passW.getText().toString().equals("vinu123") & (termsCB.isChecked()))
                {
                    Toast.makeText(SchoolLoginForm.this, "Login Successful!", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(SchoolLoginForm.this, "Login Unsuccessful!", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
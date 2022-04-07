package com.example.collegeandroidprograms;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class FactorialIntentActivity extends AppCompatActivity {

    private EditText FacInput;
    private Button factorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial_intent);

        /*TODO Practical No.18: Develop a program to implement new activity using explicit intent and implicit intent.
          Ques 3. Write a program to create two screens. First screen will take one number input from user.
          After click on Factorial button, second screen will open and it should display factorial of the same number.
          Also specify which type of intent you will use in this case.*/


        FacInput = findViewById(R.id.FactorialINPUT);
        factorial = findViewById(R.id.FactorialBTN);
        Intent intent = new Intent(FactorialIntentActivity.this, FactorialActivity.class);
        Bundle bundle = new Bundle();

        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(FacInput.getText().toString());
                Factorial(num);

            }
            private void Factorial(int num) {
                int fact =1, i;
                for (i=1; i<=num; i++)
                {
                    fact = fact*i;
                }
                bundle.putInt("ANSWER", fact);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
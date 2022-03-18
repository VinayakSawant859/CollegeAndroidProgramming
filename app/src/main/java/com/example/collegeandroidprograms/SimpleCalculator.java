package com.example.collegeandroidprograms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SimpleCalculator extends AppCompatActivity {

    private EditText firstNum, secondNum;
    private TextView ansTXT;
    private Button addBTN, subtractBTN, multiplyBTN, divideBTN, clearBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_calculator);

        firstNum = findViewById(R.id.firstNum);
        secondNum = findViewById(R.id.secondNum);
        ansTXT = findViewById(R.id.ansTXT);
        addBTN = findViewById(R.id.addBTN);
        subtractBTN = findViewById(R.id.subtractBTN);
        multiplyBTN = findViewById(R.id.multiplyBTN);
        divideBTN = findViewById(R.id.divideBTN);
        clearBTN = findViewById(R.id.clearBTN);

        //Addition
        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((firstNum.getText().length()>0) && (secondNum.getText().length()>0))
                {
                    double num1 = Double.parseDouble(firstNum.getText().toString());
                    double num2 = Double.parseDouble(secondNum.getText().toString());
                    double result = num1 + num2;
                    ansTXT.setText("ANS: "+Double.toString(result));
                }
                else
                {
                    Toast.makeText(SimpleCalculator.this, "Enter Required Numbers!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Subtraction
        subtractBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((firstNum.getText().length()>0) && (secondNum.getText().length()>0))
                {
                    double num1 = Double.parseDouble(firstNum.getText().toString());
                    double num2 = Double.parseDouble(secondNum.getText().toString());
                    double result = num1 - num2;
                    ansTXT.setText("ANS: "+Double.toString(result));
                }
                else
                {
                    Toast.makeText(SimpleCalculator.this, "Enter Required Numbers!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Multiplication
        multiplyBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((firstNum.getText().length()>0) && (secondNum.getText().length()>0))
                {
                    double num1 = Double.parseDouble(firstNum.getText().toString());
                    double num2 = Double.parseDouble(secondNum.getText().toString());
                    double result = num1 * num2;
                    ansTXT.setText("ANS: "+Double.toString(result));
                }
                else
                {
                    Toast.makeText(SimpleCalculator.this, "Enter Required Numbers!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Division
        divideBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if ((firstNum.getText().length()>0) && (secondNum.getText().length()>0))
                {
                    double num1 = Double.parseDouble(firstNum.getText().toString());
                    double num2 = Double.parseDouble(secondNum.getText().toString());
                    double result = num1 / num2;
                    ansTXT.setText("ANS: "+Double.toString(result));
                }
                else
                {
                    Toast.makeText(SimpleCalculator.this, "Enter Required Numbers!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Clear Result
        clearBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNum.setText("");
                secondNum.setText("");
                ansTXT.setText("0.0");
                firstNum.requestFocus();
            }
        });

    }
}
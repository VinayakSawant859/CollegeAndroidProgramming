//TODO Practical No. 11: Develop a program m to implement Checkbox.
//Ques 1. Write a program to show five checkboxes and toast selected checkboxes.

package com.example.collegeandroidprograms;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Prac15_2CheckBoxExample extends AppCompatActivity {

    private CheckBox pizza, coffee, burger;
    private Button orderBTN;
    StringBuffer sb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box_example);

        pizza = findViewById(R.id.pizza);
        coffee = findViewById(R.id.coffee);
        burger = findViewById(R.id.burger);
        orderBTN = findViewById(R.id.orderBTN);
        sb = new StringBuffer("Your Order:");

        orderBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (pizza.isChecked() & coffee.isChecked() & burger.isChecked()) {
                    Toast.makeText(Prac15_2CheckBoxExample.this, sb + "\nPizza: 180rs\nCoffee: 50rs\nBurger: 120rs\nYour Total: 350rs", Toast.LENGTH_LONG).show();
                }
                else if (pizza.isChecked() & coffee.isChecked()){
                    Toast.makeText(Prac15_2CheckBoxExample.this, sb + "\nPizza: 180rs\nCoffee: 50rs\nYour Total: 230rs", Toast.LENGTH_LONG).show();
                }
                else if (coffee.isChecked() & burger.isChecked()){
                    Toast.makeText(Prac15_2CheckBoxExample.this, sb + "\nCoffee: 50rs\nBurger: 120rs\nYour Total: 170rs", Toast.LENGTH_LONG).show();
                }
                else if (pizza.isChecked() & burger.isChecked()){
                    Toast.makeText(Prac15_2CheckBoxExample.this, sb + "\nPizza: 180rs\nBurger: 120rs\nYour Total: 300rs", Toast.LENGTH_LONG).show();
                }
                else if (pizza.isChecked()){
                    Toast.makeText(Prac15_2CheckBoxExample.this, sb + "\nPizza: 180rs\nYour Total: 180rs", Toast.LENGTH_LONG).show();
                }
                else if (coffee.isChecked()){
                    Toast.makeText(Prac15_2CheckBoxExample.this, sb + "\nCoffee: 50rs\nYour Total: 50rs", Toast.LENGTH_LONG).show();
                }
                else if (burger.isChecked()){
                    Toast.makeText(Prac15_2CheckBoxExample.this, sb + "\nBurger: 120rs\nYour Total: 120rs", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(Prac15_2CheckBoxExample.this, "Please Select an item!", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
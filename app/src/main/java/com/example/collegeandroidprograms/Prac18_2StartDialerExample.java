package com.example.collegeandroidprograms;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Prac18_2StartDialerExample extends AppCompatActivity {

   Button call;
   EditText phnNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_dialer_example);

        call = findViewById(R.id.call);
        phnNum = findViewById(R.id.phnNum);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Prac18_2StartDialerExample.this, "Clicked", Toast.LENGTH_SHORT).show();

                Uri u = Uri.parse("tel:"+ phnNum.getText().toString());

                Intent i = new Intent(Intent.ACTION_DIAL, u);

                try {
                    startActivity(i);
                }
                catch (SecurityException s){
                    Toast.makeText(Prac18_2StartDialerExample.this, "An error occurred", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

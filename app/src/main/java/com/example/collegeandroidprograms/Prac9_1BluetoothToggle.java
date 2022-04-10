//TODO Practical No. 9: Develop a program to implement Button, Image Button and Toggle Button.
//1. Write a program to create a toggle button to display ON / OFF Bluetooth on the display screen.

package com.example.collegeandroidprograms;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class Prac9_1BluetoothToggle extends AppCompatActivity {

    private ToggleButton bluetoothToggle;
    private ImageView blutoothIMG;
    private TextView alertBT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth_toggle);

        bluetoothToggle = findViewById(R.id.bluetoothToggle);
        alertBT = findViewById(R.id.alertBT);
        blutoothIMG = findViewById(R.id.blutoothIMG);

        bluetoothToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (bluetoothToggle.isChecked() == false) {
                    alertBT.setText(" Bluetooth is disabled ");
                    blutoothIMG.setBackgroundResource(R.drawable.bluetoothoff);
                }
                else if (bluetoothToggle.isChecked() == true){
                    alertBT.setText(" Bluetooth is enabled ");
                    blutoothIMG.setBackgroundResource(R.drawable.bluetooth);
                }
            }
        });
    }
}
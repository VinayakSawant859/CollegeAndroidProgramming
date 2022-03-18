package com.example.collegeandroidprograms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class BluetoothToggle extends AppCompatActivity {

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
//TODO Practical No. 24: Develop a program for providing Bluetooth connectivity.
//Ques 1. Write a program to turn on, get visible, list devices and turnoff Bluetooth with the help of following GUI.

package com.example.collegeandroidprograms;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Set;

public class Prac24BluetoothAdminExample extends AppCompatActivity {

    Button b1, b2, b3, b4;
    private BluetoothAdapter BA;
    private Set<BluetoothDevice>pairedDevices;
    ListView lv;
    ImageView blueIMG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth_admin_example);

        //Practical No. 24: Develop a program for providing Bluetooth connectivity.
        //Ques 1. Write a program to turn on, get visible, list devices and turnoff Bluetooth with the help of following GUI.

        b1 = findViewById(R.id.turnON);
        b2 = findViewById(R.id.turnOFF);
        b3 = findViewById(R.id.getVISIBLE);
        b4 = findViewById(R.id.listDEVICES);
        blueIMG = findViewById(R.id.blueIMG);

        BA = BluetoothAdapter.getDefaultAdapter();
        lv = findViewById(R.id.pairedLIST);
    }

    @SuppressLint("MissingPermission")
    public void ON(View view){
        if (!BA.isEnabled()){
            Intent turnOn = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(turnOn, 0);
            Toast.makeText(this, "Turned ON", Toast.LENGTH_SHORT).show();
            blueIMG.setBackgroundResource(R.drawable.bluetooth);
        }
        else {
            Toast.makeText(this, "Already ON", Toast.LENGTH_SHORT).show();
            blueIMG.setBackgroundResource(R.drawable.bluetooth);
        }
    }

    @SuppressLint("MissingPermission")
    public void OFF(View view){
        BA.disable();
        Toast.makeText(this, "Turned OFF", Toast.LENGTH_SHORT).show();
        blueIMG.setBackgroundResource(R.drawable.bluetoothoff);
    }

    @SuppressLint("MissingPermission")
    public void visible(View view){
        Intent getVisible = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
        startActivityForResult(getVisible, 0);
    }

    @SuppressLint("MissingPermission")
    public void list(View view){
        pairedDevices = BA.getBondedDevices();

        ArrayList list = new ArrayList();

        for (BluetoothDevice bt : pairedDevices) list.add(bt.getName());
        Toast.makeText(this, "Showing Paired Devices", Toast.LENGTH_SHORT).show();

        final ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        lv.setAdapter(adapter);
    }
}
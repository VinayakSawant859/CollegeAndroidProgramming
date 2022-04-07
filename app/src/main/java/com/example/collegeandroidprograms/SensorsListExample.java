package com.example.collegeandroidprograms;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class SensorsListExample extends AppCompatActivity {

    SensorManager sm;
    List<Sensor> sensors;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensors_list_example);

        sm = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        lv = findViewById(R.id.listVIEW);
        sensors = sm.getSensorList(Sensor.TYPE_ALL);
        lv.setAdapter(new ArrayAdapter<Sensor>(this, android.R.layout.simple_list_item_1, sensors));
    }
}
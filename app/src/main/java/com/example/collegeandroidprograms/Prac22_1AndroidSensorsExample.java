//TODO Practical No. 22: Develop a program to implement sensors.
//Ques 1. Write a program to changes the background color when device is shuffled.

package com.example.collegeandroidprograms;

import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Prac22_1AndroidSensorsExample extends AppCompatActivity implements SensorEventListener {

    private SensorManager sensorManager;
    private boolean isColor = false;
    private View view, shakeVIEW;
    private long lastUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_sensors_example);

        view = findViewById(R.id.shakeTV);
        shakeVIEW = findViewById(R.id.shakeVIEW);
        view.setBackgroundColor(Color.WHITE);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        lastUpdate = System.currentTimeMillis();
    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == Sensor.TYPE_ACCELEROMETER){
            getAccelerometer(sensorEvent);
        }
    }

    private void getAccelerometer(SensorEvent sensorEvent) {
        float[] values = sensorEvent.values;

        float x = values[0];
        float y = values[1];
        float z = values[2];

        float accelarationSquareRoot = (x*x+y*y+z*z)/(SensorManager.GRAVITY_EARTH*SensorManager.GRAVITY_EARTH);

        long actualTime = System.currentTimeMillis();
//        Toast.makeText(this, String.valueOf(accelarationSquareRoot)+" "+SensorManager.GRAVITY_EARTH, Toast.LENGTH_SHORT).show();

        if (accelarationSquareRoot>=2) {
            if (actualTime - lastUpdate < 200) {
                return;
            }
            lastUpdate = actualTime;
            if (isColor) {
                view.setBackgroundResource(R.color.transparent);
                shakeVIEW.setBackgroundColor(Color.RED);
            } else {
                view.setBackgroundResource(R.color.transparent);
                shakeVIEW.setBackgroundColor(Color.GREEN);
            }
            isColor = !isColor;
        }
    }

    @Override
    protected void onResume(){
        super.onResume();

        sensorManager.registerListener(this, sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),SensorManager.SENSOR_DELAY_GAME);
    }
    @Override
    protected void onPause(){
        super.onPause();

        sensorManager.unregisterListener(this);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {}
}
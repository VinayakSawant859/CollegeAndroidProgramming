package com.example.collegeandroidprograms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class WiFiServiceToggle extends AppCompatActivity {

    private ToggleButton wifiToggle;
    private ImageView wifiIMG;
    private TextView alertWIFI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wi_fi_service_toggle);

        wifiToggle = findViewById(R.id.wifiToggle);
        alertWIFI = findViewById(R.id.alertWIFI);
        wifiIMG = findViewById(R.id.wifiIMG);
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);

        wifiToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (wifiToggle.isChecked() == false) {
                    alertWIFI.setText(" WiFi is disabled ");
                    wifiIMG.setBackgroundResource(R.drawable.wifioff);
                    wifiManager.setWifiEnabled(false);
                }
                else if (wifiToggle.isChecked() == true){
                    alertWIFI.setText(" WiFi is enabled ");
                    wifiIMG.setBackgroundResource(R.drawable.wifion);
                    wifiManager.setWifiEnabled(true);
                }
            }
        });
    }
}
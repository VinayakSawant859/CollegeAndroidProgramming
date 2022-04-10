package com.example.collegeandroidprograms;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class Prac16_2DateViewInEditText extends AppCompatActivity implements DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener{

    private Button setDATE, setTIME;
    private EditText selectDATE, selectTIME;
    int day, month, year, hour, minute;
    int myday, myMonth, myYear, myHour, myMinute;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_view_in_edit_text);

        selectDATE = findViewById(R.id.selectDATE);
        selectTIME = findViewById(R.id.selectTIME);
        setDATE = findViewById(R.id.setDATE);
        setTIME = findViewById(R.id.setTIME);

        setDATE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                year = calendar.get(Calendar.YEAR);
                month = calendar.get(Calendar.MONTH);
                day = calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog datePickerDialog = new DatePickerDialog(Prac16_2DateViewInEditText.this, Prac16_2DateViewInEditText.this,year, month,day);
                datePickerDialog.show();
            }
        });

        setTIME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                hour = calendar.get(Calendar.HOUR);
                minute = calendar.get(Calendar.MINUTE);
                TimePickerDialog timePickerDialog = new TimePickerDialog(Prac16_2DateViewInEditText.this, Prac16_2DateViewInEditText.this, hour, minute, DateFormat.is24HourFormat(Prac16_2DateViewInEditText.this));
                timePickerDialog.show();
            }
        });
    }
    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        myYear = year;
        myday = day;
        myMonth = month;
        selectDATE.setText(myday +"/"+ myMonth +"/"+ myYear);
    }
    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        myHour = hourOfDay;
        myMinute = minute;
        selectTIME.setText(myHour+":"+myMinute);
    }
}
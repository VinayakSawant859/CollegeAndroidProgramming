package com.example.collegeandroidprograms;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;

public class MainPage2 extends AppCompatActivity {

    private TextView thanks, authorINFO;
    private ImageView thanksIMG;

    private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_MAX_OFF_PATH = 250;
    private static final int SWIPE_THRESHOLD_VELOCITY = 200;
    private GestureDetector gesture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world2);

        ButterKnife.bind(this);

        gesture = new GestureDetector( this, new MainPage2.SwipeDetector());
        thanks = findViewById(R.id.thanks);
        authorINFO = findViewById(R.id.authorINFO);
        thanksIMG = findViewById(R.id.thanksIMG);

        Button prac21 = findViewById(R.id.prac21);
        Button prac22_1 = findViewById(R.id.prac22_1);
        Button prac22_2 = findViewById(R.id.prac22_2);
        Button prac23_1 = findViewById(R.id.prac23_1);
        Button prac23_2 = findViewById(R.id.prac23_2);
        Button prac24 = findViewById(R.id.prac24);
        Button prac25 = findViewById(R.id.prac25);
        Button prac26 = findViewById(R.id.prac26);
        Button prac27 = findViewById(R.id.prac27);
        Button prac28 = findViewById(R.id.prac28);
        Button prac29 = findViewById(R.id.prac29);
        Button prac30 = findViewById(R.id.prac30);
        Button prac31_1 = findViewById(R.id.prac31_1);
        Button prac31_2 = findViewById(R.id.prac31_2);


        prac21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac21BroadcastReceiverExample.class));
            }
        });

        prac22_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac22_1AndroidSensorsExample.class));
            }
        });

        prac22_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac22_2SensorsListExample.class));
            }
        });

        prac23_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac23_1CameraCaptureExample.class));
            }
        });

        prac23_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac23_2VideoRecordingExample.class));
            }
        });

        prac24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac24BluetoothAdminExample.class));
            }
        });

        prac25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac25AnimationExample.class));
            }
        });

        prac26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac26SQLiteAsyncTaskExample.class));
            }
        });

        prac27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac27LoginAndRegisterUsingSQLIte.class));
            }
        });

        prac28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac28_LoginActivityWithValidation.class));
            }
        });

        prac29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac29SMSManagerExample.class));
            }
        });

        prac30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac30EmailClientExample.class));
            }
        });

        prac31_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac31_Part1_UserLocationExample.class));
            }
        });

        prac31_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage2.this, Prac31_Part2_RoutingMapExample.class));
            }
        });

        thanks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                authorINFO.setText("Developer: Vinayak Suresh Sawant\n" +
                                    "Course: Information Technology\n" +
                                    "MH Saboo Siddik Polytechnic");
                thanksIMG.setImageResource(R.drawable.namaste);
            }
        });
    }

    private class SwipeDetector implements GestureDetector.OnGestureListener {
        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY)
        {

            // Check movement along the Y-axis. If it exceeds SWIPE_MAX_OFF_PATH,
            // then dismiss the swipe.
            if (Math.abs(e1.getY() - e2.getY()) > SWIPE_MAX_OFF_PATH)
            {
                return false;
            }

            //toast( "start = "+String.valueOf( e1.getX() )+" | end = "+String.valueOf( e2.getX() )  );
            //from left to right
            if( e2.getX() > e1.getX() )
            {
                if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY)
                {
                    onSwipeRight();
                    return true;
                }
            }

            if( e1.getX() > e2.getX() )
            {
                if (e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY)
                {
                    onSwipeLeft();
                    return true;
                }
            }

            return false;
        }

        private void onSwipeRight() {
            startActivity(new Intent(MainPage2.this, MainPage1.class));
        }

        private void onSwipeLeft() {}

        @Override
        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        @Override
        public void onShowPress(MotionEvent motionEvent) {}

        @Override
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }

        @Override
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
            return false;
        }

        @Override
        public void onLongPress(MotionEvent motionEvent) {}
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev)
    {
        // TouchEvent dispatcher.
        if (gesture != null)
        {
            if (gesture.onTouchEvent(ev))
                // If the gestureDetector handles the event, a swipe has been
                // executed and no more needs to be done.
                return true;
        }

        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        return gesture.onTouchEvent(event);
    }
}

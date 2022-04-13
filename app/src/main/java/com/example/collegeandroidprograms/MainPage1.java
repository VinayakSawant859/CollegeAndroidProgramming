package com.example.collegeandroidprograms;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainPage1 extends AppCompatActivity {

    Animation helloworld, fadein;
    private TextView TxtV, TxtV2;

    private static final int SWIPE_MIN_DISTANCE = 120;
    private static final int SWIPE_MAX_OFF_PATH = 250;
    private static final int SWIPE_THRESHOLD_VELOCITY = 200;
    private GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gestureDetector = new GestureDetector( this, new SwipeDetector());
        TxtV = findViewById(R.id.TxtV);
        TxtV2 = findViewById(R.id.txtV2);
        helloworld = AnimationUtils.loadAnimation(this, R.anim.helloworld);
        fadein = AnimationUtils.loadAnimation(this, R.anim.fadein);
        TxtV.startAnimation(fadein);

        Button prac4_2 = (Button) findViewById(R.id.prac4_2);
        Button prac5_1 = (Button) findViewById(R.id.prac5_1);
        Button prac5_2 = (Button) findViewById(R.id.prac5_2);
        Button prac6_1 = (Button) findViewById(R.id.prac6_1);
        Button prac6_2 = (Button) findViewById(R.id.prac6_2);
        Button prac7_1 = (Button) findViewById(R.id.prac7_1);
        Button prac7_2 = (Button) findViewById(R.id.prac7_2);
        Button prac8_1 = (Button) findViewById(R.id.prac8_1);
        Button prac8_2 = (Button) findViewById(R.id.prac8_2);
        Button prac9_1 = (Button) findViewById(R.id.prac9_1);
        Button prac9_2 = (Button) findViewById(R.id.prac9_2);
        Button prac10_1 = (Button) findViewById(R.id.prac10_1);
        Button prac10_2 = (Button) findViewById(R.id.prac10_2);
        Button prac11   = (Button) findViewById(R.id.prac11);
        Button prac12   = (Button) findViewById(R.id.prac12);
        Button prac13_1 = (Button) findViewById(R.id.prac13_1);
        Button prac13_2 = (Button) findViewById(R.id.prac13_2);
        Button prac14_1 = (Button) findViewById(R.id.prac14_1);
        Button prac14_2 = (Button) findViewById(R.id.prac14_2);
        Button prac14_3 = (Button) findViewById(R.id.prac14_3);
        Button prac14_4 = (Button) findViewById(R.id.prac14_4);
        Button prac15_1 = (Button) findViewById(R.id.prac15_1);
        Button prac15_2 = (Button) findViewById(R.id.prac15_2);
        Button prac16_1 = (Button) findViewById(R.id.prac16_1);
        Button prac16_2 = (Button) findViewById(R.id.prac16_2);
        Button prac17 = (Button) findViewById(R.id.prac17);
        Button prac18_1 = (Button) findViewById(R.id.prac18_1);
        Button prac18_2 = (Button) findViewById(R.id.prac18_2);
        Button prac18_3 = (Button) findViewById(R.id.prac18_3);
        Button prac19 = (Button) findViewById(R.id.prac19);
        Button prac20_1 = (Button) findViewById(R.id.prac20_1);
        Button prac20_2 = (Button) findViewById(R.id.prac20_2);


        prac4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac4_2StudentName.class));
            }
        });

        prac5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac5_1LinearLayout.class));
            }
        });

        prac5_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac5_2AbsoluteLayout.class));
            }
        });

        prac6_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac6_1TableLayout.class));
            }
        });

        prac6_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac6_2FrameLayout.class));
            }
        });

        prac7_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac7_1UserLogin.class));
            }
        });

        prac7_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac7_2PersonalInfo.class));
            }
        });

        prac8_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac8_1AutoCompleteTxtView.class));
            }
        });

        prac8_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac8_2SixthSemSubjects.class));
            }
        });

        prac9_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac9_1BluetoothToggle.class));
            }
        });

        prac9_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac9_2SimpleCalculator.class));
            }
        });

        prac10_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac10_1SocialLoginForm.class));
            }
        });

        prac10_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac10_2SchoolLoginForm.class));
            }
        });

        prac11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac11FiveCheckBoxes.class));
            }
        });

        prac12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac12RadioButton.class));
            }
        });

        prac13_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac13_1CircularProgressBar.class));
            }
        });

        prac13_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac13_2HorizonatalProgressBar.class));
            }
        });

        prac14_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac14_1ListViewUsingArrayAdpt.class));
            }
        });

        prac14_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac14_2ImageViewExample.class));
            }
        });

        prac14_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac14_3GridViewExample.class));
            }
        });

        prac14_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac14_4ScrollViewExample.class));
            }
        });

        prac15_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac15_1ToastExample.class));
            }
        });

        prac15_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac15_2CheckBoxExample.class));
            }
        });

        prac16_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac16_1DateAndTimeExample.class));
            }
        });

        prac16_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac16_2DateViewInEditText.class));
            }
        });

        prac17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac17ActivityLifeCycle.class));
            }
        });

        prac18_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac18_1WebViewNavigate.class));
            }
        });

        prac18_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac18_2StartDialerExample.class));
            }
        });

        prac18_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac18_3FactorialIntentActivity.class));
            }
        });

        prac19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac19ContentProviderExample.class));
            }
        });

        prac20_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac20_1WiFiServiceToggle.class));
            }
        });

        prac20_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainPage1.this, Prac20_2CustomServiceExample.class));
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
        }

        private void onSwipeLeft() {
            startActivity(new Intent(MainPage1.this, MainPage2.class));
        }

        @Override
        public boolean onDown(MotionEvent motionEvent) {
            return false;
        }

        @Override
        public void onShowPress(MotionEvent motionEvent) {
        }

        @Override
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }

        @Override
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent1, float v, float v1) {
            return false;
        }

        @Override
        public void onLongPress(MotionEvent motionEvent) {
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev)
    {
        // TouchEvent dispatcher.
        if (gestureDetector != null)
        {
            if (gestureDetector.onTouchEvent(ev))
                // If the gestureDetector handles the event, a swipe has been
                // executed and no more needs to be done.
                return true;
        }

        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        return gestureDetector.onTouchEvent(event);
    }
    }

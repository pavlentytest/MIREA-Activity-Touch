package ru.samsung.itschool.mdev.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout cr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("RRRRR","onCreate()");
        cr = findViewById(R.id.root);
        cr.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
              //  if (event.getAction() == MotionEvent.ACTION_DOWN

                cr.setBackgroundColor(Color.RED);
                return true;
            }
        });
    }

   /* @Override
    public boolean onTouch(View v, MotionEvent event) {
        cr.setBackgroundColor(Color.RED);
        return true;
    }*/

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("RRRRR","onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("RRRRR","onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("RRRRR","onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("RRRRR","onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("RRRRR","onResume()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("RRRRR","onRestart()");
    }


}
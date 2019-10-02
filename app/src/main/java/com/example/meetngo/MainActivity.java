package com.example.meetngo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent i1 = new Intent(this, login.class);
        final TextView lc = findViewById(R.id.letzchill);
        lc.setClickable(true);
        lc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i1);
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                lc.performClick();
            }
        }, 1500);

    }
}

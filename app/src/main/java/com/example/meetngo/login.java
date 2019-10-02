package com.example.meetngo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final Intent i2 = new Intent(this, freeness.class);
        final Intent i3 = new Intent(this, forgotpassword.class);
        final Intent i4 = new Intent(this, createaccount.class);
        Button submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i2);
            }
        });

        TextView fp = findViewById(R.id.fp);
        fp.setClickable(true);
        fp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i3);
            }
        });

        TextView ca = findViewById(R.id.ca);
        ca.setClickable(true);
        ca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i4);
            }
        });


    }
}

package com.example.notificationcounterupdated;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3;
    TextView number;
    notificationcount notificationcount;  // object of notificationcount class

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.increment);
        b2 = findViewById(R.id.decrement);
        b3 = findViewById(R.id.reset);
        notificationcount = new notificationcount(findViewById(R.id.textView));

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notificationcount.increament();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notificationcount.decrement();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notificationcount.reset();
            }
        });


        }
    }

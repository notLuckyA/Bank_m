package com.example.bank;


import java.time.LocalTime;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class Otdel extends AppCompatActivity {
    TextView rabota1;
    TextView rabota2;
    TextView time1;
    TextView time2;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otdel);
        rabota1 = (TextView) findViewById(R.id.rabota1);
        rabota2 = (TextView) findViewById(R.id.rabota2);
        time1 = (TextView) findViewById(R.id.time1);
        time2 = (TextView) findViewById(R.id.time2);
        LocalTime n1 = LocalTime.of(00, 00);
        LocalTime n2 = LocalTime.of(8, 00);
        LocalTime k1 = LocalTime.of(00, 00);
        LocalTime k2 = LocalTime.of(18, 00);
        LocalTime now = LocalTime.now();
        time1.setText("Часы работы  " + n1 + "-" + k1);
        time2.setText("Часы работы  " + n2 + "-" + k2);
        boolean t1 = now.isBefore(k1);
        if (t1 = true) {
            rabota1.setTextColor(Color.GREEN);
            rabota1.setText("Работает");
        } else {
            rabota1.setTextColor(Color.RED);
            rabota1.setText("Не работает");
        }
        boolean t2 = now.isBefore(k2);
        if (t1 = true) {
            rabota2.setTextColor(Color.GREEN);
            rabota2.setText("Работает");
        } else {
            rabota2.setTextColor(Color.RED);
            rabota2.setText("Не работает");
        }
    }
}
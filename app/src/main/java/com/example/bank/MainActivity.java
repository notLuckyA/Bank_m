package com.example.bank;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView kurs;
    Button otd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kurs = (TextView) findViewById(R.id.kurs);
        otd = (Button) findViewById(R.id.otd);
        Date currentDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
        String dateText = dateFormat.format(currentDate);
        kurs.setText("Курс валют\n" + "                                                 " + dateText + "\n\nUSD:79,10                                EUR:92,74");
        otd.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        i = new Intent(this, Otdel.class);
        startActivity(i);
    }
}
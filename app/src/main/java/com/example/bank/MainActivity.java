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
    Button vhod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kurs = (TextView) findViewById(R.id.kurs);
        otd = (Button) findViewById(R.id.otd);
        vhod = (Button) findViewById(R.id.vhod);

        Date currentDate = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
        String dateText = dateFormat.format(currentDate);
        kurs.setText("Курс валют на:\n" + "                                                 " + dateText + "\n\nUSD:79,10                                EUR:92,74");
        otd.setOnClickListener(this);
        kurs.setOnClickListener(this);
        vhod.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.otd:
                Intent o;
                o = new Intent(this, Otdel.class);
                startActivity(o);
                break;
            case R.id.kurs:
                Intent k;
                k = new Intent(this, Kurs.class);
                startActivity(k);
                break;
            case R.id.vhod: openDialog();
                break;
        }
    }
    public void openDialog() {
        Dialog dialog = new Dialog();
        dialog.show(getSupportFragmentManager(), "dialog");
    }

}

package com.pemrogramanbergerak.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView hasiljumlah;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        hasiljumlah = findViewById(R.id.edittext2);

        Intent intent = getIntent();

        int hasil2 = intent.getIntExtra("hasilmain",0);

        hasiljumlah.setText(Integer.toString(hasil2));
    }
}
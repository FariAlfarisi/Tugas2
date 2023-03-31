package com.pemrogramanbergerak.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText data1, data2;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data1 = findViewById(R.id.textbutton1);
        data2 = findViewById(R.id.textbutton2);
        send = findViewById(R.id.sendbutton);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int A = Integer.parseInt(data1.getText().toString());
                int B = Integer.parseInt(data2.getText().toString());
                int hasil = A + B;

                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("hasilmain", hasil);
                startActivity(intent);
            }
        });
    }
}





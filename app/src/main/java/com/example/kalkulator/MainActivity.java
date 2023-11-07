package com.example.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView hasil = findViewById(R.id.hasil);
        EditText input1 = findViewById(R.id.input1);
        EditText input2 = findViewById(R.id.input2);
        Button tambah = findViewById(R.id.tambah);
        Button kurang = findViewById(R.id.kurang);
        Button kali = findViewById(R.id.kali);
        Button bagi = findViewById(R.id.bagi);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jumlah = "";
                if (v.getId() == tambah.getId()){
                    Double x = Double.parseDouble(input1.getText().toString());
                    Double y = Double.parseDouble(input2.getText().toString());
                    Double z = x + y;

                    jumlah = String.valueOf(z);
                    hasil.setText(jumlah);
                }
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mines = "";
                if (v.getId() == kurang.getId()){
                    Double x = Double.parseDouble(input1.getText().toString());
                    Double y = Double.parseDouble(input2.getText().toString());
                    Double z = x - y;

                    mines = String.valueOf(z);
                    hasil.setText(mines);
                }
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String kalikan = "";
                if (v.getId() == kali.getId()){
                    Double x = Double.parseDouble(input1.getText().toString());
                    Double y = Double.parseDouble(input2.getText().toString());
                    Double z = x * y;

                    kalikan = String.valueOf(z);
                    hasil.setText(kalikan);
                }
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String bagikan = "";
                if (v.getId() == bagi.getId()){
                    Double x = Double.parseDouble(input1.getText().toString());
                    Double y = Double.parseDouble(input2.getText().toString());
                    Double z = x / y;

                    bagikan = String.valueOf(z);
                    hasil.setText(bagikan);
                }
            }
        });
    }
}
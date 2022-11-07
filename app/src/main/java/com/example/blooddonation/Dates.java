package com.example.blooddonation;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Dates extends AppCompatActivity {
Button d1,d2,d3,d8,d9,d10;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_dates );
        d1=findViewById(R.id.d1);
        d2=findViewById(R.id.d2);
        d3=findViewById(R.id.d3);
        d10=findViewById(R.id.d10);
        d9=findViewById(R.id.d9);
        d8=findViewById(R.id.d8);


        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end("1مساء");

            }
        });
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end("2مساء");
            }
        });
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end("3مساء");
            }
        });
        d10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end("10 صباحا");
            }
        });
        d9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end("9 صباحا");
            }
        });
        d8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end("8 صباحا");
            }
        });


    }

    private void end(String s) {

                        Intent i = new Intent(Dates.this,End.class);
                        startActivity(i);


    }

}
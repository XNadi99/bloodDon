package com.example.blooddonation;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;



public class TypesOfBlood extends AppCompatActivity {
    CardView a1,a2,b1,b2,o1,o2,ab1,ab2;


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_types_of_blood );
        a1=findViewById(R.id.a1);
        b1=findViewById(R.id.b1);
        ab1=findViewById(R.id.ab1);
        o1=findViewById(R.id.o1);
        a2=findViewById(R.id.a2);
        b2=findViewById(R.id.b2);
        ab2=findViewById(R.id.ab2);
        o2=findViewById(R.id.o2);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                typeblod("A+");

            }
        });
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                typeblod("A-");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                typeblod("B+");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                typeblod("B-");
            }
        });
        ab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                typeblod("AB+");
            }
        });
        ab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                typeblod("AB-");
            }
        });
        o1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                typeblod("O+");
            }
        });
        o2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                typeblod("O-");
            }
        });

    }

    private void typeblod(String s) {

                        Intent i = new Intent(TypesOfBlood.this,Dates.class);
                        startActivity(i);

    }

}
package com.example.blooddonation;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class data extends AppCompatActivity {
    private static String emailID;
    TextView name,phon,id,age,hay,bloodtype,type,mos,date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);
        name=findViewById(R.id.textView4);
        phon=findViewById(R.id.textView5);
        id=findViewById(R.id.textView6);
        age=findViewById(R.id.textView7);
        hay=findViewById(R.id.textView9);
        bloodtype=findViewById(R.id.textView10);
        type=findViewById(R.id.textView11);
        mos=findViewById(R.id.textView12);
        date=findViewById(R.id.textView13);
         BottomNavigationView bottomNavigationView = findViewById(R.id.bn);
        bottomNavigationView.setSelectedItemId(R.id.Profile);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        item.setChecked(true);
                        Intent i = new Intent(data.this,HospitalOrUser.class);
                        startActivity(i);
                        break;
                    case R.id.contactus:
                        item.setChecked(true);
                        LayoutInflater inflater = LayoutInflater.from(data.this);
                        View view = inflater.inflate(R.layout.contactus, null);
                        AlertDialog alertDialog = new AlertDialog.Builder(data.this)
                                .setView(view)
                                .create();
                        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        alertDialog.show();
                        break;

                    case R.id.aboutus:
                        item.setChecked(true);
                        LayoutInflater inflaterr = LayoutInflater.from(data.this);
                        View vieww = inflaterr.inflate(R.layout.aboutus, null);
                        AlertDialog alertDialogg = new AlertDialog.Builder(data.this)
                                .setView(vieww)
                                .create();
                        alertDialogg.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        alertDialogg.show();
                        break;
                    case R.id.Profile:
                        item.setChecked(true);
                        break;
                }
                return false;
            }


        });


    }
}
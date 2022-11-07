package com.example.blooddonation;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HospitalOrUser extends AppCompatActivity {

    Button mot,most;
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_hospital_or_user );
        mot=findViewById(R.id.mot);
        most=findViewById(R.id.most);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bn);
        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        item.setChecked(true);

                        break;
                    case R.id.contactus:
                        item.setChecked(true);
                        LayoutInflater inflater = LayoutInflater.from(HospitalOrUser.this);
                        View view = inflater.inflate(R.layout.contactus, null);
                        AlertDialog alertDialog = new AlertDialog.Builder(HospitalOrUser.this)
                                .setView(view)
                                .create();
                        alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        alertDialog.show();
                        break;

                    case R.id.aboutus:
                        item.setChecked(true);
                        LayoutInflater inflaterr = LayoutInflater.from(HospitalOrUser.this);
                        View vieww = inflaterr.inflate(R.layout.aboutus, null);
                        AlertDialog alertDialogg = new AlertDialog.Builder(HospitalOrUser.this)
                                .setView(vieww)
                                .create();
                        alertDialogg.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        alertDialogg.show();
                        break;
                    case R.id.Profile:
                        item.setChecked(true);
                        Intent i = new Intent(HospitalOrUser.this,data.class);
                        startActivity(i);
                        break;
                }
                return false;
            }


        });
        mot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HospitalOrUser.this,UserState.class);
                startActivity(i);
                finish();

            }
        });
        most.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(HospitalOrUser.this,Hospitals.class);
                startActivity(i);
                finish();
            }
        });
    }
}
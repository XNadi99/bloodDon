package com.example.blooddonation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        getSupportActionBar().hide();
        Button callUs = findViewById(R.id.callUs);
        Button about = findViewById(R.id.button2);
        Button Workhour = findViewById(R.id.button3);
        Button b4 = findViewById(R.id.button5);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBack = new Intent( Home.this,HospitalOrUser.class );
                startActivity(intentBack);
            }
        });
        callUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Tele = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("tel:966500000000"));
                startActivity(Tele);
            }
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBack = new Intent( Home.this,About.class );
                startActivity(intentBack);
            }
        });
        Workhour.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Intent intentWHours = new Intent( Home.this,WorkHours.class );
                startActivity(intentWHours);
                return false;
            }
        });
        Workhour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Home.this, "Please press and hold the button",
                        Toast.LENGTH_LONG).show();
            }
        });

    }
}
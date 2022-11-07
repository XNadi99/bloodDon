package com.example.blooddonation;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;



public class UserState extends AppCompatActivity {

    Button  mota,mohtaj;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_user_state );
        mota=findViewById(R.id.motab);
        mohtaj=findViewById(R.id.mohta);
        mota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserState.this,TypesOfBlood.class);
                startActivity(i);
            }
        });
        mohtaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserState.this,TypesOfBlood.class);
                startActivity(i);
            }
        });


    }
}
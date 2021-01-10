package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle b1 = getIntent().getExtras();

        ImageView opriting= findViewById(R.id.imageView);
        ImageView code= findViewById(R.id.imageView2);
        ImageView embedded= findViewById(R.id.imageView8);
        ImageView digital= findViewById(R.id.imageView4);
        ImageView architecuter= findViewById(R.id.imageView5);
        ImageView data= findViewById(R.id.imageView6);
        ImageView network= findViewById(R.id.imageView7);

        code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(i);
            }
        });

        opriting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity2.this,MainActivity4.class);
                startActivity(i);
            }
        });

        embedded.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity2.this,MainActivity5.class);
                startActivity(i);
            }
        });

    }
}
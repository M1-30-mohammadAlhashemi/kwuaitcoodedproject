package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

Button b=findViewById(R.id.button2);

b.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse( "https://www.tutorialspoint.com/embedded_systems/es_overview.htm" ) );

        startActivity( browse );
    }
});

    }






}
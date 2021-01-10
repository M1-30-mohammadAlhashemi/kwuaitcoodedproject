package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle b = getIntent().getExtras();

        TextView command = findViewById(R.id.textView2);
        TextView command1 = findViewById(R.id.textView11);
       TextView command2 = findViewById(R.id.textView12);
        code p = (code) b.getSerializable("code");
        ImageView Img = findViewById(R.id.imageView2);
        TextView name = findViewById(R.id.textView);

        Img.setImageResource(p.getImg());
        name.setText(p.getName());
        command.setText(p.getImportantCommand());
       command1.setText(p.getImportantCommand1());
      command2.setText(p.getImportantCommand2());


    }
}
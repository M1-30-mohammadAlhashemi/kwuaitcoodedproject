package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        ArrayList<code> cop= new ArrayList<>();
        code cpp= new code("c++","Game Developer is one of important uses of c++ language","loop","function","object oriented programming",R.drawable.cpp);
        code java= new code("java","Android Applection is one of important uses of java language","print output","if-else statement","class",R.drawable.ja);
        code python= new code("python","Machine Learning is one of important uses of python language","loop","function","class",R.drawable.python);
        code c= new code("c","Game Developer is one of important uses of c language","print output","loop","class",R.drawable.c);


        cop.add(cpp);
        cop.add(java);
        cop.add(python);
        cop.add(c);


        RecyclerView gamelist=findViewById(R.id.rv);
        gamelist.setHasFixedSize(true);
        RecyclerView.LayoutManager lm =new LinearLayoutManager(this);
        gamelist.setLayoutManager(lm);

        codeAdapter code =new codeAdapter( cop,MainActivity3.this);
        gamelist.setAdapter(code);

        codeAdapter coded =new codeAdapter(cop,MainActivity3.this);
        gamelist.setAdapter(coded);

    }
}
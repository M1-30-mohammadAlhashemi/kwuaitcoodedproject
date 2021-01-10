package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);



        ViewPager vp1 = findViewById(R.id.vp);
        TabLayout tl = findViewById(R.id.tap);
        tl.setupWithViewPager(vp1);

        fragmentAdabter adapt = new fragmentAdabter(getSupportFragmentManager());
        vp1.setAdapter(adapt);

        tl.getTabAt(1).setIcon(R.drawable.windows);
        tl.getTabAt(0).setIcon(R.drawable.unix);
        tl.getTabAt(2).setIcon(R.drawable.ios);



    }
}
package com.example.riteshdesai.yeowui.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.riteshdesai.yeowui.R;
import com.example.riteshdesai.yeowui.Fragments.ThreeFragment;
import com.example.riteshdesai.yeowui.Fragments.TwoFragment;
import com.example.riteshdesai.yeowui.Fragments.ViewPagerAdapter;
import com.example.riteshdesai.yeowui.Fragments.oneFragment;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);


        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);



    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new oneFragment(), "HOME");
        adapter.addFragment(new TwoFragment(), "QUICK TEST");
        adapter.addFragment(new ThreeFragment(), "HISTORY");
        viewPager.setAdapter(adapter);
    }



}

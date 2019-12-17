package com.yagya.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

import adapter.ViewPagerAdapter;
import fragments.FirstFragment;
import fragments.SecondFragment;

public class ViewPagerActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        viewPager=findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabId);

        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));
        ViewPagerAdapter viewPagerAdapter= new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new FirstFragment(),"Sum");
        viewPagerAdapter.addFragment(new SecondFragment(), "Area of Circle");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}

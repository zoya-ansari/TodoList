package com.example.zoya.todolist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class FinishActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ArrayList<Fragment> list = new ArrayList<Fragment>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        /*SectionsPagerAdapter adapter = new SectionsPagerAdapter(getSupportFragmentManager());

        viewPager = (ViewPager)findViewById(R.id.finish_activity_viewPager);
        list.add(new OneFragment());
        list.add(new TwoFragment());

        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(0);*/
    }
}

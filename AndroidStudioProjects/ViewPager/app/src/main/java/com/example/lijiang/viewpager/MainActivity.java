package com.example.lijiang.viewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private FragmentPagerAdapter mFragmentPagerAdapter;
    private List<Fragment> mFragmentList;
    private List<String> mTitleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        mFragmentList = new ArrayList<>();
        for (int i = 0;i < 10;i++){
            MyFragment myFragment = new MyFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("time",i);
            myFragment.setArguments(bundle);
            mFragmentList.add(myFragment);
        }
        mTitleList = new ArrayList<>();
        for (int i = 0;i < 10;i++){
            mTitleList.add("Tab"+i);
        }
        mFragmentPagerAdapter = new MyFragmentPagerAdapter(getSupportFragmentManager(),mFragmentList,mTitleList);
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        mViewPager.setAdapter(mFragmentPagerAdapter);
        mTabLayout = (TabLayout) findViewById(R.id.top_tabs);
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        mTabLayout.setupWithViewPager(mViewPager);
    }
}

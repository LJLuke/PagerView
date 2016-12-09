package com.example.lijiang.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by lijiang on 2016/12/7.
 */
public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    private List<String> mTitleList;
    private List<Fragment> mFragmentList;

    public MyFragmentPagerAdapter(FragmentManager fragmentManager,List<Fragment> fragments,List<String> titleList){
        super(fragmentManager);
        this.mFragmentList = fragments;
        this.mTitleList = titleList;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mTitleList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitleList.get(position);
    }
}

package com.example.lijiang.viewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by lijiang on 2016/12/6.
 */
public class MyFragment extends android.support.v4.app.Fragment {
    private View mView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.item, container, false);
        return mView;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView textView = (TextView) view.findViewById(R.id.item_view);
        Bundle bundle = getArguments();
        int i = bundle.getInt("time");
        textView.setText("第"+i+"Fragment");
    }
}
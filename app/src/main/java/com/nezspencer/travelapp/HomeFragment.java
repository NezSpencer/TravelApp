package com.nezspencer.travelapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by nezspencer on 10/30/17.
 */

public class HomeFragment extends Fragment {
    public HomeFragment() {
    }

    public static HomeFragment newInstance(){return new HomeFragment();}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_tour,container,false);

        return view;
    }
}

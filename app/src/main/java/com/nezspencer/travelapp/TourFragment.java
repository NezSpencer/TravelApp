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

public class TourFragment extends Fragment {

    public TourFragment() {
    }

    public static TourFragment newInstance(){return new TourFragment();}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_tour,container,false);
        return view;
    }
}

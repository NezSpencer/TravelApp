package com.nezspencer.travelapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by nezspencer on 10/30/17.
 */

public class SearchFragment extends Fragment {

    @BindView(R.id.rv_search)
    RecyclerView recyclerView;
    public SearchFragment() {
    }

    public static SearchFragment newInstance(){return new SearchFragment();}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_search,container,false);

        ButterKnife.bind(this,view);
        House house0 = new House("Kilimanjaro",R.drawable.oldhouses);
        House house1 = new House("Muson centre", R.drawable.summerhouse_340);

        ArrayList<House> houses = new ArrayList<>();
        houses.add(house0);
        houses.add(house1);
        SearchAdapter adapter = new SearchAdapter(houses);
        recyclerView.setAdapter(adapter);

        return view;
    }
}

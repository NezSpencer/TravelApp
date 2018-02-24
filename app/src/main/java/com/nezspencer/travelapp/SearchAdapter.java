package com.nezspencer.travelapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by nezspencer on 10/30/17.
 */

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.Holder> {

    private ArrayList<House> houseArrayList;
    public SearchAdapter(ArrayList<House> houses) {
        this.houseArrayList = houses;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_search_item,
                parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        House house = houseArrayList.get(position);
        holder.nameView.setText(house.getName());
        holder.imageView.setImageResource(house.getImage());
    }

    @Override
    public int getItemCount() {
        return houseArrayList.size();
    }

    public static class Holder extends RecyclerView.ViewHolder{

        TextView nameView;
        ImageView imageView;

        public Holder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_house);
            nameView = itemView.findViewById(R.id.tv_name);
        }
    }
}

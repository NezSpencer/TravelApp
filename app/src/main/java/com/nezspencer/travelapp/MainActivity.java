package com.nezspencer.travelapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bnv_tabs)
    BottomNavigationView bottomNavigationView;

    public static Intent newIntent(Context context){
        return new Intent(context,MainActivity.class);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_dashboard);
        ButterKnife.bind(this);
        swapFragment(HomeFragment.newInstance());

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()){

                            case R.id.action_home:
                                swapFragment(HomeFragment.newInstance());
                                break;

                            case R.id.action_profile:
                                swapFragment(ProfileFragment.newInstance());
                                break;

                            case R.id.action_tours:
                                swapFragment(TourFragment.newInstance());
                                break;

                            case R.id.action_search:
                                swapFragment(SearchFragment.newInstance());
                                break;
                        }
                        return true;
                    }
                }
        );
    }

    public void swapFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.frame,fragment)
                .commit();
    }
}

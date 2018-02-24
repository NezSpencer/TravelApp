package com.nezspencer.travelapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by nezspencer on 10/30/17.
 */

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.sign_up)
    Button signupButton;

    @BindView(R.id.sign_in)
    Button signin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.sign_up,R.id.sign_in})
    public void proceedToSignUp(){
        startActivity(SignupActivity.newIntent(this));
    }
}

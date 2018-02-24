package com.nezspencer.travelapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by nezspencer on 10/29/17.
 */

public class SignupActivity extends AppCompatActivity {


    @BindView(R.id.sign_up)
    Button signupButton;

    @BindView(R.id.email)
    EditText editEmailview;

    @BindView(R.id.password)
    EditText editPasswordView;

    @BindView(R.id.fullname)
    EditText editFullnameView;

    public static Intent newIntent(Context context){
        return new Intent(context,SignupActivity.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.sign_up)
    public void signUp(){
        String fullname = editFullnameView.getText().toString();
        String pwd = editPasswordView.getText().toString();
        String email = editEmailview.getText().toString();
        if (TextUtils.isEmpty(fullname))
            editFullnameView.setError("Type your full name");
        else if (TextUtils.isEmpty(email))
            editEmailview.setError("Type your email");
        else if (TextUtils.isEmpty(pwd))
            editPasswordView.setError("Enter your password");
        else {
            startActivity(MainActivity.newIntent(this));
        }
    }
}

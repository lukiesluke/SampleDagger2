package com.lwg.myapplicationdagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.lwg.myapplicationdagger2.models.Users;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {
    @Inject
    Users users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ((SampleApplication) getApplication()).getApplicationComponent().inject(this);

        TextView textView = findViewById(R.id.textView);
        textView.setText(users.getEmail());
    }

}

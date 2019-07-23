package com.lwg.myapplicationdagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    String eggs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((SampleApplication) getApplication()).getApplicationComponent().inject(this);

        TextView textView = findViewById(R.id.text);
        textView.setText("Cooke the " + eggs);
    }
}

package com.lwg.myapplicationdagger2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.lwg.myapplicationdagger2.models.Users;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    String eggs;

    @Inject
    Users users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((SampleApplication) getApplication()).getApplicationComponent().inject(this);

        TextView textView = findViewById(R.id.text);
        Button button = findViewById(R.id.button);

        textView.setText("Cooke the " + eggs + " : " + users.getEmail());

        Users.Builder build = new Users.Builder();
        build.setEmail("mrlukiesluke@gamil.com");
        users = build.build();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });
    }
}

package com.example.smallproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
 Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.loginid);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent loginIntent = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(loginIntent);
    }
}

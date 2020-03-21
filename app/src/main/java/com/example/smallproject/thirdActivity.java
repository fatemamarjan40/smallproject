package com.example.smallproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;



public class thirdActivity extends AppCompatActivity implements View.OnClickListener {
Button bb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        bb1 = (Button) findViewById(R.id.courseid);
        bb1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent back1Intent = new Intent(thirdActivity.this, MainActivity.class);
        startActivity(back1Intent);
    }
}

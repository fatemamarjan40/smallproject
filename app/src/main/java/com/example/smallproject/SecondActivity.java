package com.example.smallproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button1 = (Button) findViewById(R.id.courseid);
        button1.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.routineid);
        button2.setOnClickListener(this);
        button3 = (Button) findViewById(R.id.teacherid);
        button3.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.courseid:
                Intent courseIntent = new Intent(SecondActivity.this, thirdActivity.class);
                startActivity(courseIntent);
                break;
            case R.id.routineid:
                Intent NetIntent = new Intent(SecondActivity.this, forthActivity.class);
                startActivity(NetIntent);
                break;
            case R.id.teacherid:
                Intent loanIntent = new Intent(SecondActivity.this, fifthActivity.class);
                startActivity(loanIntent);
                break;

        }

    }
}

package com.example.smallproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class forthActivity extends AppCompatActivity implements View.OnClickListener {
 Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forth);
        button3 = (Button) findViewById(R.id.back2id);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent back2Intent = new Intent(forthActivity.this, MainActivity.class);
        startActivity(back2Intent);

    }
}

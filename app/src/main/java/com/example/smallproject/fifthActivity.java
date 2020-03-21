package com.example.smallproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class fifthActivity extends AppCompatActivity implements View.OnClickListener {
 Button button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        button4 = (Button) findViewById(R.id.back3id);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent back3Intent = new Intent(fifthActivity.this, MainActivity.class);
        startActivity(back3Intent);
    }
}

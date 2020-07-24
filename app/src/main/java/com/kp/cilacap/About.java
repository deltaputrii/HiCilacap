package com.kp.cilacap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().setTitle("Tentang Hi Cilacap");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView tvnyoba = (TextView) findViewById(R.id.tv_coba);
        tvnyoba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cobaregist = new Intent(About.this, Register.class);
                startActivity(cobaregist);
            }
        });
    }
}

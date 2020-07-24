package com.kp.cilacap;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ProfilCilacap extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_cilacap);
        getSupportActionBar().setTitle("Tentang Hi Cilacap");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button btnLokasi = (Button) findViewById(R.id.button_lokasi);
        btnLokasi.setMovementMethod(LinkMovementMethod.getInstance());
    }
}

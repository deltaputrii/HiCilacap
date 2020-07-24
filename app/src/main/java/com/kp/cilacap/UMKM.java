package com.kp.cilacap;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UMKM extends AppCompatActivity {
    RecyclerView rvUMKM;
    private ArrayList<Cilacap> list = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_umkm);
        getSupportActionBar().setTitle("UMKM Cilacap");

        rvUMKM = findViewById(R.id.rv_umkm);
        rvUMKM.setHasFixedSize(true);

//        list.addAll(DataUMKM);
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvUMKM.setLayoutManager(new LinearLayoutManager(this));

    }
}

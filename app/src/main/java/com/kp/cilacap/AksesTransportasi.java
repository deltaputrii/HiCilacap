//package com.kp.cilacap;
//
//import android.os.Bundle;
//
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//
//import java.util.ArrayList;
//
//public class AksesTransportasi extends AppCompatActivity {
//    RecyclerView rvTransportasi;
//    private ArrayList<Cilacap> list = new ArrayList<>();
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_transportasi);
//        getSupportActionBar().setTitle("Transportasi Cilacap");
//
//        rvTransportasi = findViewById(R.id.rv_transportasi);
//        rvTransportasi.setHasFixedSize(true);
//
//        list.addAll(DataTransportasi.getListTransportasi());
//        showRecyclerList();
//    }
//
//    private void showRecyclerList() {
//        rvTransportasi.setLayoutManager(new LinearLayoutManager(this));
//        TransportasiAdapter transportasiAdapter = new TransportasiAdapter(list);
//        rvTransportasi.setAdapter(transportasiAdapter);
//    }
//}

package com.kp.cilacap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvExplore;

    Button btn_logout;
    TextView txt_id, txt_username;
    String id, username;
    SharedPreferences sharedpreferences;

    public static final String TAG_ID = "id";
    public static final String TAG_USERNAME = "username";

//    private ArrayList<Explore> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView hwisata = (ImageView) findViewById(R.id.imgWisata);
        ImageView hkuliner = (ImageView) findViewById(R.id.imgKuliner);
        ImageView htransportasi = (ImageView) findViewById(R.id.imgTransportasi);

        hwisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wisataIntent = new Intent(MainActivity.this, Wisata.class);
                startActivity(wisataIntent);
            }
        });

        hkuliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kulinerIntent = new Intent(MainActivity.this, Kuliner.class);
                startActivity(kulinerIntent);
            }
        });
//
//        htransportasi.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent transportasiIntent = new Intent(MainActivity.this, AksesTransportasi.class);
//                startActivity(transportasiIntent);
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    private void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.profilCilacap:
                Intent intent = new Intent(this, ProfilCilacap.class);
                startActivity(intent);
                break;
            case R.id.about_apk:
                Intent intent1 = new Intent(this, About.class);
                startActivity(intent1);
                break;
        }
    }
}

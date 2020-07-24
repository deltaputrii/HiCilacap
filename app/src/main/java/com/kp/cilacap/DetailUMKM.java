package com.kp.cilacap;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import java.util.Objects;

public class DetailUMKM extends AppCompatActivity {
    public static final String EXTRA_NAMA = "extra nama";
    public static final String EXTRA_DETAIL = "extra detail";
    //    public static final String EXTRA_LOKASI = "extra lokasi";
    public static final String EXTRA_GAMBAR = "extra gambar";

    TextView nama, detail, lokasi;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_umkm);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        nama = findViewById(R.id.tv_item_nmUMKM);
        detail = findViewById(R.id.tv_item_dtUMKM);
//        lokasi = findViewById(R.id.item_btnUMKM);
        image = findViewById(R.id.img_umkm);

        nama.setText(getIntent().getStringExtra(EXTRA_NAMA));
        detail.setText(getIntent().getStringExtra(EXTRA_DETAIL));
//        lokasi.setText(getIntent().getStringExtra(EXTRA_LOKASI));

        int gambar = getIntent().getIntExtra(EXTRA_GAMBAR, 0);
        Glide.with(this).load(gambar).into(image);

        setActionBarTitle(getIntent().getStringExtra(EXTRA_NAMA));
    }

    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

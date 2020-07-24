package com.kp.cilacap;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class AddWisata extends AppCompatActivity {
    EditText eN, eD, eG, eId, eL;
    String data;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_wisata);

        eG = findViewById(R.id.editText_gambar);
        eN = findViewById(R.id.editText_namaWisata);
        eD = findViewById(R.id.editText_detailWisata);
        eL = findViewById(R.id.editText_lokasi);
        eId = findViewById(R.id.editTextId);
    }

    public void tambah(View view) {
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("AddWisataa");

        String gambar = eG.getText().toString();
        String nama = eN.getText().toString();
        String detail = eD.getText().toString();
        String lokasi = eL.getText().toString();
        String id = eId.getText().toString();

        if (gambar.equals("") || nama.equals("") || detail.equals("") || lokasi.equals("") || id.equals("")) {
            Toast.makeText(this, "Data ada yang kosong", Toast.LENGTH_SHORT).show();
        } else {
            AddWisataa adwisata = new AddWisataa (String.valueOf(detail), gambar, nama);
            myRef.child(id).setValue(adwisata);

            Toast.makeText(this, "Data berhasil ditambahkan", Toast.LENGTH_SHORT).show();
        }
    }

    public void lihatSemua(View view) {
        data = "";
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("AddWisataa");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                StringBuffer buffer = new StringBuffer();
                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                    AddWisataa nilaitest = postSnapshot.getValue(AddWisataa.class);
                    data += "Gambar Wisata: " + nilaitest.getGw() + "\n" +
                            "Nama Wisata: " + nilaitest.getNw() + "\n" +
                            "Detail Wisata: " + nilaitest.getDw() + "\n" +
                            "Lokasi Wisata: " + nilaitest.getLw() + "\n\n";
                }
                showMessage("Semua data", data);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    //membuat alert dialog
    public void showMessage(String title, String Message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
}

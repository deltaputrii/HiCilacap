package com.kp.cilacap;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Wisata extends AppCompatActivity {
    private RecyclerView rvWisata;
    private WisataAdapter wisataAdapter;
    private ArrayList<Cilacap> list;
    private RequestQueue mRequestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);
        getSupportActionBar().setTitle("Wisata Cilacap");

        list = new ArrayList<>();
        mRequestQueue = Volley.newRequestQueue(this);
        parseJSON();


//        list.addAll(DataWisata.getListWisata());
//        showRecyclerList();
        }

    private void parseJSON() {
        String url = "https://pkl-kominfo.cilacapkab.go.id/delta/api/wisata";

        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray jsonArray = response.getJSONArray("wisata");
                            for (int i = 0; i < jsonArray.length(); i ++) {
                                JSONObject wst = jsonArray.getJSONObject(i);

                                String nama = wst.getString("nama_wisata");
                                String imageUrl = wst.getString("img_wisata");
                                String detail = wst.getString("detail_wisata");
                                String lokasi = wst.getString("lokasi_wisata");

                               Cilacap clp = new Cilacap(nama,detail,lokasi,imageUrl);
                                list.add(clp);
                              //  Toast.makeText(Wisata.this, "oke", Toast.LENGTH_SHORT).show();
                            }
                            /*rvWisata = (RecyclerView) rvWisata.findViewById(R.id.rv_wisata);
                            wisataAdapter = new WisataAdapter(Wisata.this, list);
                            rvWisata.setAdapter(wisataAdapter);
                            rvWisata.setHasFixedSize(true);
                            rvWisata.setLayoutManager(new LinearLayoutManager(Wisata.this));*/



                            rvWisata = findViewById(R.id.rv_wisata);
                            LinearLayoutManager lly = new LinearLayoutManager(Wisata.this );
                            rvWisata.setLayoutManager(lly);
                            rvWisata.setHasFixedSize(true);
                            wisataAdapter = new WisataAdapter(Wisata.this,list);
                            rvWisata.setAdapter(wisataAdapter);


                        }
                         catch (JSONException e) {
                             e.printStackTrace();
                         }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });
        mRequestQueue.add(request);
    }

//    private void showRecyclerList() {
//        rvWisata.setLayoutManager(new LinearLayoutManager(this));
//        WisataAdapter wisataAdapter = new WisataAdapter(list);
//        rvWisata.setAdapter(wisataAdapter);
//    }
//
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater = getMenuInflater();
//        inflater.inflate(R.menu.menu_add_wisata, menu); //inflate our menu
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        setMode(item.getItemId());
//        return super.onOptionsItemSelected(item);
//    }
//    private void setMode(int selectedMode) {
//        switch (selectedMode) {
//            case R.id.action_addWisata:
//                Intent intent = new Intent(this, AddWisata.class);
//                startActivity(intent);
//                break;
//        }
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.action_addWisata:
//                // your code
//                Intent intent = new Intent(this, AddWisata.class);
//                startActivity(intent);
//                return true;
//            default:
//                return true;
//        }}
}

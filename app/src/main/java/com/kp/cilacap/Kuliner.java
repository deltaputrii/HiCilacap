package com.kp.cilacap;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Kuliner extends AppCompatActivity {
    RecyclerView rvKuliner;
    List<Cilacap> kliner;
    KulinerAdapter adapter;
    private static final String data_url = "https://pkl-kominfo.cilacapkab.go.id/delta/api/kuliner";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner);
        getSupportActionBar().setTitle("Kuliner Cilacap");

        rvKuliner = findViewById(R.id.rv_kuliner);
        kliner = new ArrayList<>();
        extractKuliner();
    }

    private void extractKuliner() {
        RequestQueue queue = Volley.newRequestQueue(this);
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, data_url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject klinerObject = response.getJSONObject(i);

                        Cilacap kuliner = new Cilacap();
                        kuliner.setmImageUrl(klinerObject.getString("img_kuliner"));
                        kuliner.setmNama(klinerObject.getString("nama_kuliner").toString());
                        kliner.add(kuliner);

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }

//                ArtisArrayAdapter adapter = new ArtisArrayAdapter(this, artists);
                rvKuliner.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
                adapter = new KulinerAdapter(getApplicationContext(),kliner);
                rvKuliner.setAdapter(adapter);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("tag", "onErrorResponse: " + error.getMessage());
            }
        });
        queue.add(jsonArrayRequest);
    }
}
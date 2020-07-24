package com.kp.cilacap;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class WisataAdapter extends RecyclerView.Adapter<WisataAdapter.ViewHolder> {
    Context mContext;
    LayoutInflater layoutInflater;
    private ArrayList<Cilacap> listWisata;

    public WisataAdapter(Context mContext, ArrayList<Cilacap> listWisata) {
        this.mContext = mContext;
        layoutInflater = LayoutInflater.from(mContext);
        this.listWisata = listWisata;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_wisata,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Cilacap wisataa = listWisata.get(position);
        String imageUrl = wisataa.getmImageUrl();
        String nm = wisataa.getmNama();
        String dt = wisataa.getmDetail();
        String lk = wisataa.getmLokasi();

        Glide.with(holder.itemView.getContext())
                .load(wisataa.getmImageUrl())
                .into(holder.imgWisata);
        holder.tvNama.setText(nm);
        holder.tvDetail.setText(dt);
        holder.btnLokasi.setText(lk);
    }

    @Override
    public int getItemCount() {
        return listWisata.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgWisata;
        TextView tvNama, tvDetail;
        Button btnLokasi;

        ViewHolder(View itemView) {
            super(itemView);
            imgWisata = itemView.findViewById(R.id.imgWisata);
            tvNama = itemView.findViewById(R.id.tv_nmWisata);
            tvDetail = itemView.findViewById(R.id.tv_dtWisata);
            btnLokasi = itemView.findViewById(R.id.button_lokasi);
        }
    }
}

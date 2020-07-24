package com.kp.cilacap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class KulinerAdapter extends RecyclerView.Adapter<KulinerAdapter.ViewHolder> {
    LayoutInflater inflater;
    Context context;
    List<Cilacap> kliner;

    public KulinerAdapter(Context context, List<Cilacap> kliner) {
        this.context = context;
        this.kliner = kliner;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_row_kuliner,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KulinerAdapter.ViewHolder holder, int position) {
        Picasso.get().load(kliner.get(position).getmImageUrl())
                .into(holder.imgKuliner);
        holder.tv_nmKuliner.setText(kliner.get(position).getmNama());
    }

    @Override
    public int getItemCount() {
        return kliner.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgKuliner;
        TextView tv_nmKuliner;

        public ViewHolder(View itemView) {
            super(itemView);

            imgKuliner = itemView.findViewById(R.id.imgKuliner);
            tv_nmKuliner = itemView.findViewById(R.id.tv_nmKuliner);
        }
    }
}
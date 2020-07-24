package com.kp.cilacap;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class UMKMAdapter extends RecyclerView.Adapter<UMKMAdapter.ViewHolder>{

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
//
//    @NonNull
//    @Override
//    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
//        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_umkm, viewGroup, false);
//        return new ListViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
//        final Cilacap umkmm = listUMKM.get(position);
//        Glide.with(holder.itemView.getContext())
//                .load(umkmm.getGambar())
//                .into(holder.imgGambar);
//        holder.tvNama.setText(umkmm.getNama());
//        holder.tvDetail.setText(umkmm.getDetail());
////        holder.btnLokasi.setText(wisataa.getLokasi());
//
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(holder.itemView.getContext(), DetailUMKM.class);
//                intent.putExtra(DetailWisata.EXTRA_NAMA, umkmm.getNama());
//                intent.putExtra(DetailWisata.EXTRA_DETAIL, umkmm.getDetail());
////                intent.putExtra(DetailWisata.EXTRA_LOKASI, umkmm.getLokasi());
//                intent.putExtra(DetailWisata.EXTRA_GAMBAR, umkmm.getGambar());
//                holder.itemView.getContext().startActivity(intent);
//            }
//        });
//    }
//
//    @Override
//    public int getItemCount() {
//        return listUMKM.size();
//    }
//
//    public class ListViewHolder extends RecyclerView.ViewHolder {
//        ImageView imgGambar;
//        TextView tvNama, tvDetail, btnLokasi;
//
//        ListViewHolder(View itemView) {
//            super(itemView);
//            imgGambar = itemView.findViewById(R.id.img_umkm);
//            tvNama = itemView.findViewById(R.id.tv_item_nmUMKM);
//            tvDetail = itemView.findViewById(R.id.tv_item_dtUMKM);
////            btnLokasi = itemView.findViewById(R.id.item_btnUMKM);
//        }
//    }
}

//package com.kp.cilacap;
//
//import android.content.Intent;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.bumptech.glide.Glide;
//
//import java.util.ArrayList;
//
//public class TransportasiAdapter extends RecyclerView.Adapter<TransportasiAdapter.ListViewHolder> {
//    private ArrayList<Cilacap> listTransportasi;
//
//    public TransportasiAdapter(ArrayList<Cilacap> listtransportasi) {
//        this.listTransportasi = listtransportasi;
//    }
//    @NonNull
//    @Override
//    public TransportasiAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
//        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_transportasi,viewGroup,false);
//        return new ListViewHolder(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull final TransportasiAdapter.ListViewHolder holder, int position) {
//        final Cilacap transportasii = listTransportasi.get(position);
//        Glide.with(holder.itemView.getContext())
//                .load(transportasii.getGambar())
//                .into(holder.imgGambar);
//        holder.tvNama.setText(transportasii.getNama());
//
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent1 = new Intent(holder.itemView.getContext(), UMKM.class);
//                Intent intent2 = new Intent(holder.itemView.getContext(), Resto.class);
//            }
//        });
//    }
//
//    @Override
//    public int getItemCount() {
//        return listTransportasi.size();
//    }
//
//    public class ListViewHolder extends RecyclerView.ViewHolder {
//        ImageView imgGambar;
//        TextView tvNama;
//
//        ListViewHolder(View itemView) {
//            super(itemView);
//            imgGambar = itemView.findViewById(R.id.img_transportasi);
//            tvNama = itemView.findViewById(R.id.tv_item_nmTransportasi);
//        }
//    }
//}

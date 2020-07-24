//package com.kp.cilacap;
//
//import java.util.ArrayList;
//
//public class DataUMKM {
//    private static String[] dataUMKM = {
//            "Cita Rasa",
//            "Valery",
//            "CemilLand",
//            "Panginyongan"
//    };
//
//    private static String[] detailUMKM = {
//            "Jl. Gatot Subroto No.35, Wanasari, Sidanegara, Kec. Cilacap Tengah, Kabupaten Cilacap, Jawa Tengah 53212",
//            "Menyediakan berbagai macam oleh-oleh khas Cilacap dan aneka snack lainnya dengan kualitas nomor 1 dan harga yang terjangkau. Expired produk 1-2 bulan sesudah produk diterima. Produk kami selalu baru.\n\n" +
//                    "Jl. Gatot Subroto No.97A, Rejamulya, Gunungsimping, Kec. Cilacap Tengah, Kabupaten Cilacap, Jawa Tengah 53224\n",
//            "Toko Oleh Oleh Makanan Khas Cilacap CemilLand adalah factory outlet dari Pabrik Kerupuk Tengiri Mr. Mackarel. Telah beroperasi sejak tahun 2014 dan telah melayani berbagai pembeli dari berbagai penjuru Indonesia.\n" +
//                    "\n" +
//                    "Pertokoan Semarak kios no 11\n" +
//                    "Jl. Dr. Sutomo, Cilacap, Jawa Tengah, Indonesia\n",
//            "Toko Panginyongan Cilacap merupakan pusat oleh-oleh, jajanan dan souvenir khas Cilacap. Menjual Gula Semut, Aneka olahan hasil laut, Batik Mangrove, T-Shirt khas Cilacap, Aneka Souvenir / Kerajinan dan menerima pesanan Snack, Lunch Box dan Catering. Panginyongan melayani Pesan Antar / Delivery Order.\n" +
//                    "\n" +
//                    "Jl. Gatot Subroto No. 186 Ruko C\n" +
//                    "085726066605\n" +
//                    "0282-520213\n"
//    };
//
//    private static int[] gambarUMKM = {
//            R.drawable.cita_rasa,
//
//    };
//
//    static ArrayList<Cilacap> getListUMKM() {
//        ArrayList<Cilacap> list = new ArrayList<>();
//        for (int position = 0; position < dataUMKM.length; position++) {
//            Cilacap umkmm = new Cilacap();
//            umkmm.setNama(dataUMKM[position]);
//            umkmm.setNama(detailUMKM[position]);
////            umkmm.setLokasi(lokasiUMKM[position]);
//            umkmm.setGambar(gambarUMKM[position]);
//
//            list.add(umkmm);
//        }
//        return list;
//    }
//}

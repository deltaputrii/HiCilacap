package com.kp.cilacap;

public class Cilacap {
    private String mImageUrl;
    private String mNama;
    private String mDetail;
    private String mLokasi;

    public Cilacap(String mImageUrl, String mNama, String mDetail, String mLokasi) {
        this.mImageUrl = mImageUrl;
        this.mNama = mNama;
        this.mDetail = mDetail;
        this.mLokasi = mLokasi;
    }

    public Cilacap() {

    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }

    public String getmNama() {
        return mNama;
    }

    public void setmNama(String mNama) {
        this.mNama = mNama;
    }

    public String getmDetail() {
        return mDetail;
    }

    public void setmDetail(String mDetail) {
        this.mDetail = mDetail;
    }

    public String getmLokasi() {
        return mLokasi;
    }

    public void setmLokasi(String mLokasi) {
        this.mLokasi = mLokasi;
    }
}

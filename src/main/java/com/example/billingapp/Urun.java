package com.example.billingapp;

import java.util.HashMap;
import java.util.Map;

public class Urun {

   private int id;
   private String isim;
   private String marka;
   private double miktar;
   private String birim;
   private int stok;
   private int ucret;

    public Urun(){}

    public Urun(int id, String isim, int miktar){
        this.id = id;
        this.isim = isim;
        this.stok += miktar;
    }

    //Stoktaki tüm ürünlerin mapi
    static Map<Integer,Urun> butunUrunlerMapi = new HashMap<>();

    public void urunEkle(Urun urun){
        butunUrunlerMapi.put(urun.getId(),urun);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public double getMiktar() {
        return miktar;
    }

    public void setMiktar(double miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    public static Map<Integer, Urun> getButunUrunlerMapi() {
        return butunUrunlerMapi;
    }
}

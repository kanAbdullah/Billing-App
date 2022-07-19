package com.example.billingapp;

import java.util.HashMap;
import java.util.Map;

public class Urun {

    static int baseId = 10000;

    private int id;
    private String isim;
    private String marka;
    private double miktar;
    private String birim;
    private int stok;
    private double ucret;

    public Urun() {
    }

    public Urun(String isim, int miktar) {
        this.id = idOlustur();
        this.isim = isim;
        this.stok += miktar;
    }

    public Urun(String isim, String marka, double miktar, String birim, int stok, double ucret) {
        this.id = idOlustur();
        this.isim = isim;
        this.marka = marka;
        this.miktar = miktar;
        this.birim = birim;
        this.stok = stok;
        this.ucret = ucret;
    }

    //Stoktaki tüm ürünlerin mapi
    static Map<Integer, Urun> butunUrunlerMapi = new HashMap<>();

    public void urunEkle(Urun urun) {
        butunUrunlerMapi.put(urun.getId(), urun);
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

    public double getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    public static Map<Integer, Urun> getButunUrunlerMapi() {
        return butunUrunlerMapi;
    }

    public void fakeUrunEkle() {

        Urun cokonat = new Urun("Cokonat","Ulker",500,"adet",500,3.75);
        Urun domestos = new Urun("Domestos","Domestos",40,"adet",40,9.75);
        Urun kraker = new Urun("Kraker","Ulker",500,"adet",500,2.75);
        Urun harby = new Urun("Harby","Alpella",400,"adet",400,50);
        Urun cips = new Urun("Lays","Lays",20,"adet",20,10.50);
        Urun pecete = new Urun("Pecete","Solo",100,"adet",100,11.75);
        Urun kitap = new Urun("Tarifler","IsBank Yayinlari",5,"adet",5,29);
        Urun ekmek = new Urun("ekmek","Tas Firin",30,"adet",30,3.0);
        Urun simit = new Urun("Simit","Tas Firin",20,"adet",20,5);

        butunUrunlerMapi.put(cokonat.getId(),cokonat);
        butunUrunlerMapi.put(domestos.getId(),domestos);
        butunUrunlerMapi.put(kraker.getId(),kraker);
        butunUrunlerMapi.put(harby.getId(),harby);
        butunUrunlerMapi.put(cips.getId(),cips);
        butunUrunlerMapi.put(pecete.getId(),pecete);
        butunUrunlerMapi.put(kitap.getId(),kitap);
        butunUrunlerMapi.put(ekmek.getId(),ekmek);
        butunUrunlerMapi.put(simit.getId(),simit);
    }

    public static int idOlustur() {
        return baseId++;
    }
}

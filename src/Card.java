/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ENES
 */


class Card {
    private int id;
    private int customerId;
    private String ad;
    private String soyad;
    private String kartNo;
    private double limit;
    private boolean durum;
    private boolean onay;

    public Card(int id, int customerId, String ad, String soyad, String kartNo, double limit, boolean durum, boolean onay) {
        this.id = id;
        this.customerId = customerId;
        this.ad = ad;
        this.soyad = soyad;
        this.kartNo = kartNo;
        this.limit = limit;
        this.durum = durum;
        this.onay = onay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getKartNo() {
        return kartNo;
    }

    public void setKartNo(String kartNo) {
        this.kartNo = kartNo;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public boolean isDurum() {
        return durum;
    }

    public void setDurum(boolean durum) {
        this.durum = durum;
    }

    public boolean isOnay() {
        return onay;
    }

    public void setOnay(boolean onay) {
        this.onay = onay;
    }
    
    
  
    

}

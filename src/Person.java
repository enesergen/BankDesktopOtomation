/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ENES
 */
abstract class Person {
    private int id;
    private String tcNo;
    private String ad;
    private String soyAd;
    private String dogumTarih;
    private String dogumYer;
    private String babaAd;
    private String anneAd;
    private String anneKızlıkSoyAd;
    private String telNo;
    private String eMail;
    private String adres;
    private String sehir;

    public Person(int id, String tcNo, String ad, String soyAd, String dogumTarih, String dogumYer, String babaAd, String anneAd, String anneKızlıkSoyAd, String telNo, String eMail, String adres, String sehir) {
        this.id = id;
        this.tcNo = tcNo;
        this.ad = ad;
        this.soyAd = soyAd;
        this.dogumTarih = dogumTarih;
        this.dogumYer = dogumYer;
        this.babaAd = babaAd;
        this.anneAd = anneAd;
        this.anneKızlıkSoyAd = anneKızlıkSoyAd;
        this.telNo = telNo;
        this.eMail = eMail;
        this.adres = adres;
        this.sehir = sehir;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public String getDogumTarih() {
        return dogumTarih;
    }

    public void setDogumTarih(String dogumTarih) {
        this.dogumTarih = dogumTarih;
    }

    public String getDogumYer() {
        return dogumYer;
    }

    public void setDogumYer(String dogumYer) {
        this.dogumYer = dogumYer;
    }

    public String getBabaAd() {
        return babaAd;
    }

    public void setBabaAd(String babaAd) {
        this.babaAd = babaAd;
    }

    public String getAnneAd() {
        return anneAd;
    }

    public void setAnneAd(String anneAd) {
        this.anneAd = anneAd;
    }

    public String getAnneKızlıkSoyAd() {
        return anneKızlıkSoyAd;
    }

    public void setAnneKızlıkSoyAd(String anneKızlıkSoyAd) {
        this.anneKızlıkSoyAd = anneKızlıkSoyAd;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ENES
 */
public class Credit {

  
   private int id;
   private int customerId;
   private String ad;
   private String soyAd;
   private double miktar;
   private String aciklama;
   private boolean durum;// görüldü
   private boolean onay;// onay red

    public boolean isOnay() {
        return onay;
    }

    public void setOnay(boolean onay) {
        this.onay = onay;
    }

    public Credit(int id, int customerId, String ad, String soyAd, double miktar, String aciklama, boolean durum,boolean onay) {
        this.id = id;
        this.customerId = customerId;
        this.ad = ad;
        this.soyAd = soyAd;
        this.miktar = miktar;
        this.aciklama = aciklama;
        this.durum = durum;
        this.onay=onay;
    }
   
     

     public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
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

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public double getMiktar() {
        return miktar;
    }

    public void setMiktar(double miktar) {
        this.miktar = miktar;
    }

    public boolean isDurum() {
        return durum;
    }

    public void setDurum(boolean durum) {
        this.durum = durum;
    }
   
   
   
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ENES
 */
public class Admin extends Person {
    
    private String kullaniciAd,sifre;
    final String rubte="admin";

    
    private double maas;

    public Admin(String kullaniciAd, String sifre, double maas, int id, String tcNo, String ad, String soyAd, String dogumTarih, String dogumYer, String babaAd, String anneAd, String anneKızlıkSoyAd, String telNo, String eMail, String adres, String sehir) {
        super(id, tcNo, ad, soyAd, dogumTarih, dogumYer, babaAd, anneAd, anneKızlıkSoyAd, telNo, eMail, adres, sehir);
        this.kullaniciAd = kullaniciAd;
        this.sifre = sifre;
        this.maas = maas;
    }

   

    public String getKullaniciAd() {
        return kullaniciAd;
    }

    public void setKullaniciAd(String kullaniciAd) {
        this.kullaniciAd = kullaniciAd;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }
    public String getRubte() {
        return rubte;
    }
    
}

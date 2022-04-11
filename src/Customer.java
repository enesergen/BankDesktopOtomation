
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ENES
 */
public class Customer extends Person {

    private double hesapBakiye;
    private double kartBorcu;
    private double krediBorcu;
    private String userName;
    private String password;
    public Customer(double hesapBakiye, double kartBorcu, double krediBorcu, String userName, String password, int id, String tcNo, String ad, String soyAd, String dogumTarih, String dogumYer, String babaAd, String anneAd, String anneKızlıkSoyAd, String telNo, String eMail, String adres, String sehir) {
        super(id, tcNo, ad, soyAd, dogumTarih, dogumYer, babaAd, anneAd, anneKızlıkSoyAd, telNo, eMail, adres, sehir);
        this.hesapBakiye = hesapBakiye;
        this.kartBorcu = kartBorcu;
        this.krediBorcu = krediBorcu;
        this.userName = userName;
        this.password = password;
    }
    
    
    
    
    

    public double getHesapBakiye() {
        return hesapBakiye;
    }

    public void setHesapBakiye(double hesapBakiye) {
        this.hesapBakiye = hesapBakiye;
    }

    public double getKartBorcu() {
        return kartBorcu;
    }

    public void setKartBorcu(double kartBorcu) {
        this.kartBorcu = kartBorcu;
    }

    public double getKrediBorcu() {
        return krediBorcu;
    }

    public void setKrediBorcu(double krediBorcu) {
        this.krediBorcu = krediBorcu;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

}

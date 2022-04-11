/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ENES
 */
public class Expense {

    
    private int id;
    private String giderAdi;
    private String acıklama;
    private double tutar;
    public Expense(int id, String giderAdi, String acıklama, double tutar) {
        this.id = id;
        this.giderAdi = giderAdi;
        this.acıklama = acıklama;
        this.tutar = tutar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGiderAdi() {
        return giderAdi;
    }

    public void setGiderAdi(String giderAdi) {
        this.giderAdi = giderAdi;
    }

    public String getAcıklama() {
        return acıklama;
    }

    public void setAcıklama(String acıklama) {
        this.acıklama = acıklama;
    }

    public double getTutar() {
        return tutar;
    }

    public void setTutar(double tutar) {
        this.tutar = tutar;
    }
    
    
    
}

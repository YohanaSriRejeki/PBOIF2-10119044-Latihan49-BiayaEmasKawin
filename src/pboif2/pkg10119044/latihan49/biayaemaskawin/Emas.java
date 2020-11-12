/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan49.biayaemaskawin;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan biaya emas kawin
 */

class Emas {
    private double gramEmas;
    private double hargaEmas;
    private double gramEmasBeli;
    
    public double getGramEmas(){
        return gramEmas;
    }
    
    public void setGramEmas(double gramEmas){
        this.gramEmas = gramEmas;
    }
    
    public double getHargaEmas(){
        return hargaEmas;
    }
    
    public void setHargaEmas(double hargaEmas){
        this.hargaEmas = hargaEmas;
    }
    
    public double getGramEmasBeli(){
        return gramEmasBeli;
    }
    
    public void setGramEmasBeli(double gramEmasBeli){
        this.gramEmasBeli = gramEmasBeli;
    }
    
    public double hitungBiayaEmas(){
        return getHargaEmas() * getGramEmasBeli();
    }
}

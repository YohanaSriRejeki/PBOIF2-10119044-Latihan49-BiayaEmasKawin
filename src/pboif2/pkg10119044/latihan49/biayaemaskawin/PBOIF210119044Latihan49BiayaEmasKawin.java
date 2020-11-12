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

public class PBOIF210119044Latihan49BiayaEmasKawin {
    public static void main(String[] args) {
        Emas objEmas = new Emas();
        objEmas.setGramEmas(1);
        objEmas.setHargaEmas(570000);
        System.out.println("Harga "+objEmas.getGramEmas()+" gram emas per bulan Oktober adalah "
                          +"Rp "+objEmas.getHargaEmas());
        objEmas.setGramEmasBeli(15.7);
        System.out.println("Gram yang ingin dibeli : "+objEmas.getGramEmasBeli());
        System.out.println("Harga emas yang harus dibayarkan adalah : Rp "+objEmas.hitungBiayaEmas());
    }   
}

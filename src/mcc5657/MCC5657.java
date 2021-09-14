/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcc5657;

/**
 *
 * @author ASUS
 */
public class MCC5657 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pembagian pembagian = new Pembagian();
        System.out.println(pembagian.bagi(4, 2));
        
        Pengurangan p = new Pengurangan();
        System.out.println("Hasil Pengurangan = " + p.Hitung(454, 35));
        
        //Penambahan Tambah = new Penambahan();
        //System.out.println(Tambah.penambahan(2, 1));
        Perkalian perkalian = new Perkalian(8,9);
        System.out.println(perkalian.hasilPerkalian());
    }
    
}

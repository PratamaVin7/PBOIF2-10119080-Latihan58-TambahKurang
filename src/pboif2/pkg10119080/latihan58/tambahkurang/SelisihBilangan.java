/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan58.tambahkurang;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * (OBJECT ORIENTED) Tambah Kurang
 */
public class SelisihBilangan extends Bilangan{

    public void tampilSelisih() {
        System.out.println("Hasil Selisih " + getX() + " - "  + getY() + " = " + 
                           (getX() - getY()));
    }
    
}
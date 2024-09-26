/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgsprak6;

/**
 *
 * @author ASUS
 */
class Pakaian extends Produk {

    public Pakaian(String nama, int harga) {
        super(nama, harga);
    }

    @Override
    public void displayInfo() {
        System.out.println("Pakaian: " + nama + " | Harga: Rp" + harga);
    }

    @Override
    public double hitungDiskon() {
        //diskon 5% untuk pakaian
        return harga * 0.05;
    }
}

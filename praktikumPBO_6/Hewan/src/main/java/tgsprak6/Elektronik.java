/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgsprak6;

/**
 *
 * @author ASUS
 */
class Elektronik extends Produk {
    public Elektronik(String nama, int harga) {
        super(nama, harga);
    }

    @Override
    public void displayInfo() {
        System.out.println("Elektronik: " + nama + " | Harga: Rp" + harga);
    }

    @Override
    public double hitungDiskon() {
        // Diskon 15% untuk elektronik
        return harga * 0.15;
    }
}

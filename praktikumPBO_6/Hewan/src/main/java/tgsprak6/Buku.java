/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgsprak6;

/**
 *
 * @author ASUS
 */
class Buku extends Produk {
    public Buku(String nama, int harga) {
        super(nama, harga);
    }

    @Override
    public void displayInfo() {
        System.out.println("Buku: " + nama + " | Harga: Rp" + harga);
    }

    @Override
    public double hitungDiskon() {
        // Diskon 10% untuk buku
        return harga * 0.10;
    }
}


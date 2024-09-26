/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgsprak6;

/**
 *
 * @author ASUS
 */

abstract class Produk {
    protected String nama;
    protected int harga;


    public Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract void displayInfo();

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public abstract double hitungDiskon();
}

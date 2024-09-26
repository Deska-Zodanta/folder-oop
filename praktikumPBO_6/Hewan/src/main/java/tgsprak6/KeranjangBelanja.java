/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgsprak6;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.List;

class KeranjangBelanja {
    private List<Produk> produkList;

    public KeranjangBelanja() {
        produkList = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        produkList.add(produk);
    }

    public double hitungTotalHargaSetelahDiskon() {
        double total = 0;
        for (Produk produk : produkList) {
            total += produk.hitungDiskon();
        }
        return total;
    }
    public void tampilkanProdukDanHarga() {
        System.out.println("Daftar Produk yang Dibeli:");
        for (Produk produk : produkList) {
            System.out.println("- " + produk.getNama() + ": Rp " + produk.getHarga());
        }
    }
}

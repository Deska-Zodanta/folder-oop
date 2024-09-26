/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgsprak6;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("===== Customer 1 =====");
        Produk buku = new Buku("Pemrograman Java", 100000);
        Produk laptop = new Elektronik("Laptop ASUS", 15000000);
        Produk baju = new Pakaian("Kemeja", 200000);
        
        System.out.println("===== Barang-barang yang dibeli=====");
        buku.displayInfo();
        laptop.displayInfo();
        baju.displayInfo();
        
        System.out.println("===== Notta =====");
        KeranjangBelanja keranjang = new KeranjangBelanja();
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(laptop);
        keranjang.tambahProduk(baju);
        keranjang.tampilkanProdukDanHarga();


        double totalHarga = keranjang.hitungTotalHargaSetelahDiskon();
        System.out.println("Total harga setelah diskon: Rp " + totalHarga);
        
        System.out.println("===== Customer 2 =====");
        Produk buku1 = new Buku("Ensiklopedia", 25000);
        Produk laptop1 = new Elektronik("Laptop Sony", 13500000);
        Produk baju1 = new Pakaian("Kaos Vans", 350000);
        
        System.out.println("===== Barang-barang yang dibeli=====");
        buku1.displayInfo();
        laptop1.displayInfo();
        baju1.displayInfo();
        
        System.out.println("===== Notta =====");
        KeranjangBelanja keranjang1 = new KeranjangBelanja();
        keranjang1.tambahProduk(buku1);
        keranjang1.tambahProduk(laptop1);
        keranjang1.tambahProduk(baju1);
        
        keranjang1.tampilkanProdukDanHarga();
        double HargaSem = keranjang1.hitungTotalHargaSetelahDiskon();
        System.out.println("Total harga setelah diskon: Rp " + HargaSem);
    }
}


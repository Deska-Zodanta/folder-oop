/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgsprak11;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Pengarang
        Pengarang pengarang1 = new Pengarang("Aryasatya Ikranegara");
        Pengarang pengarang2 = new Pengarang("Andrea Hirata");

        // Membuat objek Buku yang memiliki agregasi dengan Pengarang
        Buku buku1 = new Buku("Malin Kundang", pengarang1);
        Buku buku2 = new Buku("Laskar Pelangi", pengarang2);
        Buku buku3 = new Buku("Bumi Manusia", pengarang2);

        // Membuat objek Perpustakaan dengan kapasitas untuk menyimpan 5 buku
        Perpustakaan perpustakaan = new Perpustakaan(5);

        // Menambahkan buku ke dalam perpustakaan
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        // Menampilkan informasi semua buku di perpustakaan
        System.out.println("\n" +" ".repeat(12) + "Informasi Perpustakaan\n");
        perpustakaan.infoPerpustakaan();
    }
}
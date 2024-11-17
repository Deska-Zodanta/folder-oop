/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11.praktikumpbo_11;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Pemrograman Java");
        Buku buku2 = new Buku("Algoritma dan Struktur Data");
        Buku buku3 = new Buku("Pemrograman Dart");
        Buku buku4 = new Buku("Konsep NLP");

        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);
        perpustakaan.tambahBuku(buku4);

        System.out.println("Informasi Perpustakaan:");
        perpustakaan.infoPerpustakaan();
        System.out.println();

        Anggota anggota1 = new Anggota("Budi");
        Anggota anggota2 = new Anggota("Rokhan");
        Anggota anggota3 = new Anggota("Bardi Vandolar");

        Klub klub = new Klub("Klub Futsal Sleding Tekel");
        klub.tambahAnggota(anggota1);
        klub.tambahAnggota(anggota2);
        klub.tambahAnggota(anggota3);

        System.out.println("Informasi Klub Sleding Tekel:");
        klub.infoKlub();
    }
}


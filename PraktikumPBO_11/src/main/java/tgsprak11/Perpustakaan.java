/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgsprak11;

/**
 *
 * @author ASUS
 */
class Perpustakaan {
    private Buku[] daftarBuku;
    private int jumlahBuku;

    public Perpustakaan(int kapasitas) {
        this.daftarBuku = new Buku[kapasitas];
        this.jumlahBuku = 0;
    }

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
            System.out.println("Buku berhasil ditambahkan: " + buku);
        } else {
            System.out.println("Tidak bisa menambahkan buku. Kapasitas penuh.");
        }
    }

    public void infoPerpustakaan() {
        System.out.println(" ".repeat(5) + "=== Daftar Buku di Perpustakaan ===");
        for (int i = 0; i < jumlahBuku; i++) {
            daftarBuku[i].infoBuku();
            System.out.println();
        }
    }
}
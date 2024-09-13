/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3.tgspertemuan3;

/**
 *
 * @author ASUS
 */
public class Main2 {
    public static void main(String[] args) {
        // Menciptakan dua objek dari class Mobil
        Mobil mobil1 = new Mobil("Toyota", "Terios", 2020,"Hitam", "1 September");
        Mobil mobil2 = new Mobil("Honda", "Civic", 2021, "Biru", "5 Mei");

        // Menampilkan informasi kedua mobil
        mobil1.tampilkanInfo();
        mobil2.tampilkanInfo();
        
        
        //mengubah warna
        mobil1.pilihWarna("Hijau");
        mobil1.tampilkanInfo();
        mobil2.pilihWarna("Emas");
        mobil2.tampilkanInfo();
        //menampilkan method startEngine
        mobil1.startEngine();
        mobil2.startEngine();
    }
}
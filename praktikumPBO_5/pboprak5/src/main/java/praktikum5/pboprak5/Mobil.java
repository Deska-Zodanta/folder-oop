/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5.pboprak5;

/**
 *
 * @author ASUS
 */
public class Mobil extends KendaraanDarat {
    // Atribut tambahan
    int jumlahPintu;
    // Metode untuk menampilkan informasi mobil
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: "+jumlahPintu);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_pertemuan4.pbo_prak4;

/**
 *
 * @author ASUS
 */
public class Mainpbo4 {
    public static void main(String[] args) {
        Kendaraan mobil = new Kendaraan("Toyota", 456, "bebek");
        mobil.tampilkanInfoKendaraan();
        
        Mobil mobilsaya = new Mobil("Pajero", 500, "Honda", 6);
        mobilsaya.tampilkanInfoMobil();
    }
}


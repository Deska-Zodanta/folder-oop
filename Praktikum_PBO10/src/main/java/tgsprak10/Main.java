/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgsprak10;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Elektronik elektronik = new Elektronik();
        Makanan makanan = new Makanan();

        double hargaElektronik = 2500000;
        double hargaMakanan = 50000;

        System.out.println("Pajak Elektronik: " + (int)elektronik.hitungPajak(hargaElektronik));
        System.out.println("Pajak Makanan: " + (int)makanan.hitungPajak(hargaMakanan));
    }
}

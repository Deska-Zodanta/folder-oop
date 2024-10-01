/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsiuts.responsiutsdeska;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Elektronik laptop = new Elektronik("Laptop", 15000000,5);
        
        System.out.println("=== Produk ===");
        laptop.tampilkanInfo();
        System.out.println();
        
        PegawaiTetap pegawai = new PegawaiTetap("Deska", 5000000, 1000000);
        
        System.out.println("=== Pegawai ===");
        pegawai.tampilkanInfo();
        System.out.println("\n\n===========================================");
        System.out.println("\n\n POLIMORFISME");
        //Polimorfisme
        Produk produk1 = new Elektronik("Laptop", 15000000, 2);
        Produk produk2 = new Makanan("Tahu", 20000, new java.util.Date());

        System.out.println("== Polimorfisme Produk ==");
        produk1.tampilkanInfo();
        System.out.println();
        produk2.tampilkanInfo();
        System.out.println(); 
        
       
        Pegawai pegawai1 = new PegawaiTetap("Deska", 5000000, 1000000);
        Pegawai pegawai2 = new PegawaiKontrak("Siti", 3000000, 11);
        
        System.out.println("== Polimorfisme Pegawai ==");
        pegawai1.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo(); 
    }
}

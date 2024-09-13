/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgspboprak4;

/**
 *
 * @author ASUS
 */
public class Maintgsprakpbo4 {
    public static void main(String[] args) {
        Pekerja pekerja1 = new Pekerja("Iko", 20, "Programmer", 10000000);

        // Menampilkan informasi pekerja menggunakan metode toString()
        System.out.println(pekerja1.toString());
        
        pekerja1.setNama("Budi");

        // Menampilkan ulang informasi pekerja setelah nama diubah
        System.out.println("\n----Informasi pekerja setelah nama diubah----");
        System.out.println(pekerja1.toString());
    }
}

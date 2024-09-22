/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgspraktikum5;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args){
        System.out.println("----- KUCING -----");
        Kucing kucing = new Kucing();
        kucing.nama = "Rora";
        kucing.jenis = "Kucing Persia";
        kucing.tampilkanInfo();
        kucing.suaraKhas();
        
        System.out.println();
        System.out.println("----- ANJING -----");
        Anjing dog = new Anjing();
        dog.nama = "Beno";
        dog.jenis = "Anjing Buldog";
        dog.tampilkanInfo();
        dog.suaraKhas();
    }
}

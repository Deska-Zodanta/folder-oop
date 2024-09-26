/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6.hewan;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Kucing(); 
        kucing.bersuara(); 
        kucing.makan("Wiskas"); 
        kucing.makan("Wiskas", 5);
        System.out.println("==========================");
        Hewan anjing = new Anjing();
        anjing.bersuara();
        anjing.makan("Sembarang");
        anjing.makan("Sembarangan", 1);
    } 
}

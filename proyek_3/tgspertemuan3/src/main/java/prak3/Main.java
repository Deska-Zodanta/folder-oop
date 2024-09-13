/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak3;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args){
        Hewan kucing = new Hewan("Beno",19);
        kucing.suara();
        kucing.info();
        kucing.berlari();
        
        Hewan anjing = new Hewan("Kiko",6);
        anjing.suara();
        anjing.info();
        
        anjing.berlari();
    }
}

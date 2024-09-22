/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5.pboprak5;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args){
        Mobil mobil = new Mobil();
        mobil.nama = "Terios";
        mobil.kecepatan = 200;
        mobil.jumlahPintu = 5;
        mobil.tampilkanInfo();
        
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Kawasaki KLX";
        motor.kecepatan = 120;
        motor.jenisMesin = "250-CC";
        motor.tampilkanInfo();
    }
}

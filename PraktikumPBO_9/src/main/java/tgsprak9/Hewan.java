/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgsprak9;

/**
 *
 * @author ASUS
 */
abstract class Hewan {

    abstract void suara();
    abstract void jenis();

    void detailHewan(){
        System.out.println("_".repeat(40));
        System.out.println();
        System.out.print(" Hewan dengan Jenis :");
        jenis();
        System.out.print(" Memiliki Suara :");
        suara();
        System.out.println("_".repeat(40));
    }
}


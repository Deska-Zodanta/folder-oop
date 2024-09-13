/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pbo_pertemuan4.pbo_prak4;

/**
 *
 * @author ASUS
 */
public class Kendaraan {
    private String nama;
    protected int kecepatanMaks;
    public String jenisMesin;

    // Constructor
    public Kendaraan(String nama, int kecepatanMaks, String jenisMesin) {
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
        //this.warna = warna;
        //this.launching = launching;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    public void tampilkanInfoKendaraan(){
        System.out.println("Nama: "+nama);
        System.out.println("Kecepatan kendaraan: " + kecepatanMaks + " km/h");
        System.out.println("Jenis Mesin: "+jenisMesin);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgspboprak4;

/**
 *
 * @author ASUS
 */
public class Pekerja extends Manusia {
    private double gaji;

    // Constructor untuk menginisialisasi atribut di kelas Pekerja
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }

    // Getter untuk atribut gaji
    public double getGaji() {
        return gaji;
    }

    // Setter untuk atribut gaji
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    @Override
    public String toString() {
        return "Nama: " + getNama() + 
                ", Usia: " + usia + 
                ", Pekerjaan: " + pekerjaan + 
                ", Gaji: " + gaji;
    }
}

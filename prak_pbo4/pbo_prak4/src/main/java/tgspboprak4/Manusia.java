/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgspboprak4;

/**
 *
 * @author ASUS
 */
public class Manusia {
    private String nama;
    protected int usia;
    public String pekerjaan;
    
    // Constructor untuk menginisialisasi atribut
    public Manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }
    public String getNama() {
        return nama;
    }

    // Setter untuk atribut nama
    public void setNama(String nama) {
        this.nama = nama;
    }
}

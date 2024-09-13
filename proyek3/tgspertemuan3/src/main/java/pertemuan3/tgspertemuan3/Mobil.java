/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pertemuan3.tgspertemuan3;

/**
 *
 * @author ASUS
 */
class Mobil {
    String merk;
    String model;
    int tahun;
    String warna;
    String launching;

    // Constructor
    public Mobil(String merk, String model, int tahun, String warna, String launching) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
        this.launching = launching;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public int getTahun(){
        return tahun;
    }
    public void setTahun(int tahun){
        this.tahun = tahun;
    }
    public String getWarna(){
        return warna;
    }
    public void setWarna(String warna){
        this.warna = warna;
    }
    public String thLaunch(){
        return launching;
    }
    public void setThLauch(String launching){
        this.launching = launching;
    }

    // Method untuk menampilkan informasi mobil
    public void tampilkanInfo() {
        System.out.println("Merk Mobil: " + merk);
        System.out.println("Model Mobil: " + model);
        System.out.println("Tahun Rangkaian: " + tahun);
        System.out.println("Warna Mobil: " + warna);
        System.out.println("Akan Launching Tanggal: "+launching);
        System.out.println();
    }
    //method startEngine
    public void startEngine() {
        System.out.println("Mesin mobil " + merk + " No Problem");
    }
    //ubah warna
    public void pilihWarna(String warnaPilihan){
        setWarna(warnaPilihan);
        System.out.println("Warna pilihan konsumen " + warna);
    }
}
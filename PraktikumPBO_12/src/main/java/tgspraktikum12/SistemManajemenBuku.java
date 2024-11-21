/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgspraktikum12;

/**
 *
 * @author ASUS
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SistemManajemenBuku {
    private static final String TEXT_FILE = "buku.txt";
    private static final String SERIAL_FILE = "buku.ser";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Buku> bukuList = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Buku Baru dan Simpan ke File Teks");
            System.out.println("2. Simpan Objek Buku ke File (Serialisasi)");
            System.out.println("3. Tampilkan Daftar Buku dari File Teks");
            System.out.println("4. Tampilkan Daftar Buku dari File Serial");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    tambahBuku(scanner, bukuList);
                    simpanKeFileTeks(bukuList);
                    break;
                case 2:
                    simpanKeFileSerial(bukuList);
                    break;
                case 3:
                    tampilkanDariFileTeks();
                    break;
                case 4:
                    tampilkanDariFileSerial();
                    break;
                case 5:
                    System.out.println("Keluar dari sistem.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void tambahBuku(Scanner scanner, List<Buku> bukuList) {
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan pengarang: ");
        String pengarang = scanner.nextLine();
        System.out.print("Masukkan tahun terbit: ");
        int tahunTerbit = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline

        Buku buku = new Buku(judul, pengarang, tahunTerbit);
        bukuList.add(buku);
        System.out.println("Buku berhasil ditambahkan.");
    }

    private static void simpanKeFileTeks(List<Buku> bukuList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TEXT_FILE))) {
            for (Buku buku : bukuList) {
                writer.write(buku.toString());
                writer.newLine();
            }
            System.out.println("Daftar buku berhasil disimpan ke file teks.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file teks.");
            e.printStackTrace();
        }
    }

    private static void simpanKeFileSerial(List<Buku> bukuList) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(SERIAL_FILE))) {
            oos.writeObject(bukuList);
            System.out.println("Daftar buku berhasil disimpan ke file serial.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menyimpan ke file serial.");
            e.printStackTrace();
        }
    }

    private static void tampilkanDariFileTeks() {
        try (BufferedReader reader = new BufferedReader(new FileReader(TEXT_FILE))) {
            System.out.println("\nDaftar Buku dari File Teks:");
            String line;
            while ((line = reader.readLine()) != null) {
                Buku buku = Buku.fromString(line);
                System.out.println(buku.getInfo());
            }
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca dari file teks.");
            e.printStackTrace();
        }
    }

    private static void tampilkanDariFileSerial() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(SERIAL_FILE))) {
            @SuppressWarnings("unchecked")
            List<Buku> bukuList = (List<Buku>) ois.readObject();
            System.out.println("\nDaftar Buku dari File Serial:");
            for (Buku buku : bukuList) {
                System.out.println(buku.getInfo());
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Terjadi kesalahan saat membaca dari file serial.");
            e.printStackTrace();
        }
    }
}
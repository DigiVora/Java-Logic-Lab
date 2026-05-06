/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Persoalan2;
import java.util.Scanner;

/**
 * @author achmad_khusnul_yakin
 */
public class After2 {

    // Method menghitung luas lingkaran (sebagai basis)
    public double luasLingkaran(int diameter) {
        double jari2 = (double) diameter / 2;
        return Math.PI * Math.pow(jari2, 2);
    }

    // 1. Method Volume Tabung
    public double volumeTabung(int diameter, int tinggi) {
        return luasLingkaran(diameter) * tinggi;
    }

    // 2. Method Volume Kerucut
    public double volumeKerucut(int diameter, int tinggi) {
        return (1.0 / 3.0) * luasLingkaran(diameter) * tinggi;
    }

    // 3. Method Volume Bola
    public double volumeBola(int diameter) {
        double jari2 = (double) diameter / 2;
        return (4.0 / 3.0) * Math.PI * Math.pow(jari2, 3);
    }

    // --- METHOD UTAMA (MAIN) ---
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Memanggil class After2 itu sendiri
        After2 hitung = new After2();

        System.out.print("Masukkan nilai diameter : ");
        int d = input.nextInt();

        System.out.print("Masukkan nilai tinggi (tabung & kerucut) : ");
        int t = input.nextInt();

        System.out.println("\n--- Hasil Perhitungan ---");
        System.out.printf("Volume Tabung  : %.2f\n", hitung.volumeTabung(d, t));
        System.out.printf("Volume Kerucut : %.2f\n", hitung.volumeKerucut(d, t));
        System.out.printf("Volume Bola    : %.2f\n", hitung.volumeBola(d));
        
        input.close();
    }
}
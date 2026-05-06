/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hitungbangundatar;
import javax.swing.JOptionPane;

/**
 *
 * @author achmad_khusnul_yakin
 */
public class HitungBangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Input untuk Persegi Panjang
        String pStr = JOptionPane.showInputDialog("Masukkan Panjang Persegi Panjang:");
        String lStr = JOptionPane.showInputDialog("Masukkan Lebar Persegi Panjang:");
        double panjang = Double.parseDouble(pStr);
        double lebar = Double.parseDouble(lStr);
        
        // 2. Input untuk Segitiga
        String aStr = JOptionPane.showInputDialog("Masukkan Alas Segitiga:");
        String tStr = JOptionPane.showInputDialog("Masukkan Tinggi Segitiga:");
        double alas = Double.parseDouble(aStr);
        double tinggi = Double.parseDouble(tStr);
        
        // 3. Input untuk Lingkaran
        String rStr = JOptionPane.showInputDialog("Masukkan Jari-jari Lingkaran:");
        double jariJari = Double.parseDouble(rStr);

        // Memanggil method dan menampilkan hasil
        String hasil = "--- HASIL PERHITUNGAN ---\n\n" +
                       "Luas Persegi Panjang: " + hitungPersegiPanjang(panjang, lebar) + "\n" +
                       "Luas Segitiga: " + hitungSegitiga(alas, tinggi) + "\n" +
                       "Luas Lingkaran: " + hitungLingkaran(jariJari);

        JOptionPane.showMessageDialog(null, hasil);
    }

    // Method dengan parameter untuk Persegi Panjang
    public static double hitungPersegiPanjang(double p, double l) {
        return p * l;
    }

    // Method dengan parameter untuk Segitiga
    public static double hitungSegitiga(double a, double t) {
        return 0.5 * a * t;
    }

    // Method dengan parameter untuk Lingkaran
    public static double hitungLingkaran(double r) {
        final double PHI = 3.14159;
        return PHI * r * r;
    }
    
}

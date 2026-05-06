/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persoalan1;

/**
 * @author achmad_khusnul_yakin
 */

public class after1 {
    public static void main(String[] args) {
       int bil = 10;
        String b[] = {"a", "k", "y"};
    
        try {
            System.out.println(bil / 0);
        } catch (ArithmeticException iq) {
            System.out.println("Error Aritmetik");
            System.out.println(iq.getMessage());
        }

        System.out.println("-------------------------");

        // Blok Kedua
        try {
            System.out.println(b[3]);
        } catch (ArrayIndexOutOfBoundsException i) {
            System.out.println("ERROR BOS! panjang arraynya overlimit, pastikan cek ulang");
            System.out.println(i.getMessage());
        } catch (Exception q) {
            System.out.println("Terdeteksi Error Lain");
            System.out.println(q.getMessage());
        }
    }
}
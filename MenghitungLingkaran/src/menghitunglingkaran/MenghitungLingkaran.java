/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menghitunglingkaran;

import java.util.Scanner;

public class MenghitungLingkaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r, luas, keliling;
        final double PHI = 3.14;

        System.out.print("Masukan Nilai Radius : ");
        r = input.nextDouble();

        luas = PHI * r * r;
        keliling = 2 * PHI * r;

        System.out.println("Hasil Perhitungan");
        System.out.println("Luas Lingkaran     : " + luas);
        System.out.println("Keliling Lingkaran : " + keliling);
    }
}
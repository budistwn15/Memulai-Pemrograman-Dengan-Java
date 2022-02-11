/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Dasar;

import java.util.Scanner;

/**
 *
 * @author Budi Setiawan
 */
public class InputOutputFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan sangat sederhana");
        System.out.print("Masukkan angka pertama: ");
        int value = scanner.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int anotherValue = scanner.nextInt();
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah "+result);
    }
}

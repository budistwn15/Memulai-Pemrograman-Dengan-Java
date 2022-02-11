/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Dasar;

/**
 *
 * @author Budi Setiawan
 */
public class IndexOutOfBond {
    public static void main(String[] args) {
        int[] arrA = {1, 2, 3, 4};
        System.out.println(arrA[0]);
        System.out.println(arrA[1]);
        System.out.println(arrA[2]);
        // Akses indeks ke 4
        System.out.println(arrA[4]);
    }
}

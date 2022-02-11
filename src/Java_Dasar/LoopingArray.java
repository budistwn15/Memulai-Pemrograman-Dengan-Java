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
public class LoopingArray {
    public static void main(String[] args) {
        int[] arrInt = new int[10];
        
        for(int i=0;i<arrInt.length;i++){
            arrInt[i] = i + 1;
            System.out.println(arrInt[i]);
        }
    }
}

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
public class OperatorEquality {
    public static void main(String[] args) {
        int value = 5;
        int anotherValue = 4;
        boolean result;
        result = value == anotherValue;
        
        System.out.println("Hasil 'value == anotherValue' adalah "+result);
        System.out.println();
        
        System.out.println("Tidak sama dengan");
        result = value != anotherValue;
        System.out.println("Hasil 'value != anotherValue' adalah "+result);
        System.out.println();
        
        System.out.println("Lebih besar dari");
        result = value > anotherValue;
        System.out.println("Hasil 'value > anotherValue' adalah "+result);
        System.out.println();
        
        System.out.println("Sama atau lebih besar dari");
        result = value >= anotherValue;
        System.out.println("Hasil 'value >= anotherValue' adalah "+result);
        System.out.println();
        
        System.out.println("Kurang dari..");
        result = value < anotherValue;
        System.out.println("Hasil 'value < anotherValue' adalah "+result);
        System.out.println();
        
        System.out.println("Sama atau kurang dari");
        result = value <= anotherValue;
        System.out.println("Hasil 'value <= anotherValue' adalah "+result);
        System.out.println();
    }
}

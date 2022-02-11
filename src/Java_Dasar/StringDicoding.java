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
public class StringDicoding {
    public static void main(String[] args) {
        // 1. String
        String greeting = "Hello World";
        System.out.println(greeting);
        
        //2. String Constructor
        char[] dicodingChars = {'d','i','c','o','d','i','n','g'};
        String dicodingString = new String(dicodingChars);
        System.out.println(dicodingString);
        
        //3. length
        String dicoding = "dicoding";
        int length = dicoding.length();
        System.out.println(length);
        
        //charAt
        
        String dicodingChar = "dicoding";
        char result = dicodingChar.charAt(7);
        System.out.println(result);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4_arrays_strings_memory_sourcecontrol;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author tonek
 */
public class Task3a_PrintLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
        int[] numbers = new int[N];
        
        int maxNumber = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
                System.out.println(maxNumber);
            }
        }
    }
    
}

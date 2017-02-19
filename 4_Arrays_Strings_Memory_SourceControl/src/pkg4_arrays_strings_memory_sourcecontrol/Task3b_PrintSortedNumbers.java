/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4_arrays_strings_memory_sourcecontrol;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tonek
 */
public class Task3b_PrintSortedNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
        int[] numbers = new int[N];
                
        int temp;
        
        for (int i = 0; i < N; i++) {
            numbers[i] = input.nextInt();
        }
        
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < N - 1; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.print(numbers[N - 1]);
        System.out.println();
    }
    
}

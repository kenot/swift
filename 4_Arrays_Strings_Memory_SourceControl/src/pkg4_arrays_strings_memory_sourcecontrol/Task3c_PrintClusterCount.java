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
public class Task3c_PrintClusterCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
        int[] numbers = new int[N];
        
        int temp = 0;
        
        for (int i = 0; i < N; i++) {
            numbers[i] = input.nextInt();
        }
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < (numbers.length - i); j++) {
                if (numbers[j - 1] > numbers[j]) {
                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        
        int numDuplicate = 0;
        int dupCount = 0;
        int previous = -1;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == previous) {
                ++numDuplicate;
                if (numDuplicate == 1) {
                    ++dupCount;
                    if (dupCount == 1) {
                        System.out.print(numbers[i]);
                    }
                    else{
                        System.out.print(", " + numbers[i]);
                    }
                }
            }
            else{
                previous = numbers[i];
                numDuplicate = 0;
            }
        }
        System.out.println("\nNumber of duplicate values: " + dupCount);
    }
    
}

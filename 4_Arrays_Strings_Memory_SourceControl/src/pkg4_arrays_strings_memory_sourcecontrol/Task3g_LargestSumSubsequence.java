/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4_arrays_strings_memory_sourcecontrol;
import java.util.Scanner;

/**
 *
 * @author tonek
 */
public class Task3g_LargestSumSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numberCount = sc.nextInt();
        int[] numbers = new int[numberCount];
        
        numbers[0] = sc.nextInt();
        int currentMax = numbers[0];
        int globalMax = numbers[0];
        int currentStart = 0;
        int bestSumIdxStart = 0;
        int bestSumIdxEnd = 0;
        
        for(int i = 1; i < numberCount; i++){
            numbers[i] = sc.nextInt();
         
            currentMax += numbers[i];

            if (currentMax < 0){
                currentStart = i + 1;
                currentMax = 0;
            }

            if (globalMax < currentMax) {
                globalMax = currentMax;
                bestSumIdxStart = currentStart;
                bestSumIdxEnd = i;
            }
        }
        
        for(int i = bestSumIdxStart; i <= bestSumIdxEnd ; i++){
            System.out.print(numbers[i] + " ");
        }
        
        System.out.println();
    }
    
}

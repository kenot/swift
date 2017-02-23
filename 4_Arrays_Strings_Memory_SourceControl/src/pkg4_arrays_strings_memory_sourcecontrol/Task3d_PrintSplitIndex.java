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
public class Task3d_PrintSplitIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numberCount = sc.nextInt();
        int[] numbers = new int[numberCount];
        
        int[] sums = new int[numberCount];
        int totalSum = 0;
        
        for(int i = 0; i < numberCount; i++){
            numbers[i] = sc.nextInt();
            totalSum += numbers[i];
            sums[i] = totalSum;
        }
        
        if(totalSum % 2 == 0){
            
            for(int i = 0; i < numberCount; i++){
                if(sums[i] * 2 == totalSum){
                    System.out.println(i);
                    return;
                }
            }
            
        }
        
        System.out.println("NO");
    }
    
}

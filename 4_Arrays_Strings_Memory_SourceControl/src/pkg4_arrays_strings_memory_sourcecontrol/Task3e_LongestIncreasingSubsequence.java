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
public class Task3e_LongestIncreasingSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numberCount = sc.nextInt();
        int[] numbers = new int[numberCount];
        
        numbers[0] = sc.nextInt();
        
        int currentIdx = 0;
        int currentLength = 1;
        int longestSeqIdx = 0;
        int longestLength = 1;
        
        for(int i = 1; i < numberCount; i++){
            numbers[i] = sc.nextInt();
        
            if(numbers[i] > numbers[i - 1]) {
                currentLength++;
            } else{
                if(longestLength < currentLength) {
                    longestSeqIdx = currentIdx;
                    longestLength = currentLength;
                }
                
                currentIdx = i;
                currentLength = 1;
            }
        }
        
        if(longestLength < currentLength) {
            longestSeqIdx = currentIdx;
            longestLength = currentLength;
        }
       
        for(int i = 0; i < longestLength; i++){
            System.out.print(numbers[longestSeqIdx + i] + " ");
        }
    }
    
}

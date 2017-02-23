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
public class Task3i_FindKInSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int numberCount = sc.nextInt();
        int[] numbers = new int[numberCount];
        
        int k = sc.nextInt();
       
        for(int i = 0; i < numberCount; i++){
            numbers[i] = sc.nextInt();
        }
        
        // binary search
        
        int idx = -1;
        int start = 0;
        int end = numberCount - 1;
        
        while(start <= end){
            
            int current = (start + end) / 2;
            
            if(numbers[current] == k){
                idx = current;
                break;
            } else if(numbers[current] < k){
                start = current + 1;
            } else{
                end = current - 1;
            }
        }
        
        System.out.println(idx != -1 ? idx : "NO");
    }
    
}

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
public class Task3h_PrintOddFrequencyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numberCount = sc.nextInt();
        
        int result = 0;
        
        for(int i = 0 ; i < numberCount; i++){
           result ^= sc.nextInt(); 
        }
        
        System.out.println(result);
    }
    
}

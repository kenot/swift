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
        Scanner sc = new Scanner(System.in);
        
        int numberCount = sc.nextInt();
        int[] numbers = new int[numberCount];
        
        int clusterCount = 0;
        boolean oldCluster = false;
        
        numbers[0] = sc.nextInt();
        
        for(int i = 1; i < numberCount; i++){
            numbers[i] = sc.nextInt();
            
            if(numbers[i] == numbers[i-1]) {
                if(!oldCluster) {
                    clusterCount++;
                }
                
                oldCluster = true;
            } else{
                oldCluster = false;
            }
        }
        
        System.out.println(clusterCount);
    }
    
}

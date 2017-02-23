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
public class Тask2а_PrintMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] array = new int[n][n];
        int x = 1;
        
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                array[col][row] = x++;
            }
        }
        
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.printf("%4d", array[row][col]);
            }
            System.out.println();
        }
    }
    
}

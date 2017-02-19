/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3_consoleio_conditionaloperators_loops;
import java.util.Scanner;

/**
 *
 * @author tonek
 */
public class Task4b_PrintZFigure {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            
            for (int row = 0; row < N; row++) {
                for (int col = 0; col < N; col++) {
                    if (row == 0 || row == N - 1 || col == N - 1 - row) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                    
                }
                System.out.println();        
        }
            
    }
    
}

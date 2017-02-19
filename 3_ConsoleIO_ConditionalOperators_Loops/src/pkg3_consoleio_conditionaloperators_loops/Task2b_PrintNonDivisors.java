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
public class Task2b_PrintNonDivisors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            if ((i % 3 != 0) && (i % 7 != 0)){
                System.out.print(i + " ");               
            }                       
        }
    }
    
}

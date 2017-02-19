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
public class Task2a_PrintSumOfN {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);       
            int n = input.nextInt();
            
            int sum = 0;
            
            for (int i = 1; i <= n; i++) {
                sum += i;
                
        }
            System.out.println(sum);
    }  
}

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
public class Task2d_PrintAllDivisors {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();
            
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                } 
        }
    }
    
}

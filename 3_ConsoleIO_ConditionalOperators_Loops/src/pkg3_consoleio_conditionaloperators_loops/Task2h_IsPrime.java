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
public class Task2h_IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        if (number == 1) {
            System.out.println("true and false");
            return;
        }
        
        if (number % 2 == 0) {
            System.out.println("false");
            return;
        }
        
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
    
}

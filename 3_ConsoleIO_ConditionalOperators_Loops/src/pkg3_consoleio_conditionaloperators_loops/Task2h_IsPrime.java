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
        
        int j = 2;
        int result = 0;
        boolean isPrime = true;
        while(j <= number / 2){
            if (number % j == 0) {
                result = 1;
            }
            j++;
        }
        if (result == 1) {
            System.out.println(isPrime);
        }
        else{
            System.out.println(false);
        }
    }
    
}

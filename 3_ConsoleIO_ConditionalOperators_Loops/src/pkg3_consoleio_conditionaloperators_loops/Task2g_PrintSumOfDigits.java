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
public class Task2g_PrintSumOfDigits {
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           int number = input.nextInt();
           
           int sum = 0;
           while(number > 0){
               sum = sum + number % 10;
               number = number / 10;
           }
           System.out.println(sum);
    }
    
}

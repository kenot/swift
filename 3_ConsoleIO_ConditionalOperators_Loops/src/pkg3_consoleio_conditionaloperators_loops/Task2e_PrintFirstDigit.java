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
public class Task2e_PrintFirstDigit {
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           int number = input.nextInt();
           
           int first = 1;
           for (int i = 10; i < number; i *= 10) {
               first = number / i;
        }
           System.out.println(first);
    }
    
}

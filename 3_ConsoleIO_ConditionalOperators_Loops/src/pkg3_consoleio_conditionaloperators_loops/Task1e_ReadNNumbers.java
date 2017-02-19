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
public class Task1e_ReadNNumbers {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         for (int i = 1; i <= n; i++) {
             int number = sc.nextInt();
             System.out.println(number);
            
        }
    }
    
}

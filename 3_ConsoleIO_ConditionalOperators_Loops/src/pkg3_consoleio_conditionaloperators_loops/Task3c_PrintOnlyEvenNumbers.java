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
public class Task3c_PrintOnlyEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String result = "";
        
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            if (number % 2 == 0) {
                result += number + " ";
            }
        }
        System.out.println(result);
    }
    
}

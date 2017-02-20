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
public class Task3a_PrintMinAndMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int current = sc.nextInt();
        int min = current;
        int max = current;
        
        for (int i = 1; i < n; i++) {
            current = sc.nextInt();
            if (current < min) {
                min = current;
            } else if (current > max) {
                max = current;
            }
        }
        
        
        System.out.print(min + " " + max);
        System.out.println();
    }
    
}

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
public class Task3d_PrintReversedSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        do {
            System.out.print(n-((n/10)*10) + " ");
            n /=10;
        } while (n / 10 > 0);
        System.out.println(n % 10);
    }
    
}

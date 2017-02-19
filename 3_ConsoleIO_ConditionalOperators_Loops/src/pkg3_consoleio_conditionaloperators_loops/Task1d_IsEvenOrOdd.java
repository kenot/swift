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
public class Task1d_IsEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();
        
        if ((userNumber % 2) == 0) {
            
            System.out.println("EVEN");
        }
        
        else{
            System.out.println("ODD");
        }
            
    }
    
}

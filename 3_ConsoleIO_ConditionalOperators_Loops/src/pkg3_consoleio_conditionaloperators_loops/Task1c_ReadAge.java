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
public class Task1c_ReadAge {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int userNumber = sc.nextInt();
           
           if (userNumber >= 18) {
            System.out.println("YES");
        }
           else if (userNumber >= 0 && userNumber < 18) {
            System.out.println("NO");
        }
           else {
               System.out.println("ERROR");
           }
    }
    
}

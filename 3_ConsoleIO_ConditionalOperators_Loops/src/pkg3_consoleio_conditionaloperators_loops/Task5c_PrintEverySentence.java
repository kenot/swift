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
public class Task5c_PrintEverySentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        
        for(char c : input.toCharArray()){
            System.out.print(c);
            
            if (c == '.' || c == '!' || c == '?') {
                System.out.println();
            }
        }
        System.out.println();
    }
    
}

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
public class Task5b_PrintCountOfWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        int wordCount = 1;
        
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                wordCount++;
            }
        }
        System.out.println(wordCount);
    }
    
}

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
        
        int count = 0;
        boolean oldWord = false;
        
        for(char c: input.toCharArray()){
            if (('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z')){
                if (!oldWord) {
                    oldWord = true;
                    count++;
                }
            } else{
                oldWord = false;
            }
        }
        System.out.println(count);
    }
    
}

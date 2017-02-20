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
public class Task5d_SumOfNumbersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        int n = 0;
        int sum = 0;
        
        for(char c : input.toCharArray()){
            if ('0' <= c && c <= '9') {
                n = n * 10 + (c - '0');
            } else{
                sum += n;
                n = 0;
            }
        }
        sum += n;
        System.out.println(sum);
    }
    
}

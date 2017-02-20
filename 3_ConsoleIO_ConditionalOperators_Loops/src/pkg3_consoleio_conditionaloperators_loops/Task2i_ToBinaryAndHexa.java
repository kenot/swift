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
public class Task2i_ToBinaryAndHexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        
        int base = 2;
        int n = number;
        
        String result = "";
        
        while(n != 0){
            result = n % base + result;
            n /= base;
        }
        
        System.out.println(result);
        
        base = 16;
        n = number;
        result = "";
        
        while(n != 0){
            int digit = n % base;
            
            if (digit < 10) {
                result = digit + result;
            } else{
                result = (char)('A' + (digit - 10)) + result;
            }
            
            n /= base;
        }
        System.out.println(result);
    }
}

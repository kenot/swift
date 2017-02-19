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
        
        int sum = 0;
        
        String num = "";
        
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                num = num + input.charAt(i);
            }
            else if (!num.equals("")) {
                sum = sum + Integer.parseInt(num);
                num = "";
            }
        }
        System.out.println(sum);
    }
    
}

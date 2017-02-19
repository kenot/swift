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
public class Task2f_PrintMirrorNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberToReverse = input.nextInt();
        
        
        int reversedNumber = 0;
        while(numberToReverse != 0){
            reversedNumber = reversedNumber * 10;
            reversedNumber = reversedNumber + numberToReverse % 10;
            numberToReverse = numberToReverse / 10;
        }
        System.out.println(reversedNumber);
    }
    
}

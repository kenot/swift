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
        int inputNumber = sc.nextInt();
        
        int copyOfInputNumber = inputNumber;
        
        String binary = "";
        
        int rem1 = 0;
        
        while(inputNumber > 0){
            rem1 = inputNumber % 2;
            binary = rem1 + binary;
            inputNumber = inputNumber / 2;
        }
        
        String hexa = "";
        
        char hexaDecimals[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        int rem2 = 0;
        
        while(inputNumber > 0){
            rem2 = inputNumber % 16;
            hexa = hexaDecimals[rem2] + hexa;
            inputNumber = inputNumber / 16;
        }
        
        System.out.println(binary);
        System.out.println(hexa);
    }
}

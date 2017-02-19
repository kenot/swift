/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4_arrays_strings_memory_sourcecontrol;
import java.util.Scanner;
import java.util.Scanner;

/**
 *
 * @author tonek
 */
public class Task1d_PrintString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letters = input.nextLine();
        
        String[] split = letters.split("");
        
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
    
}

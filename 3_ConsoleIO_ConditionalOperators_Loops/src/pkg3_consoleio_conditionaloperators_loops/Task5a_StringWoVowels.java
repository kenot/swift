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
public class Task5a_StringWoVowels {
    public static void main(String[] args) {
       String strOrig, strNew;
       Scanner scan = new Scanner(System.in);
       
       strOrig = scan.nextLine();
       
       strNew = strOrig.replaceAll("[aeiouAEIOU]", "");
              
       System.out.println(strNew);
    }
    
}

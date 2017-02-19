/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3_consoleio_conditionaloperators_loops;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author tonek
 */
public class Task1f_ReadNNumbersOnNewLines {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           
           List<Integer> anArray = new ArrayList<Integer>();
           
           while(anArray.size() < n){
               int numbers = sc.nextInt();
               anArray.add(numbers);
           }
           System.out.println("\n" + anArray.toString().replace(",", "").replace("[", "").replace("]", ""));
    }
    
}

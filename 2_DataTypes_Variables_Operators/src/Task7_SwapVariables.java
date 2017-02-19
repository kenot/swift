/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author tonek
 */
public class Task7_SwapVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 5; 
        int y = 9;
        x = x ^ y ^ (y = x);
        
        System.out.println(x + " " + y);   
    }
    
}

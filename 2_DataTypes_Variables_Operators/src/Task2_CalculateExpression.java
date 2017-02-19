/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author tonek
 */
public class Task2_CalculateExpression {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ( 3291 + 88581 ) / 14 + ( 1116 % 171 ) * 5 – 312 / ( 4 + 18 )
        int nFirst = (3291 + 88581) / 14;
        int nSecond = (1116 % 171) * 5;
        int nThird = 312 / (4 + 18);
        
        System.out.println(nFirst + nSecond - nThird);
        
        int n = (3291 + 88581) / 14 + (1116 % 171) * 5 - 312 / (4 + 18);
        
        System.out.println(n);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author tonek
 */
public class Task1_ResultFromCodeFragment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // a)
        int a = 5;
        int b = 10;
        int c = ++a * b--;
        
        System.out.println(c);
        
        // b)
        System.out.println("1 + 2 = " + 1 + 2);
        System.out.println("1 + 2 = " + (1 + 2));
        
        // c)
        System.out.println(1 + 2 +  "abc");
        System.out.println("abc" + 1 + 2);
        
        // d)
        int x = 7; 
        float y = 5.6f;
        float z = x * y;
        System.out.println(z + " " + (x * y) );
    }
    
}

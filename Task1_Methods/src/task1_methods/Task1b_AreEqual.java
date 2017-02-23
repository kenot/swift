/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_methods;

/**
 *
 * @author tonek
 */
public class Task1b_AreEqual {
    static void AreEqual(int number1, int number2){
        if (number1 == number2) {
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }
    
    public static void main(String[] args) {
        AreEqual(2, 3);
    }
    
}

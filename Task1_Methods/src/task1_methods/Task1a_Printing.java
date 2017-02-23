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
public class Task1a_Printing {

    static void PrintPersonInfo(String name){
        System.out.println(name);
    }
    
    static void PrintPersonInfo(String name, int age){
        System.out.println(name + " is " + age + " years old.");
    }
    
    public static void main(String[] args) {
        PrintPersonInfo("Stoyan", 29);
    }
    
}

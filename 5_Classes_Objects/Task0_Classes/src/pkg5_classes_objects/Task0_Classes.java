/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5_classes_objects;

/**
 *
 * @author tonek
 */
import java.util.Scanner;
public class Task0_Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person = new Person();
        
        String result = person.getDescription();
        
        System.out.println(result);
    }
    
}

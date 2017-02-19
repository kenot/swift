/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author tonek
 */
public class Task10_PersonCharacteristics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstName = "Georgi";
        String lastName = "Georgiev";
        int yearOfBirth = 2002;
        int currentYear = 2017;
        int age = currentYear - yearOfBirth;
        double weight = 48.3;
        short height = 156;
        String profession = "student";
       
        System.out.println(firstName + " " + lastName + " is " + age + " years old." + " His weight is " + weight + " and he is " + height + " cm tall. " + "He is a " + profession + ".");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author tonek
 */
public class Task8_SecondsInBiggerIntervals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int input=1234567;
        int numberOfDays;
        int numberOfHours;
        int numberOfMinutes;
        int numberOfSeconds;

        numberOfDays = input / 86400;
        numberOfHours = (input % 86400 ) / 3600 ;
        numberOfMinutes = ((input % 86400 ) % 3600 ) / 60 ;
        numberOfSeconds = ((input % 86400 ) % 3600 ) % 60  ;
        
        System.out.println(numberOfDays + " days," + " " + numberOfHours + " hours," + " " + numberOfMinutes + " minutes," + " " + numberOfSeconds + " seconds");

    }
    
}

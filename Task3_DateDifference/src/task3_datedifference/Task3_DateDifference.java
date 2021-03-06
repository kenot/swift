/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3_datedifference;

/**
 *
 * @author tonek
 */import java.util.Scanner;
public class Task3_DateDifference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        
        SwiftDate date1 = parseSwiftDate(line1);
        SwiftDate date2 = parseSwiftDate(line2);

        System.out.println(date1.getDaysDifference(date2));
        System.out.println(date1.getInfo());
        System.out.println(date2.getInfo());
    }
    
    private static SwiftDate parseSwiftDate(String line1) throws NumberFormatException {
        String[] split = line1.split(" ");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);
        return new SwiftDate(year, month, day);
    }
    
}

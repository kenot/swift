/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4_arrays_strings_memory_sourcecontrol;
import java.util.Arrays;

/**
 *
 * @author tonek
 */
public class Task1b_CreateStringArray {
    public static void main(String[] args) {
        String names = "Peter, Ivan, Georgi, Stoyan";
        String[] split = names.split(",");
        
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i].trim());
        }
    }
    
}

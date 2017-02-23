/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_methods;
import java.util.Arrays;

/**
 *
 * @author tonek
 */
public class Task1c_Contains {
    
    public int GetArrayIndex(int array[], int value){
          
       
        for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    return i;
                } else{
                    return -1;
                }
            }
    }
    
    public static void main(String[] args) {
        int indexNum = GetArrayIndex(2, 2);
        
        System.out.println(indexNum);
    }
    
}

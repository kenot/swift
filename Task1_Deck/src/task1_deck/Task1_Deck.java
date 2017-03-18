/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1_deck;

/**
 *
 * @author tonek
 */
public class Task1_Deck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for (Suits s : Suits.values()) {
            for (Ranks r : Ranks.values()) {
                 Card c = new Card(s,r);
                 System.out.println(c);
            }  
        }
    }
    
}

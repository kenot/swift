/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task0_cards;

/**
 *
 * @author tonek
 */
public class Task0_Cards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(CardSuit value: CardSuit.values()){
            System.out.print(value.name() + ", ");
        }
        
        System.out.println();
        
        for(CardRank value: CardRank.values()){
            System.out.print(value.name() + ", ");
        }
        
        System.out.println();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4_market;

/**
 *
 * @author tonek
 */
public class Product {
    private String _name;
    private double _price;
    
    Product(String name, double price) {
        _name = name;
        _price = price;
    }

    String getName() {
        return _name;
    }

    double getPrice() {
        return _price;
    }
    
}

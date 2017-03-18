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
class Person {
    private String _name;
    private double _balance;
    private int _productsCount;
    
    private Product[] _productsBought;
    
    Person(String name, double balance) {
        _name = name;
        _balance = balance;
        _productsBought = new Product[500];
        _productsCount = 0;
    }

    String getName() {
        return _name;
    }

    boolean tryBuy(Product product) {
        if(_balance >= product.getPrice()){
            _balance -= product.getPrice();
            _productsBought[_productsCount++] = product;
            return true;
        } 
        
        return false;
    }

    Product[] getProductsBought() {
        
        Product[] products = new Product[_productsCount];
        
        //System.arraycopy(_productsBought, 0, products, 0, _productsCount);
        
        for(int i = 0 ; i < _productsCount; i++){
            products[i] = _productsBought[i];
        }
        
        return products;
    }
    
}

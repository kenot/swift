/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3_bankmanagement;

import Security.Credentials;

class Account {
    private Credentials _credentials;
    private String      _name;
    private String      _govId;
    
    private double      _balance;
    
    protected Account(Credentials credentials, String name, String govId){
        _credentials = credentials;
        _name = name;
        _govId = govId;
        
        _balance = 0;
    }
    
    void deposit(double amount){
        _balance += amount;
    }
    
    void withdraw(double amount){
        _balance -= amount;
    }
   
    boolean hasAccess(String password){
        return _credentials.matchPassword(password);
    }
    
    double getBalance(){
        return _balance;
    }
    
    String getName(){
        return _name;
    }
    
    String getGovId(){
        return _govId;
    }
    
    String getUsername(){
        return _credentials.getUsername();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5_classes_objects;

/**
 *
 * @author tonek
 */
public class Person {
    String name;
    int age;
    
    public Person(){
        name = "No name";
        age = -1;
    }

    public Person(String name){
        this.name = name;
        age = -1;
    }
    
    public Person(String name, int age){
        this.name = name;
        if(0 <= age && age <= 150){
            this.age = age;
        }
        else{
            age = -1;
            System.out.println("There was an error with age data");
        }
    }   
    
    public int getAge(){
        return age;
    }
    
    public String getName(){
        return name;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    String getDescription(){
        if (name.equals("No name") && age == -1) {
            return "I am John Doe";
        }
        else if (age == -1) {
            return "I am " + name;
        }
        else{
            return String.format("I am %s. I am %d years old.", name, age);
        }
    }
}





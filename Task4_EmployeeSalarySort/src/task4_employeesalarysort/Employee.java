/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4_employeesalarysort;

/**
 *
 * @author tonek
 */
public class Employee {
    String name;
    int age;
    String email;
    double salary;
    String position;
    String department;
    
    Employee(String name, double salary, String position, String department, int age, String email){
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = age;
        this.email = email;
    }
    
    Employee(String name, double salary, String position, String department){
        this(name, salary, position, department, -1, null);
    }

    Employee(String name, double salary, String position, String department, String email) {
        this(name, salary, position, department, -1, email);
    }

    Employee(String name, double salary, String position, String department, int age) {
        this(name, salary, position, department, age, null);
    }
}

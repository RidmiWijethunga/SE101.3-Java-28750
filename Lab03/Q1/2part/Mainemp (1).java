
package com.mycompany.mainemp;

public class Mainemp {

    public static void main(String[] args) {
         // Create an Employee object
        employee e = new employee();

        // Set values using setters
        e.setName("james");
        e.setAge(25);
        e.setSalary(50000.0);

        // Get values using getters and print them
        System.out.println("Name: " + e.getName());
        System.out.println("Age: " + e.getAge());
        System.out.println("Salary: " + e.getSalary());
    }
}

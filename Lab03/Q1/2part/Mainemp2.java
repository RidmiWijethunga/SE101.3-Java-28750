

package com.mycompany.mainemp2;

public class Mainemp2 {

    public static void main(String[] args) {
         // Create an Employee object using the constructor
        employee2 employee = new employee2("James", 25, 50000.0);

        // Get values using getters and print them
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());
    
    }
}

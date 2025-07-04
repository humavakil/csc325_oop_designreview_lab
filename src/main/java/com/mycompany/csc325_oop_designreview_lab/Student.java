/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
    private double gpa;
    private String address;

    // Constructor
    public Student(String name, short age) {
        super(name, age);
    }

    // GPA getter and setter
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Implement abstract methods from Human
    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    // toString override
    @Override
    public String toString() {
        return "Student{Name='" + getName() + "', Age=" + getAge() +
                ", GPA=" + gpa + ", Address='" + address + "'}";
    }
}

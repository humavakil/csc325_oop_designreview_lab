package com.mycompany.csc325_oop_designreview_lab;

/**
 * Freshman class extending Student.
 * Represents a freshman student with credits.
 */
public class Freshman extends Student {
    private int credits;

    public Freshman(String name, short age, int credits) {
        super(name, age);
        this.credits = credits;
    }

    // Credits getter and setter
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    // toString override
    @Override
    public String toString() {
        return "Freshman{Name='" + getName() + "', Age=" + getAge() +
                ", GPA=" + getGpa() + ", Credits=" + credits +
                ", Address='" + getAddress() + "'}";
    }
}


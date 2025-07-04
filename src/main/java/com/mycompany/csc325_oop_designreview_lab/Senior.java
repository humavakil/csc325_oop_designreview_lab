package com.mycompany.csc325_oop_designreview_lab;

/**
 * Senior class extending Student.
 *
 */
public class Senior extends Student {
    private int credits;

public Senior(String name, short age, int credits) {
    super(name, age);
    if (credits < 85) {
        throw new IllegalArgumentException("Senior must have at least 85 credits.");
    }
    this.credits = credits;
}

// Credits getter and setter with validation
public int getCredits() {
    return credits;
}

public void setCredits(int credits) {
    if (credits < 85) {
        throw new IllegalArgumentException("Senior must have at least 85 credits.");
    }
    this.credits = credits;
}

// toString override
@Override
public String toString() {
    return "Senior{Name='" + getName() + "', Age=" + getAge() +
            ", GPA=" + getGpa() + ", Credits=" + credits +
            ", Address='" + getAddress() + "'}";
}
}

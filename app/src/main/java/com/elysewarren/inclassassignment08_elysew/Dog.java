package com.elysewarren.inclassassignment08_elysew;

/**
 * Created by elysewarren on 3/28/17.
 */

public class Dog {
    public String dogType;
    public int age;
    public boolean allergies;

    public Dog() {
    }

    public Dog(String dogType, int age, boolean allergies) {
        this.dogType = dogType;
        this.age = age;
        this.allergies = allergies;
    }

    public String getDogType() {
        return dogType;
    }

    public int getAge() {
        return age;
    }

    public boolean isAllergies() {
        return allergies;
    }

    @Override
    public String toString() {
        return "Dog Type: " + dogType + "\nDog Age: " + age + "\n Allergies: " + allergies + "\n";
    }
}

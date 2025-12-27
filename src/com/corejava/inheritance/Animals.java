package com.corejava.inheritance;

// Animals.java
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println(this.name + " is making sound");
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println(this.name + " says vow vow");
    }
}

class BabyDog extends Dog {

    public BabyDog(String name) {
        super(name);
    }

    void barkSmall() {
        System.out.println(this.name + " says piu piu");
    }

    @Override
    void makeSound() {
        super.makeSound();
        super.bark();
        barkSmall();
    }

}

public class Animals {
    public static void main(String[] args) {

        BabyDog bruno = new BabyDog("Bruno");

        bruno.makeSound();
        // bruno.bark();
        // bruno.barkSmall();
    }
}
package com.corejava.interface_;

interface Animal {
    public void makeSOund();

    public void eatFood();
}

interface LivingBeing {
    public void breathe();

    public void walkBy();
}

class Dog {
    int age;
    String name;
    String breed;
    String color;

    Dog(int age, String name, String breed, String color) {
        this.age = age;
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    void getDetails() {
        System.out.println("Name " + this.name);
        System.out.println("Age " + this.age);
        System.out.println("Breed " + this.breed);
        System.out.println("Color " + this.color);
    }
}

class BabyDog extends Dog implements Animal, LivingBeing {
    boolean is_hungry;

    public BabyDog(int age, String name, String breed, String color, boolean is_hungry) {
        super(age, name, breed, color);
        this.is_hungry = is_hungry;
    }

    public void makeSOund() {
        System.out.println("Vau Vau");
    }

    public void eatFood() {
        System.out.println("Eating Food");
    }

    public void breathe() {
        System.out.println("Breathing");
    }

    public void walkBy() {
        System.out.println("Foot");
    }

}

public class Main {
    public static void main(String[] args) {
        BabyDog puppy = new BabyDog(1, "puppy", "idk", "white", false);
        System.out.println(puppy.name);
    }
}
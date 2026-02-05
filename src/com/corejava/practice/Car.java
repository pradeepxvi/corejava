package com.corejava.practice;

// file name : Car.java

import java.util.Scanner;

class MyCar {
    int carNumber;
    String carName;
    int carModel;
    String carColor;
    String carFuel;

    MyCar(int carNumber, String carName, int carModel, String carColor, String carFuel) {
        this.carNumber = carNumber;
        this.carName = carName;
        this.carModel = carModel;
        this.carColor = carColor;
        this.carFuel = carFuel;
    }

    void getCarInfo() {
        System.out.println("Car Name  = " + this.carName);
        System.out.println("Car color  = " + this.carColor);
        System.out.println("Car number  = " + this.carNumber);
        System.out.println("Car model  = " + this.carModel);
        System.out.println("Car fuel  = " + this.carFuel);
    }

}

public class Car {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter car name : ");
            String carName = sc.nextLine();

            System.out.print("Enter car number : ");
            int carNumber = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter car color : ");
            String carColor = sc.nextLine();

            System.out.print("Enter car model : ");
            int carModel = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter car fuel : ");
            String carFuel = sc.nextLine();

            MyCar car = new MyCar(carNumber, carName, carModel, carColor, carFuel);

            car.getCarInfo();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

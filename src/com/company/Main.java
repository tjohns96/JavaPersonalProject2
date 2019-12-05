package com.company;

import java.util.Scanner;
/**
 * @Author Trevor Johnson
 * @Version 1.1
 */

/**
 * The main class that displays sample cars, and runs the loop that allows players to create new cars and check their speed
 */
public class Main {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Welcome user! Here are some example cars we have on the lot!");
    Car car = new Car("Ford", "Explorer", 2013);
    car.printInfo();
    Sedan sedan = new Sedan("Ford", "Focus", 2019);
    sedan.printInfo();
    Truck truck = new Truck("Chevy", "Durado", 2019);
    truck.printInfo();
    Van van = new Van("Honda", "Odyssey", 2012);
    van.printInfo();
    String goAgain;
    System.out.println(
        "Would you like to make your own car? Enter yes to continue, anything else to quit.");
    goAgain = s.next();
    while (goAgain.toLowerCase().equals("yes")) {
      System.out.println("Excellent choice!!!");
      boolean correctInput = false;
      InfoGetter info = new InfoGetter();
      while (correctInput == false) {
        String vehicleType;
        System.out.println("What kind of vehicle would you like to make?");
        vehicleType = s.next();
        vehicleType = vehicleType.toLowerCase();
        int yearMade;
        String make;
        String model;
        switch (vehicleType) {
          case "car":
            make = info.getMake();
            model = info.getModel();
            yearMade = info.getYearMade();
            Car car1 = new Car(make, model, yearMade);
            System.out.println("She's a real beauty! Let's learn about her!");
            car1.printInfo();
            car1.rev();
            correctInput = true;
            break;
          case "truck":
            make = info.getMake();
            model = info.getModel();
            yearMade = info.getYearMade();
            Truck truck1 = new Truck(make, model, yearMade);
            System.out.println("She's a real beauty! Let's learn about her!");
            truck1.printInfo();
            truck1.rev();
            correctInput = true;
            break;
          case "sedan":
            make = info.getMake();
            model = info.getModel();
            yearMade = info.getYearMade();
            Sedan sedan1 = new Sedan(make, model, yearMade);
            System.out.println("She's a real beauty! Let's learn about her!");
            sedan1.printInfo();
            sedan1.rev();
            correctInput = true;
            break;
          case "Van":
            make = info.getMake();
            model = info.getModel();
            yearMade = info.getYearMade();
            Van van1 = new Van(make, model, yearMade);
            System.out.println("She's a real beauty! Let's learn about her!");
            van1.printInfo();
            van1.rev();
            correctInput = true;
            break;
          default:
            System.out.println("Enter a correct vehicle type. To refresh, you can make a car, sedan, truck, or van.");
        }
      }
      System.out.println("Go again? Just 1 more time...Enter yes for another go :)");
      goAgain = s.next();
    }
  }
}

package com.company;

import java.util.Random;

public class Car extends Vehicle implements basicCarStuff {
  private String make;
  private String model;
  private int yearMade;
  private CarTypes car = CarTypes.CAR;
  private Random rng = new Random();

  public Car(String make, String model, int yearMade) {
    this.make = make;
    this.model = model;
    this.yearMade = yearMade;
  }

  public void printInfo() {
    super.printInfo(car);
    System.out.println("It's pretty generic and can be a lot of things.");
    System.out.println(
        "This car is a " + make + " " + model + " and was made in " + yearMade + ".");
  }

  @Override
  public void rev() {
    super.rev();
    System.out.println("vrooom");
    double speed = rng.nextInt(4) + 5 + rng.nextDouble();
    System.out.printf("Reached 60 mph in %.2f seconds. ", speed);
    if (speed < 6) {
      System.out.println("Wow that's a fast car!");
    } else if (speed >= 6 && speed < 7.5) {
      System.out.println("It has average speed.");
    } else {
      System.out.println("Sadly, the car is pretty slow...it must not be German.");
    }
  }
}

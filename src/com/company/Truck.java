package com.company;

import java.util.Random;

public class Truck extends Vehicle implements basicCarStuff {
  private String make;
  private String model;
  private int yearMade;
  private CarTypes truck = CarTypes.TRUCK;
  private Random rng = new Random();

  public Truck(String make, String model, int yearMade) {
    this.make = make;
    this.model = model;
    this.yearMade = yearMade;
  }

  public void printInfo() {
    super.printInfo(truck);
    System.out.println("This is a super hardcore vehicle that can tow your stuff!");
    System.out.println(
        "This car is a " + make + " " + model + " and was made in " + yearMade + ".");
  }

  @Override
  public void rev() {
    super.rev();
    System.out.println("VROOOOOOOOOM");
    double speed = rng.nextInt(4) + 8 + rng.nextDouble();
    System.out.printf("Reached 60 mph in %.2f seconds. ", speed);
    if (speed < 9) {
      System.out.println("Wow that's a fast truck!");
    } else if (speed >= 9 && speed < 10.5) {
      System.out.println("It has average speed.");
    } else {
      System.out.println("Sadly, this truck is pretty slow...At least it's strong!");
    }
  }
}

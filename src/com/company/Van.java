package com.company;

import java.util.Random;

public class Van extends Vehicle implements basicCarStuff {
  private String make;
  private String model;
  private int yearMade;
  private CarTypes van = CarTypes.VAN;
  private Random rng = new Random();

  public Van(String make, String model, int yearMade) {
    this.make = make;
    this.model = model;
    this.yearMade = yearMade;
  }

  public void printInfo() {
    super.printInfo(van);
    System.out.println("This car is great at getting your kids around!");
    System.out.println(
        "This car is a " + make + " " + model + " and was made in " + yearMade + ".");
  }

  @Override
  public void rev() {
    super.rev();
    System.out.println("vrroooOOM");
    double speed = rng.nextInt(4) + 7 + rng.nextDouble();
    System.out.printf("Reached 60 mph in %.2f seconds. ", speed);
    if (speed < 8) {
      System.out.println("Wow that's a fast van!");
    } else if (speed >= 8 && speed < 9.5) {
      System.out.println("It has average speed.");
    } else {
      System.out.println("Sadly, this van is pretty slow...there must be a lot of kids in there.");
    }
  }
}

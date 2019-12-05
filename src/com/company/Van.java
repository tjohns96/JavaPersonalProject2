package com.company;

import java.util.Random;

/**
 * The van class models a standard van
 */
public class Van extends Vehicle implements basicCarStuff {
  private String make;
  private String model;
  private int yearMade;
  private CarTypes van = CarTypes.VAN;
  private Random rng = new Random();

  /**
   *
   * @param make
   * @param model
   * @param yearMade
   */
  public Van(String make, String model, int yearMade) {
    this.make = make;
    this.model = model;
    this.yearMade = yearMade;
  }

  /**
   * Prints the fields of the car in a readable way
   */
  public void printInfo() {
    super.printInfo(van);
    System.out.println("This car is great at getting your kids around!");
    System.out.println(
        "This car is a " + make + " " + model + " and was made in " + yearMade + ".");
  }

  /**
   * This speeds the car up and tells you how fast it accelerated, and if the results were good
   */
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

package com.company;

import java.util.Random;

/**
 * The sedan class models a standard sedan
 */
public class Sedan extends Vehicle implements basicCarStuff {
  private String make;
  private String model;
  private int yearMade;
  private CarTypes sedan = CarTypes.SEDAN;
  private Random rng = new Random();

  /**
   *
   * @param make
   * @param model
   * @param yearMade
   */
  public Sedan(String make, String model, int yearMade) {
    this.make = make;
    this.model = model;
    this.yearMade = yearMade;
  }

  /**
   * Prints the fields of the car in a readable way
   */
  public void printInfo() {
    super.printInfo(sedan);
    System.out.println("It's also pretty stylish and efficient.");
    System.out.println(
        "This sedan is a " + make + " " + model + " and was made in " + yearMade + ".");
  }

  /**
   * This speeds the car up and tells you how fast it accelerated, and if the results were good
   */
  @Override
  public void rev() {
    super.rev();
    System.out.println("hummmmmmm");
    double speed = rng.nextInt(4) + 4 + rng.nextDouble();
    System.out.printf("Reached 60 mph in %.2f seconds. ", speed);
    if (speed < 5) {
      System.out.println("Wow that's a fast sedan!");
    } else if (speed >= 5 && speed < 6.5) {
      System.out.println("It has average speed.");
    } else {
      System.out.println("Sadly, this sedan is pretty slow...it must be a Buick.");
    }
  }
}

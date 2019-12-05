package com.company;

import java.util.Random;

/**
 * The car class models a standard car
 */
public class Car extends Vehicle implements basicCarStuff {
  private String make;
  private String model;
  private int yearMade;
  private CarTypes car = CarTypes.CAR;
  private Random rng = new Random();

  /**
   * This is the constructor that takes arguments and assigns them to appropriate variables.
   * @param make For the make field
   * @param model For the model field
   * @param yearMade For the yearMade field
   */
  public Car(String make, String model, int yearMade) {
    this.make = make;
    this.model = model;
    this.yearMade = yearMade;
  }

  /**
   * Prints the fields of the car in a readable way
   */
  public void printInfo() {
    super.printInfo(car);
    System.out.println("It's pretty generic and can be a lot of things.");
    System.out.println(
        "This car is a " + make + " " + model + " and was made in " + yearMade + ".");
  }

  /**
   * This speeds the car up and tells you how fast it accelerated, and if the results were good
   */
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

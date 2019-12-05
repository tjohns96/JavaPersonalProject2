package com.company;

/**
 * The abstract class for all the vehicles.
 */
abstract class Vehicle implements basicCarStuff {
  private String make;
  private String model;
  private int yearMade;
  private CarTypes car;

  /**
   * Prints the most basic information about the vehicle
   * @param car The type from the enum, so only can be certain values
   */
  @Override
  public void printInfo(CarTypes car) {
    System.out.println("This is a " + car.toString().toLowerCase() + ". It can take you places.");
  }

  /**
   * The start of acceleration, which all vehicles must do
   */
  @Override
  public void rev() {
    System.out.println("Revving up...");
  }
}

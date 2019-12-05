package com.company;

abstract class Vehicle implements basicCarStuff {
  private String make;
  private String model;
  private int yearMade;
  private CarTypes car;

  @Override
  public void printInfo(CarTypes car) {
    System.out.println("This is a " + car.toString().toLowerCase() + ". It can take you places.");
  }

  @Override
  public void rev() {
    System.out.println("Revving up...");
  }
}

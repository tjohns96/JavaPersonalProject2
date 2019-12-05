package com.company;

import java.util.Scanner;

/**
 * A class to get information within the driver class.
 */
public class InfoGetter {
  private String make;
  private String model;
  private int yearMade;
  private Scanner s = new Scanner(System.in);

  /**
   * A method to get the make of a vehicle
   * @return Returns a string for the make
   */
  public String getMake() {
    System.out.println("What is the make of your new vehicle?");
    make = s.next();
    return make;
  }

  /**
   * A method to return the model of a vehicle
   * @return A string that returns the model
   */
  public String getModel() {
    System.out.println("And what is the model of your new vehicle?");
    model = s.next();
    return model;
  }

  /**
   * A method that verifies that an acceptable integer is received
   * @return Returns an integer that is in acceptable range
   */
  public int getYearMade() {
    boolean goodInput = false;
    while (goodInput == false) {
      System.out.println("What year was your vehicle made?");
      try {
        String temp = s.next();
        yearMade = Integer.parseInt(temp);
        if (yearMade < 1900 || yearMade > 2020) {
          throw new ArithmeticException("Enter a valid year!");
        }
        goodInput = true;
      } catch (ArithmeticException e) {
        System.out.println(e.getMessage());
      } catch (Exception e) {
        System.out.println("Enter a year!");
      }
    }
    return yearMade;
  }
}

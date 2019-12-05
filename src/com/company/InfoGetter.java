package com.company;

import java.util.Scanner;

public class InfoGetter {
  private String make;
  private String model;
  private int yearMade;
  private Scanner s = new Scanner(System.in);

  public String getMake() {
    System.out.println("What is the make of your new vehicle?");
    make = s.next();
    return make;
  }

  public String getModel() {
    System.out.println("And what is the model of your new vehicle?");
    model = s.next();
    return model;
  }

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

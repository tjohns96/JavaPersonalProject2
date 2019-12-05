package com.company;

/**
 * An enum that controls what type of vehicles there can be. NO BOATS!
 */
public enum CarTypes {
  CAR("CA"),
  TRUCK("TR"),
  SEDAN("SE"),
  VAN("VA");
  private String code;

  public String getCode() {
    return code;
  }

  private CarTypes(String newCode) {
    code = newCode;
  }
}

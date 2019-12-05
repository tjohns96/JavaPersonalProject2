package com.company;

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

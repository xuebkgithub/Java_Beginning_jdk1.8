package com.atguigu.exer;

public class HourlyEmployee extends Employee {
  private int wage;
  private int hour;

  public HourlyEmployee(String name, int number, MyDate birthday, int wage, int hour) {
    super(name, number, birthday);
    this.wage = wage;
    this.hour = hour;
  }


  @Override
  public double earnings() {
    return wage * hour;
  }

  @Override
  public String toString() {
    return "HourlyEmployee{" +
            "wage=" + wage +
            ", hour=" + hour +
            "} " + super.toString();
  }
}

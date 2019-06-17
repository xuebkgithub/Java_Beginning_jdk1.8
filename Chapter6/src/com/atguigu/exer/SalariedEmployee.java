package com.atguigu.exer;

public class SalariedEmployee extends Employee {
  private double monthlySalary;

  public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
    super(name, number, birthday);
    this.monthlySalary = monthlySalary;
  }

  @Override
  public double earnings() {
    return monthlySalary;
  }

  @Override
  public String toString() {
    return "SalariedEmployee{" +
            "monthlySalary='" + monthlySalary + '\'' +
            "} " + super.toString();
  }
}

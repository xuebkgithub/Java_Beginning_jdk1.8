package Test1;
/*
  * abstract 方法测试实践
 */

class Manager extends Employee{
  private double bonus;
  @Override
  public void work() {
    System.out.println("监督员工的工作,提高效率");
  }

  public double getBonus() {
    return bonus;
  }
}



class CommonEmployee extends Employee{
  @Override
  public void work() {
    System.out.println("在流水线工作");
  }
}

abstract class Employee{
  private String name;
  private int id;
  private double aslary;

  public abstract void work();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getAslary() {
    return aslary;
  }

  public void setAslary(double aslary) {
    this.aslary = aslary;
  }
}
public class TestEmployee {
  public static void main(String[] args) {
    Employee e1 = new Manager();
    e1.work();

    Employee e2 = new CommonEmployee();
    e2.work();
  }
}

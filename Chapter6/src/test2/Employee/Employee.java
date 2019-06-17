package test2.Employee;


public class Employee implements Comparable{
  private String name;
  private Integer age;
  private MyDate birthday;

  public Employee(String name, Integer age, MyDate birthday) {
    this.name = name;
    this.age = age;
    this.birthday = birthday;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", birthday=" + birthday +
            '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public MyDate getBirthday() {
    return birthday;
  }

  public void setBirthday(MyDate birthday) {
    this.birthday = birthday;
  }

  @Override
  public int compareTo(Object o) {
    // 目前按照 name 进行排序
    if (o instanceof Employee){
      Employee o1 = (Employee) o ;
      return this.name.compareTo(o1.name);
    }
    return 0;
  }
}

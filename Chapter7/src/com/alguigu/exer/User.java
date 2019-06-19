package com.alguigu.exer;

import java.util.Objects;

public class User {
  private int Id;
  private int age;
  private String name;

  public User(int id, int age, String name) {
    Id = id;
    this.age = age;
    this.name = name;
  }

  @Override
  public String toString() {
    return "User{" +
            "Id=" + Id +
            ", age=" + age +
            ", name='" + name + '\'' +
            '}';
  }

  public int getId() {
    return Id;
  }

  public void setId(int id) {
    Id = id;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof User)) return false;
    User user = (User) o;
    return Id == user.Id &&
            age == user.age &&
            Objects.equals(name, user.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Id, age, name);
  }
}

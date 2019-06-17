package com.atguigu.exer;
/*
  * 定义一个接口用来实现两个对象比较
 */
public class TestCircle {
  public static void main(String[] args){
    Circle c1 = new  ComparableCircle(1.1);
    Circle c2 = new  ComparableCircle(1.2);
    Circle c3 = new  ComparableCircle(1.3);
    // ((ComparableCircle) c1).compareTo(c2);
    System.out.println(((ComparableCircle) c1).compareTo(c3));
    System.out.println(((ComparableCircle) c1).compareTo(c1));
    System.out.println(((ComparableCircle) c3).compareTo(c2));
    System.out.println(((ComparableCircle) c3).compareTo(c1));
  }
}

interface CompareObject{
  public int compareTo(Object o ); // 若返回值是 0 代表相等,
}

class Circle{
  private double radius;

  public Circle(){
   System.out.println("Circle..");
  }

  public Circle(double radius){
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
}

class ComparableCircle extends Circle implements CompareObject{
  public ComparableCircle(double radius) {
    super(radius);
  }

  @Override
  public int compareTo(Object o) {
    if(this == o){
      return 0;
    }else if (o instanceof ComparableCircle){
      ComparableCircle c = (ComparableCircle)o ;
      if(this.getRadius() > c.getRadius()){
        return 1;
      }else if (this.getRadius() < c.getRadius()){
        return -1;
      }else {
        return 0;
      }
    }
    throw new RuntimeException("传入的非 ComparableCircle 类型不可以进行比较");
  }
}

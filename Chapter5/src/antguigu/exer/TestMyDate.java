package antguigu.exer;

import java.util.Arrays;
import java.util.Objects;

public class TestMyDate {
  public static void main(String[] args){
    MyDate m1 = new MyDate(14, 3, 1976, new int[]{1,2,3});
    MyDate m2 = new MyDate(14, 3, 1976, new int[]{1,2,3});
    if (m1 == m2){
      System.out.println("m1 == m2");
    }else {
      System.out.println("m1 != m2");
    }

    if (m1.equals(m2)){
      System.out.println("m1 is equals to m2");
    }else {
      System.out.println("m1 is not equals to m2");
    }
    System.out.println(m1.toString());

  }
}

class MyDate{
  int year;
  int month;
  int day;
  int[] ints;

  public MyDate(int year, int month, int day, int[] ints) {
    this.year = year;
    this.month = month;
    this.day = day;
    this.ints = ints;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof MyDate)) return false;
    MyDate myDate = (MyDate) o;
    return year == myDate.year &&
            month == myDate.month &&
            day == myDate.day &&
            Arrays.equals(ints, myDate.ints);
  }

  @Override
  public int hashCode() {
    int result = Objects.hash(year, month, day);
    result = 31 * result + Arrays.hashCode(ints);
    return result;
  }

  @Override
  public String toString() {
    return getClass().getName() + "@" + Integer.toHexString(hashCode()) + "{" +
            "year=" + year +
            ", month=" + month +
            ", day=" + day +
            ", ints=" + Arrays.toString(ints) +
            '}';
  }

//  @Override
//  public String toString() {
//    return getClass().getName() + "@" + Integer.toHexString(hashCode()) + "{" +
//            "year=" + year +
//            ", month=" + month +
//            ", day=" + day +
//            "}";
//  }
}



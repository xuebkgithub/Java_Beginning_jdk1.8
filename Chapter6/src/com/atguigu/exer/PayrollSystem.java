package com.atguigu.exer;

import java.util.Scanner;

public class PayrollSystem {
  public static void main(String[] args){
//    Employee e1 = new HourlyEmployee("11", 10,  new MyDate(06,06,2019), 1, 2);
//    System.out.println(e1.toString());
    Employee[] emps = new Employee[2];
    System.out.println(emps);
    emps[1] = new SalariedEmployee("Salaried", 1001, new MyDate(06,06,2019),8800 );
    emps[0] = new HourlyEmployee("Hourly", 1002,  new MyDate(06,06,2019), 100, 6);

    Scanner s = new Scanner(System.in);
    System.out.println("从键盘输入本月的月份:");
    int month = s.nextInt();

    for(int i = 0 ; i < emps.length; i++){
      if(month == emps[i].getBirthday().getMonth()){

        System.out.println("加 100工资");
      }

      System.out.println(emps[i]);
    }
  }
}

import java.util.Scanner;

class Test_While {

  public static void main(String[] args){
    // For 方法变量
    System.out.println("开始");
    Demo2();
  }
  private static void Demo1(){
    /*
      练习：用while循环实现
      左边：求出1-100之和
      右边：统计水仙花数有多少个

      初始化语句;
      while(判断条件语句) {
           循环体语句;
           控制条件语句;
      }



      for(初始化语句;判断条件语句;控制条件语句) {
          循环体语句;
      }

    */
    /*
      //求出1-100之和
      //for语句版本
      while 版本
     */
    int number = 0;
    int count = 0;
    while(count <= 100) {
      number += count;
      count ++ ;
    }
    System.out.println(number);
    /*
      for 语句版本
     */
    number = 0;
    for (int x=1;x <= 100;x++){
      number += x;
    }
    System.out.println(number);
  }

  private static void Demo2(){
    /*
      需求：统计水仙花数有多少个
    */
    // while 版本
    System.out.println("统计水仙花数有多少个");
    int count2 = 0;

    int y = 100;

    while (y < 1000){
      int ge = y % 10;
      int shi = y/10%10;
      int bai = y/10/10%10;
      // 进行最后的想家.来进行过判断
      int _x = ge*ge*ge + shi*shi*shi + bai*bai*bai ;
      // 进行判断
      if (y == _x) {
        System.out.println("数字为: " + y);
        count2 ++;
      }
      y ++ ;
    }

    System.out.println("1000以内的总数: "+ count2);
  }
}
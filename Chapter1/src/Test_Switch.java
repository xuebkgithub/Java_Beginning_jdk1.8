/*
  用switch语句实现键盘录入月份，输出对应的季节

  分析：
      A:键盘录入一个月份，用Scanner实现
      B:用switch语句实现即可
  注意事项：
    case后面只能是常量，不能是变量，而且，多个case后面的值不能出现相同的
    default可以省略吗?可以省略。一般不建议。除非判断的值是固定的。
    break可以省略吗?可以省略，一般不建议。否则结果可能不是你想要的
    default的位置一定要在最后吗?可以出现在switch语句任意位置。
    switch语句的结束条件，遇到break执行到程序的末尾

*/
import java.util.Scanner;

class SwitchTest4 {
  public static void main(String[] args) {
    //创建键盘录入对象
    Scanner sc = new Scanner(System.in);

    //录入数据
    System.out.println("请输入月份(1-12)：");
    int month = sc.nextInt();

    //case穿透
    switch(month) {
      case 1:
      case 2:
      case 12:
        System.out.println("冬季");
        break;
      case 3:
      case 4:
      case 5:
        System.out.println("春季");
        break;
      case 6:
      case 7:
      case 8:
        System.out.println("夏季");
        break;
      case 9:
      case 10:
      case 11:
        System.out.println("秋季");
        break;
      default:
        System.out.println("你输入的月份有误");
    }
  }
}
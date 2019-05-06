import java.util.Scanner;

public class TestIf_Else {
  public static void main(String[] args){
    Demo1();
  }
  private static void Demo1(){
    /*
      从键盘输入 小明的期末成绩
      当成绩为 100 分时, 奖励一辆 bmw;
      当成绩为 (80, 99) 时,奖励一台 iphone x;
      当成绩为 (60, 79) 时,奖励一本书;
      其他什么都没有
     */
    int input_int = 0 ;
    while (true){
      // 获取用户输入
      System.out.println("请输入小明的成绩: ");
      Scanner input = new Scanner(System.in);
      String input_str = input.next();
      // 对比用户输入.来进行跑错处理
      try {
        input_int = Integer.parseInt(input_str);
      }catch (java.lang.NumberFormatException  e){
        System.out.println("请输入整数");
        continue;
      }
      if (input_int > 100) {
        System.out.println("成绩不能大于 100 啊");
        continue;
      }
      break;
    }
    System.out.println("小明的成绩为: " + input_int);
    // 正是逻辑
    if (input_int == 100) {
      System.out.println("奖励一辆 bmw");
    }
    if (input_int > 80 && input_int <= 99 ) {
      System.out.println("奖励一台 iphone x");
    }
    if (input_int > 79 && input_int <= 60 ) {
      System.out.println("奖励一本书");
    }
    System.out.println("什么都没有");
  }
  private static void Demo2(){

  }
}

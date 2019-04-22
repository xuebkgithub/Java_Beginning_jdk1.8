import java.util.Scanner;

/*
  本实例 用来简单学习 java 里面的 for 循环方案.并进行简单的项目讲解.

  循环语句可以在满足循环条件的情况下，反复执行某一段代码，这段被重复执行的代码被称为循环体语句，
  当反复执行这个循环体时，需要在合适的时候把循环判断条件修改为false，
  从而结束循环，否则循环将一直执行下去，形成死循环。

  1. 循环语句的组成
    * 初始化语句：一条或者多条语句，这些语句完成一些初始化操作
    * 判断条件语句：这是一个boolean 表达式，这个表达式能决定是否执行循环体
    * 循环体语句：这个部分是循环体语句，也就是我们要多次做的事情
    * 控制条件语句：这个部分在一次循环体结束后，下一次循环判断条件执行前执行。通过用于控制循环条件中的变量，使得循环在合适的时候结束

 */
class Test_For{

  public static void main(String[] args){
    // For 方法变量
    System.out.println("开始");
    PrintFor();
    ForDemo1();
    Demo3();
  }

  private static void PrintFor(){
    /*
      for 的基本循环构成.
      执行流程
        * 执行初始化语句
        * 执行判断条件语句，看其结果是true还是false
        * 如果是false，循环结束
        * 如果是true，继续执行
        * 执行循环体语句
        * 执行控制条件语句
        * 回到B继续
      注意事项
        * 判断条件语句的结果是一个 boolean 类型
        * 循环体语句如果是一条语句，大括号可以省略；如果是多条语句，大括号不能省略。建议永远不要省略。
        * 一般来说：有左大括号就没有分号，有分号就没有左大括号
     */
    String ForDemo="for (初始化语句;判断小件语句;控制条件语句){\n" +
            "    循环体语句;\n" +
            "}\n";
    System.out.println(ForDemo);

  }

  private static void ForDemo1(){
    /*
      需求：在控制台输出所有的”水仙花数”

      分析：
          我们都不知道什么叫"水仙花数"，你让我怎么做呢?

          所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
          举例：153就是一个水仙花数。
          153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153

          A:三位数其实是告诉了我们范围。
          B:通过for循环我们就可以实现获取每一个三位数
            但是麻烦是如何获取这个三位数的个,十,百位上的数据

            我们如何获取一个数据的个,十,百呢?
              假设有个一个数据:153
              ge: 153%10 = 3
              shi: 153/10%10 = 5
              bai：153/10/10%10 = 1
              qian：x/10/10/10%10
              wan:  x/10/10/10/10%10
              ...

          C:让ge*ge*ge+shi*shi*shi+bai*bai*bai和该数据比较
            如果相同，就把该数据在控制台输出。
      */

    // 定义 基础变量
    // 获取用户输入
    Scanner sc = new Scanner(System.in);
    int number = 100;
    for (int x = 100; x < 10000; x++){
      int ge = x%10;
      int shi = x/10%10;
      int bai = x/10/10%10;

      // 进行最后的想家.来进行过判断
      int _x = ge*ge*ge + shi*shi*shi + bai*bai*bai ;
      // 进行判断
      if (x != _x) {
        continue;
      }
      System.out.println(x);
    }


  }
  private static void  Demo3() {
    // 修饰符 返回值类型 方法名
    /*/
      打印 乘法口诀表
     */
    for(int x=0; x<9; x++) {
      for(int y=0; y<=x; y++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("--------------");
    //为了使用数据，我们从1开始
    for(int x=1; x<=9; x++) {
      for(int y=1; y<=x; y++) {
        System.out.print(y+"*"+x+"="+y*x+"\t");
      }
      System.out.println();
    }
  }

}
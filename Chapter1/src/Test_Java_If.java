import java.util.Scanner;

class IfTest {
  // If 方法的简单 test
  public static void main(String[] args) {
    // 键盘输入的对象
    Scanner sc = new Scanner(System.in);
    while (1 != 0){
      String a = Helps(sc);
      System.out.println();
      if (a.equals("max")){
        Max(sc);
        System.exit(0);
      }
      if (a.equals("number")){
        NumberEvenOfBase(sc);
        System.exit(0);
      }
      System.out.println("输入错误");
    }

  }
  private static String Helps(Scanner sc){
    String x  = "输入 max 进行比大小.输入 number 进行基偶判断";
    System.out.println(x);
    System.out.println("请选择: ");
    String str1 = sc.next();
    return str1;
  }
  private static void Max(Scanner sc){
    // 获取 两个数据中较大的值
    System.out.println("请输入第一个数值: ");
    int a = sc.nextInt();

    System.out.println("请输入第二个数值: ");
    int b = sc.nextInt();
    // 定义 最大接收变量的只

    int max;
    // 开始进行相应的比较
    if (a > b) {
      max = a;
    } else {
      max = b;
    }

    // 打印最终结果

    System.out.println("最大值为: " + max);
    System.out.println("==============================");

  }

  private static void NumberEvenOfBase( Scanner sc) {
    System.out.println("请输入你要判断的 数据: ");
    int a = sc.nextInt();
    // 进行相应的判断
    if(a%2 == 0 ){
      System.out.println("数字: " + a + "这个数是偶数");
    }else {
      System.out.println("数字: " + a + "这个数是基数");
    }
  }
}
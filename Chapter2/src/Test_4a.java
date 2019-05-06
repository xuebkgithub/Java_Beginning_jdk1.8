public class Test_4a {
  public static void main(String[] args){
    // 快速让 n m 进行对调
    Demo1();
    Demo2();
    Demo3();
    Demo4();
  }
  private static void Demo1(){
    /*
      方案 1
     */
    int m = 13;
    int n = 2;
    System.out.println("m: " + m + "\tn: " + n);

    int temp = m;
    m = n;
    n = temp;
    System.out.println("m: " + m + "\tn: " + n);
  }
  private static void Demo2(){
    /*
      方案 2 不用 提供临时变量
     */
    int m = 11;
    int n = 5;
    System.out.println("m: " + m + "\tn: " + n);

    m = m + n; // 获得 两个数的总和. 适合小数字
    n = m - n;
    m = m - n;
    System.out.println("m: " + m + "\tn: " + n);
  }
  private static void Demo3() {
    /*
      方案 3
     */
    int m = 11;
    int n = 5;
    System.out.println("m: " + m + "\tn: " + n);

    m = m ^ n;
    n = m ^ n;
    m = m ^ n;
    System.out.println("m: " + m + "\tn: " + n);
  }
  private static void Demo4() {
    /*
      方案 3
     */
    int m = 60;
    System.out.println("m: " + m );

    String binary = Integer.toBinaryString(m);
    String Octal = Integer.toOctalString(m);

    String hex = Integer.toHexString(m);
    System.out.println("binary: " + binary);
    System.out.println("Octal: " + Octal);
    System.out.println("hex: " + hex);
    System.out.println("m: " + m);
  }
}

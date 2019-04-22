public class Test_2a {
  public static void main(String[] args){
    Demo2();

  }
  private static void Demo1(){
    // 变量之间的运算
    // 容量小的都会自动转换为大的类型
    // char, byte, short >>> int >>> long >>> float >>> double
    int a1 = 12;
    short s1 = 2;
    int a_s = a1 - s1;
    System.out.println("运算结果为: {}" + a_s );
    long l1 = 12345L;
    int i1 = (int)l1;
    int by1 = (byte)l1;
    System.out.println(i1);
    System.out.println(l1);
    System.out.println(by1);

  }
  private static void Demo2(){
    // 变量之间的运算
    // 容量小的都会自动转换为大的类型
    // char, byte, short >>> int >>> long >>> float >>> double
    String str1 = " hello ";
    int i1 = 123;
    char c1 = 'a';
    System.out.println( str1 + i1 + c1);
    System.out.println(i1 + c1 + str1);
    System.out.println(c1 + str1+ i1);


    System.out.println( str1 + (i1 - c1));
    System.out.println(i1 - c1);
    System.out.println(c1 + str1+ i1);


  }
}

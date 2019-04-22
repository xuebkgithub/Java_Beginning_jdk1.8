import java.util.Scanner;

class Test_Function{
  public static void main(String[] args){
    //22
    System.out.println("Test_Function");
    byte b1 = 3;
    byte b2 = 4;
    short s1 = 5;
    short s2 = 5;
    System.out.println(checks(b1,b2));
    System.out.println("===== ===== ===== ===== ===== ");
    System.out.println(checks(b1,s1));
    System.out.println("===== ===== ===== ===== ===== ");
    System.out.println(checks(s1,s2));

  }
  private static boolean checks(byte a, byte b){
    System.out.println("byte: " + a);
    System.out.println("byte: " + b);
    return a == b;
  }

  private static boolean checks(byte a, short b){
    System.out.println("byte: " + a);
    System.out.println("short: " + b);
    return a == b;
  }

  private static boolean checks(short a, short b){
    System.out.println("short: " + a);
    System.out.println("short: " + b);
    return a == b;
  }
}
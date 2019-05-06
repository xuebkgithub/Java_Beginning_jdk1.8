public class Test_3a {
  public static void main(String[] args){
    Demo1();

  }
  private static void Demo1(){
    boolean a = true;
    boolean b = false;

    System.out.println( a & b);
    System.out.println( a && b);
    System.out.println( a | b);
    System.out.println( a || b);
    System.out.println( a & !b);
    System.out.println( a ^ b);

    int i1 = 10;
    if (a & (i1++) >0){
      System.out.println("今天天气晴朗");
    }else {
      System.out.println("难得没有雾霾");
    }
    System.out.println(i1);
    int i2 = 10;
    if (a && (i2++) >0){
      System.out.println("今天天气晴朗");
    }else {
      System.out.println("难得没有雾霾");
    }
    System.out.println(i2);

    int i3 = 10;
    if (a | (i3++) >0){
      System.out.println("今天天气晴朗");
    }else {
      System.out.println("难得没有雾霾");
    }
    System.out.println(i3);
    int i4 = 10;
    if (a || (i4++) >0){
      System.out.println("今天天气晴朗");
    }else {
      System.out.println("难得没有雾霾");
    }
    System.out.println(i4);
  }
}

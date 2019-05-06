public class Test_For {
  public static void main(String[] args){
    Demo1();
  }
  private static void Demo0() {
    /*
      ----*
      ---* *
      --* * *
      -* * * *
      * * * * *
     */
    // 控制最外层 总行数
    int number = 5;
    for (int i = 0; i < number; i++) {

    }
  }
  private static void Demo1(){
    /*
      ----*
      ---* *
      --* * *
      -* * * *
      * * * * *
     */
    // 控制最外层 总行数
    int number = 5;
    for (int i = 0; i < number; i++){
      for (int k = 0; k < (number - 1) - i; k++ ){
        System.out.print("-");
      }
      for (int j = 0 ; j < i + 1; j++ ){
        System.out.print("* ");
      }
      System.out.println("");
    }
  }
  private static void Demo2(){
    /*
      -* * * * *
      --* * * *
      ---* * *
      ----* *
      -----*
     */
    // 控制最外层 总行数
    int number = 6;
    for (int i = 1; i < number; i++){
      for (int k = 0; k < i; k++ ){
        System.out.print("-");
      }
      for (int j = 0; j < number - i; j++ ){
        System.out.print("* ");
      }
      System.out.println("");
    }
  }
  private static void Demo3(){
    /*
     */
    // 控制最外层 总行数
    int day = 0;
    for (int i = 30000; i >= 5; day++){
      i = i / 2;
    }
    System.out.println(day);
  }
  private static void Demo4(){
    /*
    1000 以内的完数
     */
    // 控制最外层 总行数
    for (int i = 1; i <= 1000; i++){
      int factor = 0;
      for (int j = 1 ; j < i; j ++){
        if (i % j == 0) {
          factor += j;
        }
      }
      if (i == factor){
        System.out.println(factor);
      }
    }

  }
}

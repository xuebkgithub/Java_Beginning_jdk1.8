public class TestArray {
  public static void main(String[] args){
    // System.out.print(TestArray.numJewelsInStones("aA", "aAAbbbb"));
    Demo3();
  }
  private static void Demo1(){
    // 数组
    // 1. 定义一个数组
    String[] name_j;
    String name_d[];
    // 1.2 初始化
    // 1.2.1 静态初始化
    name_j = new String[]{"1", "测试"};
    // 1.2.2 动态初始化
    name_d = new String[5];
    name_d[1] = "1";
    name_d[2] = "第二位";
    // 1.3 调用数组
    // 1.3.1 长度
    System.out.println(name_j.length);
    System.out.println(name_d.length);

    // 1.3.2 内存地址
    System.out.println(name_j);
    System.out.println(name_d);
    // 1.3.4 遍历内容
    For_args(name_j);
    For_args(name_d);
  }
  private static void For_args(String[] args){
    System.out.println("开始遍历数组:" + args + " 当前数组长度: "+ args.length);
    for (int i = 0 ; i < args.length; i ++){
      try {
        System.out.print("内存地址:" + Integer.toHexString(args[i].hashCode()));
      }catch(java.lang.NullPointerException e){
        System.out.print("没有内存地址");
      }
      System.out.println(" 下标:" + i + " 值:" + args[i]);
    }
    System.out.println("结束遍历数组:" + args );
  }
  private static int numJewelsInStones(String J, String S) {
    // 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
    //
    //J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
    int J_length = J.length();
    int s_length = S.length();
    // 初始化返回值

    int count = 0;
    // 循环 J 在里面在循环 s
    for (int j = 0; j <= J_length - 1; j++){
      for (int s = 0; s <= s_length - 1 ; s++){
        if (J.charAt(j) == S.charAt(s)){
          count += 1;
        }
      }
    }


    return count;
  }
  private static void Demo3(){
    int num = 707829217;
    int x = 1;
    int num_d = 0;
    int num_x = 0;
    while (x <= num) {
      x += 2;
      if (num % x == 0) {
        System.out.println("发现: " + num + " / " + x + " = " + (num / x));
        num_d = x;
        num_x = num / x;

      }
    }
    // 比大小

//    // 奇数序列中，一共出现了多少次3
//    int number = 866278171;
//    int sum = 0;
//    for (int i = 1; i <= number; i = i + 2) {
//      String str = String.valueOf(i);
//      if (str.contains("3")) {
//        sum += str.length() - str.replace("3", "").length();
//      }
//    }
//    // 总数: 441684627
//    System.out.println("总数: " + sum);
  }
}
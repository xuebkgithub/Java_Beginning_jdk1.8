/*
1. 定义一个 Circle 类包含如下
  1.1 一个 double 型的 radius 属性代表园的半径
  1.2 一个 findArea() 方法返回园的面积
2. 定义一个 PassObject ,在类中定义一个方法 printAreas(), 该方法的定义如下.
        public void printAreas(Cirle c, int time)
   在 printAreas 方法中打印输出 1 到 time 之前的没个整数半径值,以及对应的面积
   例如, times 为 5 则 输出半径 1 2 3 4 5 以及对应的园面积
   在 main 方法中调用 printAreas()方法,调用完毕后输入当前半径值,程序运行结果如下


 */

public class PassObject {
  public static void main(String[] args){
    PassObject passObject = new PassObject();
//    // 非匿名方案创建
//    Cirle cirle = new  Cirle();
//    passObject.printAreas(cirle, 5);
//    System.out.println("now Radius is " + cirle.getRadius());
    // 匿名方案创建
    // 外面是没办法直接使用.适合一次性的
//    passObject.printAreas(new Cirle(), 5);
    // 第二种 测试
    double x = 55;
    Cirle cirle = new Cirle();
    System.out.println(x + "\t\t" + cirle.findArea(x));
    new Cirle().show();
    System.out.println(x + "\t\t" + new Cirle().findArea(x));

  }
  private void printAreas(Cirle c, int time){
    System.out.println("Radius" + "\t\t" + c.getRadius());
    int temp = 0 ;
//    // 第一种写法
//    for (int i=1; i<=time;i++, temp = i){
//      c.setRadius(i);
//      System.out.println(c.getRadius() + "\t\t" + c.findArea());
//    }
    // 第二种
    while (temp <= time){
      c.setRadius(temp);
      System.out.println(c.getRadius() + "\t\t" + c.findArea());
      temp ++;
    }
    c.setRadius(temp);
  }
}

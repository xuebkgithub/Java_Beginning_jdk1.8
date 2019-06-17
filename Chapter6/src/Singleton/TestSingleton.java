package Singleton;
/*
  * 单例的涉及模式
  *  1. 解决的问题: 使得一个类只能够创建一个对象
  *  2. 如何实现
 */
public class TestSingleton {
  public static void main(String[] args){
    Singleton s1 = Singleton.getInstance();
    Singleton s2 = Singleton.getInstance();
    System.out.println(s1.toString());
    System.out.println(s1.equals(s2));
  }
}

class Singleton{

  // 1. 私有化构造器,使得在类的外部.不能够调用此构造器
  private Singleton(){

  }

  // 2. 在类的内部创建一个实例
  private static Singleton instance = new Singleton();

  // 3. 私有化此对象, 通过公用方法 来进行调用
  // 4. 此公共的方法 只能通过类来进行调用,因为设置为 static 的,同时类的实例也必须为 static
  public static Singleton getInstance() {
    return instance;
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }
}
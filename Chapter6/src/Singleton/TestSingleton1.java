package Singleton;
/*
  * 单例的涉及模式
  *  懒汉式, 开始的时候.没有进行创建.使用的时候.在创建
  *  这个版本.会有问题.多线程有影响.
 */
public class TestSingleton1 {
  public static void main(String[] args){
    Singleton1 s1 = Singleton1.getInstance();
    Singleton1 s2 = Singleton1.getInstance();
    System.out.println(s1.toString());
    System.out.println(s1.equals(s2));
  }
}

class Singleton1{

  // 1. 私有化构造器,使得在类的外部.不能够调用此构造器
  private Singleton1(){

  }

  // 2. 在类的内部创建一个实例
  private static Singleton1 instance = null;

  // 3. 私有化此对象, 通过公用方法 来进行调用
  // 4. 此公共的方法 只能通过类来进行调用,因为设置为 static 的,同时类的实例也必须为 static
  public static Singleton1 getInstance() {
    if(instance == null){
      instance = new Singleton1();
    }
    return instance;
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }
}
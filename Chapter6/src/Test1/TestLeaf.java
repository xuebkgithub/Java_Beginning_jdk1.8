package Test1;

public class TestLeaf {
  public static void main(String[] args){
    Leaf l1 = new Leaf();
    System.out.println();
    Leaf l2 = new Leaf("test");
    System.out.println(l1.s1);
    System.out.println(l2.s1);
  }
}

class Root {
  public String s1 = "1";
  static {
    System.out.println("这个是 Root 静态代码块 01");
  }
  {
    System.out.println("这个是 Root 动态代码块 01");
  }

  public Root() {
    System.out.println("这个是 Root 初始化");
    s1 = "Root";
  }
}

class Mid extends Root{
  static {
    System.out.println("这个是 Mid 静态代码块 01");
  }
  {
    System.out.println("这个是 Mid 动态代码块 01");
  }

  public Mid() {
    System.out.println("这个是 Mid 初始化");
    s1 = "Mid";
  }
  public Mid(String msg) {
    System.out.println("这个是 Mid 初始化 " + msg);
    s1 = "Mid" + msg;
  }
}

class Leaf extends Mid{
  static {
    System.out.println("这个是 Leaf 静态代码块 01");
  }
  {
    System.out.println("这个是 Leaf 动态代码块 01");
  }

  public Leaf() {
    System.out.println("这个是 Leaf 初始化");
    s1 = "Leaf";
  }
  public Leaf(String msg) {
    System.out.println("这个是 Leaf 初始化 " + msg);
    s1 = "Leaf" + msg;
  }
}
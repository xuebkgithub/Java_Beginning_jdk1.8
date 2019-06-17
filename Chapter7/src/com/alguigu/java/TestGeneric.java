package com.alguigu.java;

import org.junit.Test;

import java.util.*;

/* 泛型的使用

 */
public class TestGeneric {
  @Test
  public void test06(){
    List<?> list = null; // 这里的 ? 是代表什么类型都可以放进去
    List<Object> list1 = new ArrayList<Object>();
    List<String> list2 = new ArrayList<String>();
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    list = list1;
    list1.add(new Integer(2));
    System.out.println(list.get(0));
    list = list2;
    list2.add(new String("221"));
    System.out.println(list.get(0));
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    /*
     * ? extends A : 可以存放 A 及其 子类
     * ? super A   : 可以存放 A 及其 父类
     */
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    List<? extends 自己类> L1 = null;
    List<子类> L2 = new ArrayList<子类>();
    List<? super 自己类> L3 = null;
    List<父类> L4 = new ArrayList<父类>();
    L1 = L2; // 这里就可以实现
    L3 = L4;
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");



  }

  private void 通配符验证(? extends E 类){

  }

  private void 通配符验证(? super E 类){

  }

  @Test
  public void test05(){
    // 使用泛型
    Order<Boolean> order = new Order<Boolean>();
    order.setT(true);
    order.add(true);
    order.add(false);
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    System.out.println(order.getT());
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    // 遍历
    Iterator<Boolean> iterator = order.list.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    SubOrder subOrder = new SubOrder();
    List<Integer> integerList = subOrder.list;
    System.out.println(integerList);
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    // 创建一个数组
    Integer[] integers = new Integer[5];
    integers[0] = 100;
    integers[1] = Integer.valueOf("2");
    // 创建一个集合
    List<Integer> list = new ArrayList<Integer>();
    list.add(1);
    // 进行转换
    List<Integer> list1 = order.formArrayToList(integers, list);
    System.out.println(list1);
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
  }

  @Test
  public void test04(){
    // 使用泛型
    Map<Integer, String> map01 = new HashMap<Integer, String>();
    map01.put(1,"213");
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    System.out.println(map01);
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    // 遍历
    Set<Map.Entry<Integer, String>> set = map01.entrySet();
    for(Map.Entry<Integer, String> i :set){
      System.out.println("Key: " + i.getKey() + " Value: " + i.getValue());
    }
  }

  @Test
  public void test03(){
    // 使用泛型
    List<Integer> list01 = new ArrayList<Integer>();
    list01.add(1);
    List<String> list02 = new ArrayList<String>();
    list02.add("2");
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    System.out.println(list01.getClass().toString());
    System.out.println(list02.getClass().getPackage());
    System.out.println(list01.equals(list02));

    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");

  }

  @Test
  public void test02(){
    // 使用泛型
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(87);
//    list.add(new String("AA")); // 2. 这里添加的时候就会报错.
    //Error:(20, 9) java: 对于add(java.lang.String), 找不到合适的方法
    //    方法 java.util.Collection.add(java.lang.Integer)不适用
    //      (参数不匹配; java.lang.String无法转换为java.lang.Integer)
    //    方法 java.util.List.add(java.lang.Integer)不适用
    //      (参数不匹配; java.lang.String无法转换为java.lang.Integer)
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    Iterator iterator = list.iterator();
    while (iterator.hasNext()){
      int score = (Integer) iterator.next(); // 3.这里不需要进行强制.转换.默认就是 Integer 类型
      System.out.println(score);
    }
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");

  }

  @Test
  public void test01(){
    // 1. 在集合中没有使用 泛型的情况下
    List list = new ArrayList();
    list.add(89);
    list.add(88);
    list.add(87);
    list.add(new String("AA")); // 2. 这里添加一个 String 类型的内容.
    // 4. 没有使用泛型 任何 Object 就会添加进来
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    Iterator iterator = list.iterator();
    while (iterator.hasNext()){
      int score = (Integer)iterator.next(); // 3.强转换 获取 内容为 int 类型
      /* 5. 下面强制转换的时候.就会报错
        java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
          at com.alguigu.java.TestGeneric.test01(TestGeneric.java:25)
          at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
          .......
       */
      System.out.println(score);
    }
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
  }
}

class 父类 {

}
class 自己类 extends 父类{

}
class 子类 extends 自己类{

}
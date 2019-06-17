package test2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TestCollectionList {
  @Test
  public void testCollection02(){
    List list = new LinkedList();
    list.add("123");
    list.add("AA");
    list.add("DDD");
    list.add(new Date());
    list.add(new Person("aa", 99));
    System.out.println(list.size());
    System.out.println(list);
    // 指定位置添加
    list.add(2,"222");
    System.out.println(list);
    // 获取指定位置
    System.out.println(list.get(2));
    // 移除
    System.out.println(list);
    list.remove("123");
    list.remove(2);
    System.out.println(list);
  }
  @Test
  public void testCollection01(){
    List list = new ArrayList();

    list.add("123");
    list.add("AA");
    list.add("DDD");
    list.add(new Date());
    list.add(new Person("aa", 99));
    System.out.println(list.size());
    System.out.println(list);
    // 指定位置添加
    list.add(2,"222");
    System.out.println(list);
    // 获取指定位置
    System.out.println(list.get(2));
    // 移除
    System.out.println(list);
    list.remove("123");
    list.remove(2);
    System.out.println(list);
  }
}

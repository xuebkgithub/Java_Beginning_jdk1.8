package test2;

import org.junit.Test;

import java.util.*;

public class TestMap {
  private void printMap_keySet(Map map){
    System.out.println(map.size());
    Iterator iterator = map.keySet().iterator();
    while (iterator.hasNext()){
      Object i = iterator.next();
      System.out.println("key: " + i + " key_Class: " + i.getClass() + " values: " + map.get(i));
    }
  }

  private void printMap_values(Map map){
    System.out.println(map.size());
    Iterator iterator = map.values().iterator();
    while (iterator.hasNext()){
      Object i = iterator.next();
      System.out.println("values: " + i);
    }
  }

  private void printMap_entrySet(Map map){
    System.out.println(map.size());
    Iterator iterator = map.entrySet().iterator();
    while (iterator.hasNext()){
      Map.Entry entry = (Map.Entry) iterator.next();
      System.out.println("key: " + entry.getKey() + " key_Class: " + entry.getClass() + " values: " + entry.getValue());
    }
  }

  private void forprintMap(Map map){
    System.out.println(map.size());
    for (Object obj: map.entrySet()) {
      System.out.println(obj);
    }

  }

  @Test
  public void  test03(){
    /*
    按照添加顺序,进行维护
     */
    Map map = new TreeMap();
    map.put("1", new String("111"));
    map.put("3", new String("333"));
    map.put("4", new String("444"));
    map.put("2", new String("222")); // 必须一个类型才行哦 . 存储结构 参考 HashMap 进行存储
//    map.put(4, new String("555"));
//    map.put(6, new String("666"));
//    map.put(6, new String("7777")); // 重复的 只会取最后一个.
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    printMap_keySet(map);
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    printMap_values(map);
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    printMap_entrySet(map);
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    for (Object obj: map.values()) {
      System.out.println(obj);
    }
  }

  @Test
  public void  test02(){
    /*
    按照添加顺序,进行维护
     */
    Map map = new LinkedHashMap();
    map.put("1", new String("111"));
    map.put("3", new String("333"));
    map.put("4", new String("444"));
    map.put("2", new String("222"));
    map.put(4, new String("555"));
    map.put(6, new String("666"));
    map.put(6, new String("7777")); // 重复的 只会取最后一个.
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    printMap_keySet(map);
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    printMap_values(map);
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    printMap_entrySet(map);
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
  }


  @Test
  public void  test01(){
    /*
      没有任何顺序.
     */
    Map map = new HashMap();
    map.put("1", new String("111"));
    map.put("2", new String("222"));
    map.put("3", new String("333"));
    map.put("4", new String("444"));
    map.put(4, new String("555"));
    map.put(6, new String("666"));
    map.put(6, new String("7777")); // 重复的 只会取最后一个.
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    printMap_keySet(map);
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    printMap_values(map);
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    printMap_entrySet(map);
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
  }
}

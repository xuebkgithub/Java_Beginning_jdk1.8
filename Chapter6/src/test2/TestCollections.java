package test2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestCollections {
  @Test
  public void test01(){
    /*

     */
    // 初始化基础数据
    List list = new ArrayList();
    list.add("2");
    list.add("3");
    list.add("4");
    list.add("AA");
    list.add("5");
    list.add("6");
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    System.out.println(list);
    Collections.reverse(list); // 反转
    System.out.println(list);
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    System.out.println(list);
    Collections.shuffle(list); // 排序
    System.out.println(list);
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    System.out.println(list);
    Collections.sort(list); // 升序
    System.out.println(list);
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    Comparator comparator = new Comparator() {
      @Override
      public int compare(Object o1, Object o2) {
        if (o1 instanceof Custonmer && o2 instanceof Custonmer){
          Custonmer p1 = (Custonmer) o1;
          Custonmer p2 = (Custonmer) o2;
          int i = p1.getId().compareTo(p2.getId()); // 返回的都是 int 类型.
          if (i == 0){
            return p1.getName().compareTo(p2.getName());
          }
          return i;
        }
        return 1;
      }
    };

    Collections.reverse(list); //指定 排序方法进行排序
    System.out.println(list);
    Collections.sort(list, comparator); //指定 排序方法进行排序
    System.out.println(list);
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    System.out.println(list);
    Collections.swap(list, 2,3); // 升序
    System.out.println(list);
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");

  }
}

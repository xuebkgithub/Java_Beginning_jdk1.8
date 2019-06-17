package test2.Employee;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestEmployee {
  private void printSet(Set set){
    Iterator iterator = set.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }
  @Test
  public void Test02(){
    /*
    创建 Employee 5 个对象并放入 TreeSet 集合中
     */
    // 初始化 自定义 TreeSet 对象
    Comparator comparator = new Comparator() {
      @Override
      public int compare(Object o1, Object o2) {
        if (o1 instanceof Employee && o2 instanceof Employee){
          Employee a1 = (Employee) o1 ;
          Employee a2 = (Employee) o2 ;
          return a1.getBirthday().compareTo(a2.getBirthday());
        }
        return 0;
      }
    };
    // 初始化 存储对象 set
    Set set = new TreeSet(comparator);
    // 传入相关的内容.
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    set.add(new Employee("1", 1, new MyDate(11,6,2019)));
    set.add(new Employee("2", 1, new MyDate(11,6,2018)));
    set.add(new Employee("3", 2, new MyDate(10,6,2019)));
    set.add(new Employee("4", 3, new MyDate(10,6,2019)));
    set.add(new Employee("5", 4, new MyDate(12,7,2019)));
    set.add(new Employee("6", 5, new MyDate(13,5,2019)));
    printSet(set);
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    /*
      * 最终展示结果
      ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
      Employee{name='2', age=1, birthday=MyDate{day=11, month=6, year=2018}}
      Employee{name='6', age=5, birthday=MyDate{day=13, month=5, year=2019}}
      Employee{name='3', age=2, birthday=MyDate{day=10, month=6, year=2019}}
      Employee{name='1', age=1, birthday=MyDate{day=11, month=6, year=2019}}
      Employee{name='5', age=4, birthday=MyDate{day=12, month=7, year=2019}}
      ===== ===== ===== ===== ===== ===== ===== ===== ===== =====
     */
  }
  @Test
  public void Test01(){
    /*
    创建 Employee 5 个对象并放入 TreeSet 集合中
     */
    // 初始化 存储对象 set
    Set set = new TreeSet();
    // 传入相关的内容.
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    set.add(new Employee("第一个", 1, new MyDate(11,6,2019)));
    set.add(new Employee("第二个", 2, new MyDate(10,6,2019)));
    set.add(new Employee("第三个", 3, new MyDate(10,6,2019)));
    set.add(new Employee("第四个", 4, new MyDate(12,6,2019)));
    set.add(new Employee("第五个", 5, new MyDate(12,6,2019)));
    printSet(set);
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
  }
}

package test2;

import org.junit.Test;

import java.util.*;

public class TestCollection {
  @Test
  public void testCollection03(){
    Person p1 = new Person("AA", 11);
    Collection coll = new ArrayList();
    coll.add(123);
    coll.add("aadwad");
    coll.add(new Date());
    coll.add("xxx");
    coll.add(p1);
    Iterator iterator = coll.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }


  }
  @Test
  public void testCollection02(){
    Person p1 = new Person("AA", 11);
    Collection coll = new ArrayList();
    coll.add(123);
    coll.add("aadad");
    coll.add(new Date());
    coll.add("BB");
    coll.add(p1);
    // 判断 单个里面的内容是否一致
    boolean b1 = coll.contains("aa");
    System.out.println(b1);
    boolean b2 = coll.contains(p1);
    System.out.println(b2);
    // 判断 当前集合中 是否包含 这个集合
    boolean b3 = coll.containsAll(coll);
    System.out.println(b3);
    Collection coll1 = Arrays.asList("12313",1,2);
    coll.addAll(coll1);
    // 删除
    System.out.println(coll);
    coll.removeAll(coll1);
    System.out.println(coll);
    //删除单个
    ((ArrayList) coll).remove(1);
    System.out.println(coll);
    coll.remove(p1);
    System.out.println(coll);
    System.out.println(coll.hashCode());
  }
  @Test
  public void testCollection01(){
    Collection coll = new ArrayList();
    // size 方法
    System.out.println(coll.size());
    coll.add(123);
    coll.add("aadad");
    coll.add(new Date());
    coll.add("BB");
    System.out.println(coll.size());
    // 3. addAll 将上面的所有元素添加进去
    Collection coll1 = Arrays.asList("12313",1,2);
    coll.addAll(coll1);
    System.out.println(coll.size());
    //4 判断是否为空
    System.out.println(coll.isEmpty());
    if(!coll.isEmpty()){
      System.out.println(coll);
      for (int i = 0; i < coll.size(); i++) {
        System.out.println("index: " + i + " data: " + ((ArrayList) coll).get(i));
      }
    }
    // 5 清空
    coll.clear();
    System.out.println(coll.isEmpty());
  }
}

class Person implements Comparable{
  private String name;
  private Double age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getAge() {
    return age;
  }

  public void setAge(double age) {
    this.age = age;
  }

  public Person(String name, double age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Person)) return false;
    Person person = (Person) o;
    return Double.compare(person.age, age) == 0 &&
            Objects.equals(name, person.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", age=" + age +
            '}';
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof Person){
      Person p = (Person) o;
      // 这里是比较一个
//      return this.age.compareTo(p.age);
      // 这里是比较两个.
      int i = this.age.compareTo(p.age); // 返回的都是 int 类型.
      if (i != 0){
        return i;
      }
      return this.name.compareTo(p.name);

    }
    return 0;
  }
}
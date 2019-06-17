package test2;

import org.junit.Test;

import java.util.*;


public class TestCollectionSet {
  @Test
  public void testTreeSet01(){
    /*
      * 定制排序
     */
    // 创建一个 Comparator
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

//          if (i != 0){
//            return i;
//          }
//          return p2.getName().compareTo(p2.getName());

        }
        return 0;
      }
    };
    // 将此对象作为形参传给 TreeSet 中进行排序
    Set set = new TreeSet(comparator);
    set.add(new Custonmer("AC", 133));
    set.add(new Custonmer("CA", 133));
    System.out.println(set);


  }
  @Test
  public void testTreeSet(){
    /*
      java.lang.NullPointerException
      at java.util.TreeMap.put(TreeMap.java:563)
      at java.util.TreeSet.add(TreeSet.java:255)
      at test2.TestCollectionSet.testTreeSet(TestCollectionSet.java:14)
      只能够添加一个类型的方法
      1. 必须是同一个类型
      2. 可以按照指定的顺序 进行排序
     */
    Set set = new TreeSet();
    set.add(new Person("AA", 1));
    set.add(new Person("CB", 13));
    set.add(new Person("AC", 133));
    set.add(new Person("AA", 133));
    System.out.println(set);
  }


  /*
    * Set 存储的元素是无序的,不可重复的
    * 1. 无序性 无序性 != 随机性
    * 2. 不可重复
   */
  @Test
  public void testCollection01(){
    Set hashSet = new HashSet();

    Collection coll1 = Arrays.asList("12313",1,2,new Person("131", 13),new Person("131", 13));

    hashSet.add("123");
    hashSet.add("11232");
    hashSet.add(null);
    hashSet.add(new Person("131", 13)); // 这里的自定义项目.必须 包含 重写的 equals  hashCode
                                                    // 方法这样就可以判断是否重复
    hashSet.add(new Person("131", 13));
    hashSet.add(null); // 这里的 null 不会增加进去. 不可重复性!
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    System.out.println(hashSet.size());
    System.out.println(hashSet);
    System.out.println(coll1);
    System.out.println("===== ===== ===== ===== ===== ===== ===== ===== ===== =====");
    System.out.println(hashSet.addAll(coll1));
    System.out.println(hashSet.size());
    System.out.println(hashSet);
  }
}

class Custonmer {
  private String name;
  private Integer id;

  public Custonmer() {
    super();
  }

  public Custonmer(String name, Integer id) {
    this.name = name;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Custonmer)) return false;
    Custonmer custonmer = (Custonmer) o;
    return Objects.equals(name, custonmer.name) &&
            Objects.equals(id, custonmer.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id);
  }

  @Override
  public String toString() {
    return "Custonmer{" +
            "name='" + name + '\'' +
            ", id=" + id +
            '}';
  }

}
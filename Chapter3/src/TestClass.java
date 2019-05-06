import java.lang.reflect.Field;

public class TestClass {
  public static void main(String[] args){
    Person person = new Person();
    person.setName("测试啊 00");
    person.age = 18;
    person.sex = true;
    person.info();
  }
}


// 面向对象的变成.关注与类的设计
class Person{
  // 1. 属性 Field
  Field field;
  String name;
  int age;
  boolean sex;
  public void eat(){
    /*
    吃饭方法
     */
    System.out.println("开始 吃饭方法 ?");
  }
  public void sleep(){
    /*
    睡觉方法
     */
    System.out.println("开始 睡觉方法 ?");
  }

  public String getName(){
    return name;
  }

  public void setName(String n){
    name = n;
  }

  public void info(){
    eat();
    sleep();
    System.out.println("名字: " +name + " 性别: "+sex+" 年龄: "+ age );
  }

}
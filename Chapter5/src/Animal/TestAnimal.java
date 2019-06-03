package Animal;
/*
多态使用列子
 */
public class TestAnimal {
  public static void main(String[ ] args){
    TestAnimal t = new TestAnimal();
    t.func(new Animal());
    t.func(new Dog());
    t.func(new Cat());

  }
  public void func(Animal a){
    a.eat();
    a.jump();
    if( a instanceof Dog){
      Dog d = (Dog)a;
      d.Wang();
    }
    if( a instanceof Cat){
      ((Cat) a).catchMouse();
    }
    a.getage();
  }
}


class Animal{
  String name;
  int age = 3;
  public void eat(){
    System.out.println("进食");
  }
  public void jump(){
    System.out.println("跳");
  }
  public void getage(){
    System.out.println(age);
  }
}


class Dog extends Animal{
  String name="狗🐶";
  int age = 1 ;
  public void eat(){
    System.out.print(this.name + " ");
    super.eat();
  }
  public void jump(){
    System.out.print(this.name + " ");
    super.jump();
  }
  public void Wang(){
    System.out.println(this.name + "汪汪叫");
  }
}

class Cat extends Animal{
  String name="猫🐈";
  int age = 2 ;

  public void eat(){
    System.out.print(this.name + " ");
    super.eat();
  }
  public void jump(){
    System.out.print(this.name + " ");
    super.jump();
  }
  public void catchMouse(){
    System.out.println(this.name + "抓老鼠");
  }
  public void getage(){
    System.out.println(super.age);
    System.out.println(this.age);
  }
}
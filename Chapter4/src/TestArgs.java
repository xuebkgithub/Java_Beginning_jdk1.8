public class TestArgs {
  public static void main(String[] args){
    new TestArgs().sayHello();
    new TestArgs().sayHello("Hello Test");
    new TestArgs().sayHello("Hello Test", "Hello BeiJing");
    new TestArgs().sayHello(new String[]{"Hello Test","Hello BeiJing"});
    new TestArgs().say13(2, 3, 1);
  }
//  private void sayHello(){
//    System.out.println("Hello World");
//  }
  private void sayHello(String ... args){
    for (int i=0 ; i < args.length; i++ ){
      System.out.println("Hello " + args[i] + " _for");
    }
    System.out.println("==========");
  }
  private void say13(int ... args){
    System.out.println(args[0]);
  }
}

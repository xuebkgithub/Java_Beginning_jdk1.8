
class Value {
  int i = 15;
}

public class TestArgsTransfer {
  public static void main(String[] args){
    TestArgsTransfer testArgsTransfer = new TestArgsTransfer();
    testArgsTransfer.first();
  }
  public void first(){
    int i = 0;
    Value v = new Value();
    v.i = 25;
    second(v, 10);
    System.out.println(v.i +  " "  + i);

  }
  public void second(Value v, int i){
    System.out.println("second");
    i = 0;
    v.i = 20;
    Value val = new Value();
    v = val;
    System.out.println(v.i +  " "  + i);
    System.out.println("second");
  }
}

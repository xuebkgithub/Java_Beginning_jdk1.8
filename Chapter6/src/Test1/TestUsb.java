package Test1;

public class TestUsb {
  public static void main(String[] args){
    电脑 com = new 电脑();
    com.doWork(new Printer());
    com.doWork(new Flash());

    USB phone = new USB() {
      @Override
      public void start() {
        System.out.println("手机 盘开始工作");
      }

      @Override
      public void stop() {
        System.out.println("手机 盘结束工作");
      }
    };
    com.doWork(phone);
  }
}

class 电脑 {
  public void doWork(USB usb){
    usb.start();
    System.out.println("=====设备开始工作=====");
    usb.stop();
  }

}

interface USB{
  // USB的尺寸大小,可以设置为常量
  int chicun = 0;
  
  // 功能抽象方法
  void start();
  void stop();
}

// 打印机
class Printer implements USB {
  @Override
  public void start() {
    System.out.println("打印机 盘开始工作");
  }

  @Override
  public void stop() {
    System.out.println("打印机 盘结束工作");
  }
}

// U盘
class Flash implements USB{
  @Override
  public void start() {
    System.out.println("U 盘开始工作");
  }

  @Override
  public void stop() {
    System.out.println("U 盘结束工作");
  }
}
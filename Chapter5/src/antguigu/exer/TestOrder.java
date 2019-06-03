package antguigu.exer;

import java.util.Objects;

/*
  * 编写 Order 类 有 int 类型的 orderId, String类型的 OrderName.
  * 相应的 getter 和 setter 方法. 两个参数的构造器,重写父类的 equals 方法
  * 并判断测试类中的两个对象是否相等
  *
 */
public class TestOrder {
  public static void main(String[] args) {
    Order o1 = new Order(01, "test");
    Order o2 = new Order(01, "test");

    System.out.println( o1==o2);
    System.out.println( o1.equals(o2));
    System.out.println(o1.hashCode());
    System.out.println(o2.hashCode());
    System.out.println(o1.toString());
  }
}


class Order{
  private int orderId;
  private String OrderName;

  public Order(int orderId, String orderName) {
    super();
    this.orderId = orderId;
    this.OrderName = orderName;
  }

  public int getOrderId() {
    return orderId;
  }

  public void setOrderId(int orderId) {
    this.orderId = orderId;
  }

  public String getOrderName() {
    return OrderName;
  }

  public void setOrderName(String orderName) {
    OrderName = orderName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Order)) return false;
    Order order = (Order) o;
    return orderId == order.orderId &&
            Objects.equals(OrderName, order.OrderName);
  }

  @Override
  public String toString() {
    return "Order{" +
            "orderId=" + orderId +
            ", OrderName='" + OrderName + '\'' +
            '}';
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, OrderName);
  }
}
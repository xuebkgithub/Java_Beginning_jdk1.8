package com.alguigu.java;

import java.util.ArrayList;
import java.util.List;

/*
 自定义泛型类
 */
public class Order<T> {
  private String orderName;
  private String orderId;
  private T t;
  public List<T> list = new ArrayList<T>();

  public void add(T _t) {
    this.list.add(_t);
  }

  public Order() {
  }
  public Order(String orderName, String orderId, T t) {
    this.orderName = orderName;
    this.orderId = orderId;
    this.t = t;
  }

  public String getOrderName() {
    return orderName;
  }

  public void setOrderName(String orderName) {
    this.orderName = orderName;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public T getT() {
    return t;
  }

  public void setT(T t) {
    this.t = t;
  }
  // 泛型方法
  public <E> E getE(E e) {
    return e;
  }
  // 泛型  数组 到集合的复制
  public <E> List<E> formArrayToList(E[] e, List<E> list){
    for (E i:e){
      if(i == null) {
        continue;
      }
      list.add(i);
    }
    return list;
  }


  @Override
  public String toString() {
    return "Order{" +
            "orderName='" + orderName + '\'' +
            ", orderId='" + orderId + '\'' +
            ", t=" + t +
            '}';
  }
}
// 在继承范类型或泛型接口的时候.可以直接指定类型
class SubOrder extends Order<Integer> {

}
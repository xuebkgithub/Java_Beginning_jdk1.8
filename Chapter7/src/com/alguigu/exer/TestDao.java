package com.alguigu.exer;

import org.junit.Test;

public class TestDao {
  @Test
  public void test01(){
    // 初始化相应类型和方法
    DAO<User> dao = new DAO<User>();
    // 执行方 验证 save
    dao.save("01", new User(1,18, "测试1"));
    dao.save("02", new User(2,11, "测试1"));
    // 执行方 验证 get
    System.out.println(dao.get("01"));
    // 执行方 验证 update
    dao.update("01", new User(1,28, "测试03"));
    System.out.println(dao.get("01"));
    // 执行方 验证 list
    System.out.println(dao.list());
    // 执行方 验证 delete
    dao.delete("01");
    System.out.println(dao.list());
  }
}

package com.alguigu.java1;

import org.junit.Test;

public class TestSeason {
  @Test
  public void test01(){

  }
}

// 枚举类
class Season{
  // 私有化 类型
  private final String seasonName; // final 声明不能 修改
  private final String seasonDesc;

  // 2. final 的属性 构造初始化
  private Season(String seasonName, String seasonDesc) {
    this.seasonName = seasonName;
    this.seasonDesc = seasonDesc;
  }
  // 通过公用的方法进行 调用

  public String getSeasonName() {
    return seasonName;
  }

  public String getSeasonDesc() {
    return seasonDesc;
  }
  public static final Season SEASON = new Season("SEASON", "春暖花开");
  public static final Season SUMMER = new Season("SUMMER", "夏日炎炎");
  public static final Season AUTUMN = new Season("AUTUMN", "秀峰落叶");
  public static final Season WINTER = new Season("WINTER", "白雪皑皑");

  @Override
  public String toString() {
    return "Season{" +
            "seasonName='" + seasonName + '\'' +
            ", seasonDesc='" + seasonDesc + '\'' +
            '}';
  }

  public void show(){
    System.out.println("这是一个季节方案");
  }
}
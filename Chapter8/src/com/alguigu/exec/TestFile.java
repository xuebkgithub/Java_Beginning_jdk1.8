package com.alguigu.exec;

import org.junit.Test;

import java.io.*;

/*
 * 1. 在指定的路径下创建 一个新 txt 文件.并写入指定内容
 * 2. 利用程序.读取
 * 3. 复制 文件
 */
public class TestFile {
  @Test
  public void test01(){
//    mkfile("test.txt", new String[]{"测试内容\n", "第二行"});
//    PrintsFile("test.txt");
    CopyFiles("test.txt", "test01.txt");
  }
  /*
   * 第一步中.创建相应文件.并写入具体内用
   */
  public void mkfile(String name, String[] strings){
    // 创建相应操作方法
    File file = new File("./src/com/alguigu/exec/" + name);
    BufferedOutputStream bos = null;
    try {
      FileOutputStream fos = new FileOutputStream(file);
      bos = new BufferedOutputStream(fos);
      for (String i :strings ) {
        bos.write(i.getBytes());
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (bos != null){
        try {
          bos.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }

    }

  }
  /*
   * 第二步中.读取相应文件内容
   */
  public void PrintsFile(String name){
    File file = new File("./src/com/alguigu/exec/" + name);
    BufferedReader bis = null;
    try {
      FileReader fis = new FileReader(file);
      bis = new BufferedReader(fis);
      String str ;
      while ((str = bis.readLine()) != null){
        System.out.println(str);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if(bis != null){
        try {
          bis.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

  }
  /*
   * 第三步中.对文件进行复制.
   */
  public void CopyFiles(String lod, String newfile){
//    FileReader fr = new FileReader(new File("./src/com/alguigu/exec/" + lod));
//    FileWriter fw = new FileWriter(new File("./src/com/alguigu/exec/" + newfile));
    BufferedReader bfr = null;
    BufferedWriter bfw = null;
    try {
      bfr = new BufferedReader(new FileReader(new File("./src/com/alguigu/exec/" + lod)));
      bfw = new BufferedWriter(new FileWriter(new File("./src/com/alguigu/exec/" + newfile)));

      String str;
      while ((str = bfr.readLine()) != null){
        bfw.write(str);
        bfw.newLine();
        bfw.flush();
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (bfr != null) {
        try {
          bfr.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (bfw != null) {
        try {
          bfw.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }


  }
}

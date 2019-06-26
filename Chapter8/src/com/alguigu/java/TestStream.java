package com.alguigu.java;

import org.junit.Test;

import java.io.*;

/*
 * 1. IO的 体系
 * 抽象类         节点流(文件流)
 * InputStream   FileInputStream
 * OutputStream  FileOutputStream
 * InputStream   FileInputStream
 * OutputStream  TestStream
 */
public class TestStream {
  @Test
  public void test05(){
    /*
     *  读取 一个文件. 并写入另外的文件中
     */
    File fis_file = new File("./src/com/alguigu/java/fis_file.txt");
    File fos_file = new File("./src/com/alguigu/java/fos_file.txt");
    FileOutputStream  fos = null;
    FileInputStream   fis = null;
    try {
      fos = new FileOutputStream(fos_file);
      fis = new FileInputStream(fis_file);
      System.out.println("[INFO] 成功载入 相应方法");
      byte[] bytes = new byte[20];
      int length ;
      while ((length = fis.read(bytes)) != -1){
//        System.out.println("[INFO] " + "bytes: " + new String(bytes) + " off: " + 0 + " length: " + length);
        fos.write(bytes,0, length);
        fos.flush();
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }finally {
      // 进行关闭文件操作
      if(fos != null){
        try {
          fos.close();
          System.out.println("[DEBUG] fos 文件关闭");
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if(fis != null){
        try {
          fis.close();
          System.out.println("[DEBUG] fis 文件关闭");
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
  }


  @Test
  public void test04(){
    /*
     * 写入
     */
    FileOutputStream fileOutputStream = null;
    File file = new File("./src/com/alguigu/java/TestFileOutputStream.txt");
    try {
      fileOutputStream = new FileOutputStream(file);
      fileOutputStream.write(new String("I Love China I love the World").getBytes());
      fileOutputStream.flush();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }finally {
      if (fileOutputStream != null){
        try {
          fileOutputStream.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

  }
  @Test
  public void test03(){
    /*
     * 改用数组的方式进行读取
     */
    // 1. 定义一个 null 方法.进行处理.
    FileInputStream fileInputStream = null;
    try {
      // 2. 设定文件
      File file = new File("/Users/xuebaoku/MyMac/AppCode/Base/Java_Beginning_jdk1.8/Chapter8/src/com/alguigu/java/TestFile.txt");
      // 3. 进行文件方法进读取
      fileInputStream = new FileInputStream(file);

      byte[] bytes = new byte[5]; // 定义读取的 字节数量
      int length; // 自定义这个
      while ((length = fileInputStream.read(bytes)) != -1) {
        System.out.print(new  String(bytes, 0, length));
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      //4. 对文件进行关闭
      try {
        fileInputStream.close();
      } catch (IOException e) {
        e.printStackTrace();
      }catch (NullPointerException e){
        e.printStackTrace();
      }
    }
    System.out.println("");
    System.out.println("程序完结");

  }
//  @Test
//  public void test02() {
//    /*
//     * 从硬盘中读取一个文件.到程序中.使用 FileOutputStream
//     */
//    FileInputStream fileInputStream = null;
//    try {
//      File file = new File("/Users/xuebaoku/MyMac/AppCode/Base/Java_Beginning_jdk1.8/Chapter8/src/com/alguigu/java/TestFile.tx");
//      fileInputStream = new FileInputStream(file);
//      // 3. 进行读取
//      int b = fileInputStream.read();
//      while (b != -1) {
//        System.out.print((char) b);
//        b = fileInputStream.read();
//      }
//    } catch (FileNotFoundException e) {
//      e.printStackTrace();
//    } catch (IOException e) {
//      e.printStackTrace();
//    } finally {
//      //4. 对文件进行关闭
//      try {
//        fileInputStream.close();
//      } catch (IOException e) {
//        e.printStackTrace();
//      }catch (NullPointerException e){
//        e.printStackTrace();
//      }
//    }
//    System.out.println("程序完结");
//  }
//  @Test
//  public void test01() throws IOException {
//    /*
//     * 从硬盘中读取一个文件.到程序中.使用 FileOutputStream
//     */
//    File file = new File("/Users/xuebaoku/MyMac/AppCode/Base/Java_Beginning_jdk1.8/Chapter8/src/com/alguigu/java/TestFile.txt");
//    FileInputStream fileInputStream = new FileInputStream(file);
//    // 3. 进行读取
//    int b = fileInputStream.read();
//    while (b != -1){
//      System.out.print((char)b);
//      b = fileInputStream.read();
//    }
//    //4. 对文件进行关闭
//    fileInputStream.close();
//  }
}


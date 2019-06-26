package com.alguigu.java;

import org.junit.Test;

import java.io.*;

public class TestFileReaderWriter {

  private void ReaderWriter(File fis_file, File fos_file){
    FileReader fis = null;
    FileWriter fos = null;
    try {
      fis = new FileReader(fis_file);
      fos = new FileWriter(fos_file);
      char[] chars = new char[20];
      int length;
      while ((length = fis.read(chars)) != -1){
  //      System.out.println("[DEBUG] " + "chars: " + new String(chars) + " off: " + 0 + " length: " + length);
        fos.write(chars, 0, length);
        fos.flush();
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (fis != null) {
        try {
          fis.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      if (fos != null) {
        try {
          fos.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }

  }

  @Test
  public void test02(){
    ReaderWriter(
      new File("./src/com/alguigu/java/fis_file.txt"),
      new File("./src/com/alguigu/java/fos_file.txt")
    );
  }
  @Test
  public void test01(){
    File fis_file = new File("./src/com/alguigu/java/fis_file.txt");
    FileReader fis = null;
    try {
      fis = new FileReader(fis_file);
      System.out.println("[INFO] 成功载入 相应方法");
      char[] chars = new char[20];
      int length ;
      while ((length = fis.read(chars)) != -1){
        System.out.println("[INFO] " + "chars: " + new String(chars) + " off: " + 0 + " length: " + length);

      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }finally {
      // 进行关闭文件操作
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
}

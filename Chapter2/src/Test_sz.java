/*
  数组相关测试
 */

class Test_sz{
  public static void main(String[] args){
    System.out.println(123);
    Demo3();

  }
  private static void Demo1(){
    // 初始化一个数组. 长度为3
    int[] arr = new int[3];
    System.out.println("===== ===== ===== ===== ===== ");
    System.out.println("内存中地址: " + arr);

    System.out.println("存储的第 0 位内容: " + arr[0]);
    System.out.println("存储的第 1 位内容: " + arr[1]);
    System.out.println("存储的第 2 位内容: " + arr[2]);

    System.out.println("===== ===== ===== ===== ===== ");
    System.out.println("修改里面的内容.并进行测试; 修改第2 位的值位 9 ");
    arr[2] = 99999999;
    arr[0] = 11 ;
    System.out.println("内存中地址: " + arr);
    System.out.println("存储的第 2 位内容: " + arr[2]);

    System.out.println("从结果来看. 在内存中.生成的地址.只会存储相应的内容.变更后.不会改变位置");
  }
  private static void Demo2(){
    // 初始化一个数组. 长度为3
    System.out.println("===== ===== ===== ===== ===== ");
    int[] arr = new int[2];
    System.out.println("内存中地址: " + arr);
    arr[0] = 1;
    arr[1] = 2;
    System.out.println("存储的第 0 位内容: " + arr[0]);
    System.out.println("存储的第 1 位内容: " + arr[1]);
    System.out.println("===== ===== ===== ===== ===== ");
    int[] arrs = new int[2];
    System.out.println("内存中地址: " + arrs);
    arrs[0] = 11;
    arrs[1] = 12;
    System.out.println("存储的第 0 位内容: " + arrs[0]);
    System.out.println("存储的第 1 位内容: " + arrs[1]);
    System.out.println("===== ===== ===== ===== ===== ");
    int[] arr3 = arr;
    System.out.println("内存中地址: " + arr3);
    arr3[0] = 13;
    arr3[1] = 14;
    System.out.println("存储的第 0 位内容: " + arr3[0]);
    System.out.println("存储的第 1 位内容: " + arr3[1]);

  }
  private static void Demo3(){
    /*
      数组相关 的联系. 进行多出循环
    */
    int[] arr = {1,2,3,4,5,6,7,8,9};
    for (int i=0 ; i <= 8; i++){
      System.out.println("arr[" + i + "]: " + arr[i]);
    }
    System.out.println("===== ===== ===== ===== ===== ");
    int[] arr2 = {0,1,2,3,4,5,6,7,8,9,10,11,12,13};
    System.out.println("arr length: " + arr.length);
    System.out.println("arr2 length: " + arr2.length);
    System.out.println("===== ===== ===== ===== ===== ");
    for (int i =0; i < arr2.length; i++){
      System.out.println("arr[" + i + "]: " + arr2[i]);
    }
    System.out.println("===== ===== ===== ===== ===== ");
    printArray(arr);
    System.out.println("--------------------");
    printArray(arr2);
    System.out.println("--------------------");
    printArray2(arr);
  }
  private static void printArray(int[] arr) {
    for(int x=0; x<arr.length; x++) {
      System.out.println("arr[" + x + "]: " + arr[x]);
    }
  }
  //请看改进版本
  private static void printArray2(int[] arr) {
    System.out.print("[");
    for(int x=0; x<arr.length; x++) {
      if(x == arr.length-1) { //这是最后一个元素
        System.out.println(arr[x]+"]");
      }else {
        System.out.print(arr[x]+", ");
      }
    }
  }
}
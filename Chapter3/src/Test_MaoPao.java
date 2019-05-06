/*
冒泡排序
 */
public class Test_MaoPao {
  public static void main(String[] args){
    Demo1(10);
    int[] arraa = new int[]{10,99,1,5,31,77,56,34};
    bubbleSort2(arraa, arraa.length);
    forprint(arraa);
  }

  private static void forprint(int[] arraa) {
    System.out.println("总长度: "+ arraa.length + "\n遍历内容: ");
    for (int i = 0; i < arraa.length; i++){
      System.out.print(arraa[i] + "\t");
    }
  }

  private static void Demo1(int number){
    /*
      冒泡排序法
     */
    int[][] arrs = new int[10][];
    System.out.println(arrs.length);
    int[][][] ar2rs = new int[10][][];
    System.out.println(ar2rs.length);

    int[] arr = new int[]{10,99,1,5,3,77,56,34};
    forprint(arr);
    System.out.println();

    System.out.println("排序内容: ");
    for (int i = 0; i < arr.length - 1; i++){
//      System.out.println(i);
//      System.out.println(arr.length - 1 - i);
      for (int x=0; x < arr.length - 1 - i ;x++){
//        System.out.println(arr.length);
        if(arr[x] > arr[x + 1]){
          int tmep = arr[x]; //换位置
          arr[x] = arr[x+1];
          arr[x+1]=tmep;
        }
      }
    }
    for (int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + "\t");
    }
  }
  private static void bubbleSort2(int [] a, int n){
    int j, k = n;
    boolean flag = true;//发生了交换就为true, 没发生就为false，第一次判断时必须标志位true。
    while (flag){
      flag=false;//每次开始排序前，都设置flag为未排序过
      for(j=1; j<k; j++){
        if(a[j-1] > a[j]){//前面的数字大于后面的数字就交换
          //交换a[j-1]和a[j]
          int temp;
          temp = a[j-1];
          a[j-1] = a[j];
          a[j]=temp;

          //表示交换过数据;
          flag = true;
        }
      }
      k--;//减小一次排序的尾边界
    }//end while
  }//end
}
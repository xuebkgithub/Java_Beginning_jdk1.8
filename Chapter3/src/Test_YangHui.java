/*
前提：每行端点与结尾的数为1.
（与上图中的n不同，这里第一行定义为n=1）
每个数等于它上方两数之和。
每行数字左右对称，由1开始逐渐变大。
第n行的数字有n项。
第n行的m个数可表示为 C(n-1，m-1)，即为从n-1个不同元素中取m-1个元素的组合数。
第n行的第m个数和第n-m+1个数相等 ，为组合数性质之一。
每个数字等于上一行的左右两个数字之和。可用此性质写出整个杨辉三角。即第n+1行的第i个数等于第n行的第i-1个数和第i个数之和，这也是组合数的性质之一。即 C(n+1,i)=C(n,i)+C(n,i-1)。
(a+b)n的展开式中的各项系数依次对应杨辉三角的第(n+1)行中的每一项。
将第2n+1行第1个数，跟第2n+2行第3个数、第2n+3行第5个数……连成一线，这些数的和是第4n+1个斐波那契数；将第2n行第2个数(n>1)，跟第2n-1行第4个数、第2n-2行第6个数……这些数之和是第4n-2个斐波那契数。
将第n行的各数值，分别乘以10的列数m-1次方，然后把这些数值相加的和等于11的n-1次方。例子：第11行数分别为1,10,45,120,210,252,210,120,45,10,1，则11^10 = 1*10^0+10*10^1+45*10^2+...+1*10^10 =25937424601
 */
public class Test_YangHui {
  public static void main(String[] args){
    System.out.print("杨辉三角相关");
    Demo1(10);
  }
  private static void Demo1(int number){
    /*
      第一种实现的方案 二维数组
     */
    System.out.println("杨辉三角 开始 打印,总共: " + number + "行");
    int[][] Data = new int[number][];
    // 初始化第二层数组
//    for (int i = 0; i < number; i++){
//      Data[i] = new int[i + 1];
//    }
    // 开始赋值
    for (int i = 0; i < number; i++){
      Data[i] = new int[i + 1]; //初始化
      Data[i][0] = Data[i][i] = 1; // 第一个和最后一个.肯定是 1
//      for (int j = 0 ; j < i + 1; j++ ){
//        if (i > 1 && j >0 && j <i){
//          Data[i][j] = Data[i-1][j] + Data[i-1][j-1];
//        }
//      }
      for (int j = 1; j < i ; j ++){
        Data[i][j] = Data[i-1][j] + Data[i-1][j-1];
      }
    }

    // 打印最终结果
    // 控制最外层 总行数
    for (int i = 0; i < number; i++){
      for (int k = 0; k < (number - 1) - i; k++ ){
        System.out.print(" ");
      }
      for (int j = 0 ; j < i + 1; j++ ){
        System.out.print(Data[i][j] + " ");
      }
      System.out.println("");
    }
    System.out.print("完成");
  }
}
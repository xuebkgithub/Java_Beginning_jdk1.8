
public class Test_Array {
  public static void main(String[] args){
    int[] arr = new int[]{1,2,5,74,614,3165,-1,-99};
    Test_ArrayUtil array = new Test_ArrayUtil();
    array.printArray(arr);
    array.sort(arr,arr.length);
    array.printArray(arr);
    System.out.println("最大值:" + array.getMax(arr));
    System.out.println("最小值:" + array.getMin(arr));
    System.out.println("平均数:" + array.getAvg(arr));
    System.out.println("总和: "  + array.getSum(arr));
    System.out.println("数组的反转: ");
    array.printArray(array.reverse(arr));
//    arr.wait();
//    System.out.println("实现数组的复制: "  + array.getSum(arr));

  }
}

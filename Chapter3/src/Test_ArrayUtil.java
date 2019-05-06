public class Test_ArrayUtil {
  public static void main(String[] args){
    // 暂时没用
  }
  // 求数组的最大值
  public int getMax(int[] arr){
    int _temp = arr[0];
    for (int i = 0; i <= arr.length - 1; i++){
//      System.out.println(i);
      if (_temp <= arr[i]){
        _temp = arr[i];
      }
    }
    return _temp;
  }

  // 求数组的最小值
  public int getMin(int[] arr){
    int _temp = arr[0];
    for (int i = 0; i <= arr.length - 1; i++){
//      System.out.println(i);
      if (_temp >= arr[i]){
        _temp = arr[i];
      }
    }
    return _temp;
  }

  // 遍历数组元素
  public void printArray(int[] arr){
    System.out.print("遍历所有元素: [");
    for (int i = 0; i <= arr.length - 1; i++){
      if (i == arr.length -1) {
        System.out.println(arr[i] + "]");
        break;
      }
      System.out.print(arr[i] + ", ");
    }
  }

  // 求数组的平均数
  public int getAvg(int[] arr){
    int sum = getSum(arr);
    return sum / arr.length;
  }
  // 求数组的总和
  public int getSum(int[] arr){
    int sum = 0;
    for (int i = 0; i <= arr.length - 1; i++){
      sum += arr[i];
    }
    return sum;
  }
  // 数组的反转
  public int[] reverse(int[] arr){
    // 第一种写法. 会占用内存.并对空间进行从新分配
//    int[] _arr = new int[arr.length];
//    for (int x = 0, y = arr.length -1 ; x < arr.length; x++, y--){
//      _arr[x] = arr[y];
//    }
//    return _arr;
    for (int x=0, y=arr.length-1; x<y; x++,y--){
      int temp = arr[x];
      arr[x] = arr[y];
      arr[y] = temp;
    }
    return arr;
  }
  // 实现数组的复制
  public int[] copy(int[] arr){
    // 第一种写法. 会占用内存.并对空间进行从新分配
    int[] _arr = new int[arr.length];
    for (int x = 0; x < arr.length; x++){
      _arr[x] = arr[x];
    }
    return _arr;
  }
  // 对数组排序
  public void sort(int [] arr, int n){
    int j, k = n;
    boolean flag = true;//发生了交换就为true, 没发生就为false，第一次判断时必须标志位true。
    while (flag){
      flag=false;//每次开始排序前，都设置flag为未排序过
      for(j=1; j<k; j++){
        if(arr[j-1] > arr[j]){//前面的数字大于后面的数字就交换
          //交换a[j-1]和a[j]
          swap(arr,j,(j-1));
          //表示交换过数据;
          flag = true;
        }
      }
      k--;//减小一次排序的尾边界
    }//end while
  }
  private void swap(int [] array, int f, int b){
    int temp;
    temp = array[b];
    array[b] = array[f];
    array[f]=temp;
  }
}

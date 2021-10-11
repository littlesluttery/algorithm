import java.util.Arrays;
/*
达达：
根据传入的数组进行特殊排序，排序规则：如样例1、样例2
样例1： 【1，2，2，3，1，3，4】----》1，2，3，4，3，2，1
样例2：【1，2，1，2，3，3，1，2，4，5，6】---》 1，1，2，3，4，6，5，3，2，2，1
 */
public class Solution17 {
    public static void main(String[] args) {
        // 需要排序的数组
        int[] arr = {1,2,1,2,3,3,1,2,4,5,6};
        // 先按照快速排序进行排序
        int[] arr_sort = sort(arr);
        // 打印排完序的结果
        System.out.println(Arrays.toString(arr_sort));
        // 复制一个新的arr用来存储最终的结果
        int[] new_arr = Arrays.copyOf(arr_sort,arr_sort.length);
        // 按照题目理解进行排序
        int[] sort = new_sort(new_arr, arr_sort);
        // 输出排序结果
        System.out.println(Arrays.toString(sort));


    }
    /*
    按照题目要求进行排序，最中间放最大的数，依次右边放第二大数，左边放第三大数，直到放完为止。
     */
    public static int[] new_sort(int[] new_arr,int[] arr){
        int n = arr.length;
        int middle = n/2;
        int left = middle-1;
        int right = middle+1;
        new_arr[middle] = arr[n-1];
        for (int i = n-2; i >0 ; i-=2) {
            new_arr[left] = arr[i-1];
            new_arr[right] = arr[i];
            left -= 1;
            right += 1;
        }

        return new_arr;
    }


    // 排序
    public static int[] sort(int[] sourceArray){
        // 拷贝，不改变参数
        int[] arr = Arrays.copyOf(sourceArray,sourceArray.length);
        return quickSort(arr,0,arr.length);
    }

    private static int[] quickSort(int[] arr, int left, int right) {
        if (left<right){
            int partitionIndex = partition(arr,left,right);
            quickSort(arr,left,partitionIndex-1);
            quickSort(arr,partitionIndex+1,right);

        }
        return arr;
    }

    private static int partition(int[] arr, int left, int right) {
        //设定基准值
        int pivot = left;
        int index = pivot +1;
        for (int i = index; i < right; i++) {
            if(arr[i] < arr[pivot]){
                swap(arr,i,index);
                index ++;
            }

        }
        swap(arr,pivot,index-1);
        return index-1;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}

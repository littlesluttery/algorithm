import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        //排序前
        System.out.println(Arrays.toString(ns));
        int[] sort = sort(ns);
        //排序后
        System.out.println(Arrays.toString(sort));

    }
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

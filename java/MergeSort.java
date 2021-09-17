
import java.util.Arrays;

public class MergeSort{
    public static void main(String[] args) throws Exception {
        int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        //排序前
        System.out.println(Arrays.toString(ns));
        int[] sort = sort(ns);
        //排序后
        System.out.println(Arrays.toString(sort));


    }

    public static int[] sort(int[] sourceArray) {
        // 对arr进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray,sourceArray.length);
        if (arr.length <2){
            return arr;
        }
        int middle = (int)Math.floor(arr.length/2);
        int[] left = Arrays.copyOfRange(arr,0,middle);
        int[] right = Arrays.copyOfRange(arr,middle,arr.length);
        return merge(sort(left),sort(right));


    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i =0;
        while (left.length>0 && right.length >0){
            if (left[0]<=right[0]){
                result[i++] = left[0];
                left = Arrays.copyOfRange(left,1,left.length);

            }else {
                result[i++] = right[0];
                right = Arrays.copyOfRange(right,1,right.length);
            }

        }
        while (left.length>0){
            result[i++] = left[0];
            left = Arrays.copyOfRange(left,1,left.length);
        }
        while(right.length>0){
            result[i++] = right[0];
            right = Arrays.copyOfRange(right,1,right.length);

        }
        return result;

    }
}

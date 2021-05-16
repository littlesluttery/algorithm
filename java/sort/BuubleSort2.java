package sort;

import java.util.Arrays;

public class BuubleSort2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort2(new int[]{3,2,4,1,7,6,8,9,5})));
    }

    private static int[] sort2(int[] sourceArray) {
        // 对原数组进行复制
        int[] array = Arrays.copyOf(sourceArray, sourceArray.length);

        for (int i = 1; i < array.length ; i++) {
            Boolean flag = true;
            for (int j = 0; j < array.length - i ; j++) {

                if (array[j] > array[j+1]){
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                    flag = false;
                }

            }
            if (flag){
                break;
            }

        }
        return array;

    }
}

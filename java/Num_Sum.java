import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Num_Sum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1,2,3,4,5,6},10)));
        System.out.println(Arrays.toString(solution1(new int[]{1,2,3,4,5,6},10)));
        System.out.println(Arrays.toString(solution2(new int[]{1,2,3,4,5,6},10)));
    }

    private static int[] solution2(int[] num, int target) {

        int low = 0;int high = num.length-1;
        int sum = num[low] + num[high];
        if (sum == target){
            return new int []{low,high};
        }else if (sum<target){
            low = low + 1;
        }else {
            high = high - 1;
        }





        return new int[0];
    }

    private static int[] solution1(int[] numbers, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length ; i++) {
            if (map.containsKey(target-numbers[i])){
                return new int[]{map.get(target-numbers[i]),i};
            }
            map.put(numbers[i],i);
        }
        return new int[0];

    }


    // 暴力破解，两个for循环
    private static int[] solution(int[] numbers, int target) {
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = i+1; j <numbers.length ; j++) {
                if (numbers[i] + numbers[j] == target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[0];
    }
}

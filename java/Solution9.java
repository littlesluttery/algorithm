import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 58同城
public class Solution9 {
    public static void main(String[] args) {

    }
    public int[][] sumOfEight (int[] array) {
        // write code here
        List<List<Integer>> tmp = check(array);
        int[][] re = new int[tmp.size()][3];
        for (int i = 0; i < re.length; i++) {
            for (int j = 0; j <3 ; j++) {
                re[i][j] = tmp.get(i).get(j);

            }
        }
        return re;

    }

    private List<List<Integer>> check(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] >8){
                return lists;
            }
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.length-1;
            while (left<right){
                if(nums[i] + nums[left] + nums[right]>8)
                    right--;
                else if(nums[i] + nums[left] + nums[right]<8)
                    left ++;
                else{
                    lists.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left<right && nums[left]==nums[left+1])
                        left++;
                    while (left<right && nums[right] == nums[right-1])
                        right--;
                    left++;
                    right--;
                }

            }

        }
        return lists;
    }
}

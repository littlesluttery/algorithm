/*
给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
输出：6
解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。*/
public class Solution2 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int i = maxSubArray(nums);
        System.out.println(i);

    }
    public static int maxSubArray(int[] nums){
        // 处理特殊情况
        if (nums.length == 1){
            return nums[0];
        }
        //初始和，用来和中间和进行比较
        int sum = Integer.MIN_VALUE;
        // 保存最终结果的和
        int count = 0;
        for (int i = 0; i <nums.length ; i++) {
            count = count + nums[i];
            sum = Math.max(sum,count);
            if (count<0){
                count = 0;
            }

        }


        return sum;
    }
}

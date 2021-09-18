/*
给你一个非负整数数组 nums ，你最初位于数组的第一个位置。

数组中的每个元素代表你在该位置可以跳跃的最大长度。

你的目标是使用最少的跳跃次数到达数组的最后一个位置。

假设你总是可以到达数组的最后一个位置。

输入: nums = [2,3,1,1,4]
输出: 2
解释: 跳到最后一个位置的最小跳跃数是 2。
     从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。


 */

public class Solution3 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int jump = jump(nums);
        System.out.println(jump);

    }
    public static int jump(int[] nums){
        // 处理特殊情况
        if (nums.length ==0 || nums.length == 1 || nums == null){
            return 0;
        }
        // 当前最大覆盖范围
        int curDistance = 0;
        // 最大覆盖范围
        int maxDistance = 0;
        // 计数
        int count = 0;
        for (int i =0;i<nums.length;i++){
            // 在可覆盖区域内更新最大覆盖区域
            maxDistance = Math.max(curDistance,i+nums[i]);
            // 说明在条一步，就到了末尾
            if(maxDistance >= nums.length-1){
                count++;
                break;
            }
            // 走到当前覆盖最大下标时，更新下一步覆盖范围
            if(curDistance == i){
                curDistance = maxDistance;
                count++;

            }

        }
        return count;
    }

}

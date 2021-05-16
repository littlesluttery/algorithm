import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        System.out.println(sort(new int[]{1,2,3,4,5,6}));
        System.out.println(getMaxMin(new int[]{1,2,3,4,5,6}));
    }

    private static int getMaxMin(int[] nums) {
        //先定义两个最小的数和三个最大的数
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for(int x:nums){
            if (x<min1){
                min2 = min1;
                min1 = x;

            }else if (x<min2){
                min2 = x;
            }

            if(x>max1){
                max3 = max2;
                max2 = max1;
                max1 = x;
            }else if(x>max2){
                max3 = max2;
                max2 = x;
            }else if(x > max3){
                max3 = x;

            }
        }
        return Math.max(max1*max2*max3,min1*min2*max1);


    }

    private static int sort(int[] nums) {
        // 利用数组进行排序
        Arrays.sort(nums);
        // 计算数组长度
        int n = nums.length;
        return Math.max(nums[0]*nums[1]*nums[n-1],nums[n-1]*nums[n-2]*nums[n-3]);
    }
}

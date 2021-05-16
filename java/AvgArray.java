public class AvgArray {

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3},4));
    }

    private static double findMaxAverage(int[] nums, int k) {
        int sum = 0; // 求和
        // 计算第一个窗口的和
        for (int i = 0; i <k ; i++) {
            sum = sum + nums[i];
        }
        // 将第一个窗口的值设为最大值
        int max = sum;
        for (int i = k; i < nums.length ; i++) {
            sum = sum - nums[i-k] + nums[i]; // 减去上个滑动窗口的第一个值加上新的滑动窗口的最后一个值
            max = Math.max(sum,max);

        }

        return 1.0 * max/k;
    }
}

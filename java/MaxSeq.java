public class MaxSeq {

    public static void main(String[] args) {
        System.out.println(findLength(new int[]{1,2,3,2,3,4,3,4,5,6}));
    }

    private static int findLength(int[] nums) {
        // 保存数组的开始节点
        int start = 0;
        // 保存数组的长度
        int max = 0;
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i] < nums[i - 1 ]){ // 判断当前值小于前一个值，则将其实节点赋值给当前值，重新开始计算新的数组的长度
                start = i;
            }
            max = Math.max(max,i-start+1); // 比较当前数组长度和最大数组长度的大小
        }

        return max;
    }
}

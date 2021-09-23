public class Solution_Candy {
    public static void main(String[] args) {
        //int[] ratirngs = {1,0,2};
        int[] ratirngs = {1,3,2,2,1};
        int candy_sum = candy(ratirngs);
        System.out.println(candy_sum);

    }
    public static int candy(int[] ratings){
        // 先初始化一个数组，存放每个孩子糖果个数
        int[] candy = new int[ratings.length];
        // 初始化每个孩子糖果最少为1
        for (int i = 0; i < ratings.length ; i++) {
            candy[i] = 1;

        }
        // 先从左往右处理孩子的糖果
        for (int i = 1; i < ratings.length ; i++) {
            if (ratings[i] > ratings[i-1]){
                candy[i] = candy[i-1] +1;
            }


        }
        // 从右往左处理孩子糖果
        for (int i = ratings.length-2; i >= 0 ; i--) {
            if(ratings[i] > ratings[i+1]){
                candy[i] = Math.max(candy[i],candy[i+1] +1);
            }

        }
        // 统计糖果结果
        int count = 0;
        for (int i = 0; i <candy.length ; i++) {
            count += candy[i];
        }

        return count;
    }
}

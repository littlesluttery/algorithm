public class lemonChange {
    public static void main(String[] args) {
        System.out.println(change(new int[]{5, 5, 10}));
    }

    private static boolean change(int[] nums) {

        int five = 0;     // 定义5元的数量
        int ten = 0;     // 10元的数量

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 5) {    // 如果是5元，那就将5元的数量加1
                five++;
            } else if (nums[i] == 10) {  // 如果是10元，判断是否有5元，如果没有，返回false，如果有，那么5元的个数减1，10元的数量加1
                if (five == 0) {
                    return false;
                }
                five --;
                ten ++;

            } else {  // 判断20元，两种结果。一种如果5元和10元都存在，则5和10的数量减1，否则判断是否有三个5，如果有，就将5的个数减少3，否则返回false。
                if (five > 0 && ten > 0) {
                    five --;
                    ten --;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }

            }

        }
        return true;
    }
}

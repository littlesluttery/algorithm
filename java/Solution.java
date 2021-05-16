public class Solution {

    public static void main(String[] args) {
        int n = 13;
        System.out.println(hammingWeight(n));
    }

    private static int hammingWeight(int n) {
        // 用来保存取到的结果
        int res = 0;
        while(n != 0){
            res = res + (n &  1);
            n = n >>> 1;
        }
        return res;
    }
}

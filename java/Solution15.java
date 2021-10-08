/*
给定一个非负整数 N，找出小于或等于 N 的最大的整数，同时这个整数需要满足其各个位数上的数字是单调递增。

（当且仅当每个相邻位数上的数字 x 和 y 满足 x <= y 时，我们称这个整数是单调递增的。）

 */
public class Solution15 {
    public static void main(String[] args) {
        int n = 332;
        int i = monotoneIncreasingDigits(n);
        System.out.println(i);

    }
    public static int monotoneIncreasingDigits(int n){
        String[] strings = (n+"").split("");
        int start = strings.length;
        for (int i = strings.length-1; i >0 ; i--) {
            if (Integer.parseInt(strings[i]) < Integer.parseInt(strings[i-1])){
                strings[i-1] = (Integer.parseInt(strings[i-1])-1)+"";
                start = i;
            }

        }
        for (int i = start; i <strings.length ; i++) {
            strings[i] = "9";
            
        }
        return Integer.parseInt(String.join("",strings));
    }
}

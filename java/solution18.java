import java.util.Arrays;
import java.util.Stack;
/*
请根据每日 气温 列表 temperatures ，请计算在每一天需要等几天才会有更高的温度。
如果气温在这之后都不会升高，请在该位置用 0 来代替。
输入: temperatures = [73,74,75,71,69,72,76,73]
输出: [1,1,4,2,1,1,0,0]

 */
public class solution18 {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] ints = dailyTemperatures(temperatures);
        System.out.println(Arrays.toString(ints));
    }
    public static int[] dailyTemperatures(int[] temperatures){
        // 存放数组下标
        Stack<Integer> stack = new Stack<>();
        // 存放最终结果
        int[] res = new int[temperatures.length];
        // 遍历数组，判断当前数和栈顶元素的大小
        for (int i = 0; i <temperatures.length ; i++) {
            while (!stack.empty() && temperatures[i] > temperatures[stack.peek()]){
                int preindex = stack.pop();
                res[preindex] = i-preindex;
            }
            stack.push(i);
        }
        return res;
    }
}

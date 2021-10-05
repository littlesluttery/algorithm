import java.util.Arrays;
import java.util.LinkedList;

/*
以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。
请你合并所有重叠的区间，并返回一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间。
输入：intervals = [[1,3],[2,6],[8,10],[15,18]]
输出：[[1,6],[8,10],[15,18]]
解释：区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].

 */
public class Solution13 {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] merge = merge(intervals);
        // 遍历二维数组
        System.out.println(Arrays.deepToString(merge));

    }
    public  static int[][] merge(int[][] intervals){
        LinkedList<int[]> res = new LinkedList<>();
        Arrays.sort(intervals,((o1, o2) -> Integer.compare(o1[0],o2[0])));
        res.add(intervals[0]);
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] <= res.getLast()[1]){
                int start = res.getLast()[0];
                int end = Math.max(intervals[i][1],res.getLast()[1]);
                res.removeLast();
                res.add(new int[]{start,end});
            }else {
                res.add(intervals[i]);
            }

        }

        return res.toArray(new int[res.size()][]);
    }
}

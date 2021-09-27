public class Solution10 {
    public static void main(String[] args) {
        //int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};  // 1
        //int[][] intervals = {{1,2},{1,2},{1,2}}; // 2
        int[][] intervals = {{1,2},{2,3}}; // 0
        int i = eraseOverlapIntervals(intervals);
        System.out.println(i);

    }
    public static int eraseOverlapIntervals(int[][] intervals){
        int count = 0;
        for (int i = 1; i < intervals.length ; i++) {
            if(intervals[i][0]<intervals[i-1][1]){
                count++;
            }
        }
        return count;

    }
}

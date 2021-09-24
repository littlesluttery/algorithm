import java.util.Arrays;
import java.util.LinkedList;

public class Solution6 {
    public static void main(String[] args) {
        int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        System.out.println(Arrays.deepToString(people));
        int[][] ints = reconstructQueue(people);
        System.out.println(Arrays.deepToString(ints));

    }
    public static int[][] reconstructQueue(int[][] people){
        // 身高从大到小排（身高相同k小的站前面）
        Arrays.sort(people,(a,b)->{
            if (a[0]==b[0]) return a[1]-b[1];
            return b[0] - a[0];

        });
        LinkedList<int[]> que = new LinkedList<>();
        for (int[] p:people) {
            que.add(p[1],p);
        }
        return que.toArray(new int[people.length][]);

    }
}

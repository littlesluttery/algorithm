import java.util.LinkedList;
import java.util.List;

public class Solution12 {
    public static void main(String[] args) {
        String S = "ababcbacadefegdehijhklij";
        List<Integer> list = partitionLabels(S);
        System.out.println(list);


    }
    public static  List<Integer> partitionLabels(String S){
        // 保存最终的分组结果
        List<Integer> list = new LinkedList<>();
        int edge[] = new int[123];
        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            //System.out.println(edge[chars[i]-0]);
            edge[chars[i] -0] = i;

        }
        int idx= 0;
        int last = -1;
        for (int i = 0; i < chars.length; i++) {
            idx = Math.max(idx,edge[chars[i]-0]);
            if (i==idx){
                list.add(i-last);
                last = i;
            }
            
        }
        return list;

    }
}

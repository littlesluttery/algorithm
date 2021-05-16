public class SortedArrayDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,1,2,2,3,3,4}));
    }

    private static int removeDuplicates(int[] n) {
        if (n.length == 0){
            return 0;
        }

        int i = 0;
        for (int j = 1; j < n.length ; j++) {

            if (n[j] != n[i]){
                i ++;
                n[i] = n[j];
            }

        }
        return i + 1;
    }
}

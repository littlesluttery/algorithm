import java.util.Arrays;

public class MergeSortArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,3,5,7,9,0,0,0,0,0,0};
        int[] nums2 = new int[]{2,4,6,8,9,10};
        //System.out.println(Arrays.toString(merge(nums1,5,nums2,4)));
        System.out.println(Arrays.toString(merge1(nums1,5,nums2,6)));
    }

    private static int[] merge1(int[] nums1, int m, int[] nums2, int n) {
        int[] copy_nums1 = new int[m];
        System.arraycopy(nums1,0,copy_nums1,0,m);
        int p1 = 0;
        int p2 = 0;
        int p = 0;
        while (p1 < m && p2 < n){
            nums1[p++] = copy_nums1[p1] < nums2[p2] ? copy_nums1[p1++] : nums2[p2++];
        }
        if (p1<m){
            System.arraycopy(copy_nums1,p1,nums1,p1+p2,m+n-p1-p2);
        }
        if (p2<n){
            System.arraycopy(nums2,p2,nums1,p1+p2,m+n-p1-p2);

        }
        return nums1;
    }

    private static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
        return nums1;
    }
}

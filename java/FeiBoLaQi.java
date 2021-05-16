public class FeiBoLaQi {
    public static void main(String[] args) {
        System.out.println(calculate(10));
        System.out.println(calculate1(10));
        System.out.println(calculate2(10));
    }

    private static int calculate2(int n) {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        //int sum = 0;
        int low = 0; int high = 1;
        for (int i = 2; i <= n ; i++) {
            int sum = low  + high;
            low = high;
            high = sum ;

        }
        return high;

            
        
    }

    private static int calculate1(int n) {
       int[] arr = new int[n+1];
       return recurse(arr,n);

    }

    private static int recurse(int[] arr, int n) {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        if (arr[n] != 0){
            return arr[n];
        }
        arr[n] = recurse(arr,n-1) + recurse(arr,n-2);
        return arr[n];

    }

    private static int calculate(int n) {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }


        return calculate(n-1)+ calculate(n-2);
    }
}

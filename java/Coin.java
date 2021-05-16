public class Coin {
    public static void main(String[] args) {
        System.out.println(arrageCoin(5));
        System.out.println(arrageCoin1(5));
        System.out.println(newTonCoin2(5));
    }

    private static int newTonCoin2(int x) {
        if (x == 0){
            return 0;
        }
        return (int) Sqrt(x,x);
    }

    private static double Sqrt(double x, int n) {
        double res = (x + (2*n -x)/x)/2;
        if (res == x){
            return x;
        }else {
            return Sqrt(res,n);
        }

    }

    private static int arrageCoin1(int n) {
        int low = 0;int high = n;
        while (low<=high){
            int mid = (high - low )/2 + low;
            int cost = (mid*mid + mid)/2;
            if (cost == n){
                return mid;

            }else if (cost < n){
                low = low +1;
            }else {
                high = high -1;
            }
        }

        return high;
    }

    private static int arrageCoin(int n) {
        for (int i = 1; i <= n ; i++) {
            n  = n - i ;
            if (n <= i ){
                return i;
            }
        }
       return 0;
    }
}

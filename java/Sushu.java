public class Sushu {


    public static void main(String[] args) {
        //System.out.println(bf(100));
        System.out.println(eratosthenes(100));


    }

    // 暴力算法
    public static int bf(int n){
        int count = 0;
        for (int i = 2; i < n  ; i++) {
            count += isPrime(i) ? 1 : 0;
        }
        return count;
    }

    private static boolean isPrime(int i) {
        for (int j = 2; j*j <= i ; j++) {
            if (i % j == 0){
                return false;
            }
        }

        return true;
    }

    // 埃筛法 素数 非素数（合数）
    public static int eratosthenes(int n){
        boolean[] isPrime = new boolean[n]; // false
        int count = 0;
        for (int i = 2; i < n; i++) {
            if(!isPrime[i]){
                count ++;
                for (int j = i*i; j < n; j+=i) {
                    isPrime[j] = true;
                }
            }

        }
        return count;
    }
}

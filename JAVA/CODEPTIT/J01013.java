public class J01013 {
    private static final int MAX = 2000000;
    private static long[] primeSum = new long[MAX + 1];

    // Hàm sàng Eratosthenes để tính tổng ước số nguyên tố
    public static void sieve() {
        for (int i = 2; i <= MAX; i++) {
            if (primeSum[i] == 0) { // i là một số nguyên tố
                for (int j = i; j <= MAX; j += i) {
                    int k = j;
                    while (k % i == 0) {
                        primeSum[j] += i;
                        k /= i;
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        sieve();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long res = 0;
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            res += primeSum[ (int) n];
        }
        System.out.println(res);
    }
}

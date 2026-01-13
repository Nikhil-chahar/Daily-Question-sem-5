class Solution {
    public int largestPrime(int n) {
        int ans = 2;
        int x = 3;
        int res = 0;
        if (n >= 2) res = 2;
        
        long sum = 2; // Start with first prime 2
        
        while (sum + x <= n) { // Optimization: check bounds
            if (isPrime(x)) {
                 sum += x;
                 if (sum <= n && isPrime((int)sum)) {
                     res = (int)sum;
                 }
            }
            x++;
        }
        return res;
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n == 2;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
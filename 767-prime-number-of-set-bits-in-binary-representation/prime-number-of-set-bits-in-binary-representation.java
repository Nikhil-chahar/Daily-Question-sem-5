class Solution {
    public int countPrimeSetBits(int left, int right) {
        List<Integer> primes = new ArrayList<>();
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(num);
            }
        }
        int c=0;
        for(int i=left;i<=right;i++){
            String s = Integer.toBinaryString(i);
            int cntBit = count(s);
            if(primes.contains(cntBit)){
                c++;
            }
        }
        return c;
    }
    public int count(String s){
        int cn =0;
        for(char ch : s.toCharArray()){
            if(ch == '1'){
                cn++;
            }
        }
        return cn;
    }
}
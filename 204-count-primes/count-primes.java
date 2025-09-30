class Solution {
    public int countPrimes(int n) {
        if(n <2){
            return 0;
        }

        return countPrime(n);
    }
    public int countPrime(int n){
        int arr[] = new int[n];
        arr[0] = arr[1] = 1;

        for(int i=2;i*i<=n;i++){
            if(arr[i] == 0){
                for(int j=2;i*j < n;j++){
                    arr[i*j] =1;
                }
            }
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i] == 0){
                c++;
            }
        }
        return c;
    }
}
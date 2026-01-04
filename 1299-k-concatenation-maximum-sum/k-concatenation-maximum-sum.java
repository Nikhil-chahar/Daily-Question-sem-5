class Solution {
    public int mod = 1_000_000_007;
    public int kConcatenationMaxSum(int[] arr, int k) {
        long mSum = Kadane(arr);
        if(k ==1) return (int)(mSum % mod);

        long priSum = Prifix(arr);
        long suffSum = Suffix(arr);

        long ans=0;
        for(int val : arr){
            ans += val;
        }
        long fin;
        if(ans > 0){
            fin = priSum + suffSum + (k-2)* ans;
        }else{
            fin = priSum + suffSum ;
        }

        return (int)(Math.max(mSum,fin) %mod)   ;

    }
    public long Prifix(int arr[]){
        long sum =0;
        long max =0;
        for(int v : arr){
            sum += v;
            max = Math.max(max,sum);
        }
        return max;
    }
    public long Suffix(int[] arr){
        long sum =0;
        long max =0;
        for(int i=arr.length-1;i>=0;i--){
            sum += arr[i];
            max = Math.max(max,sum);
        }
        return max;
    }
    public long Kadane(int arr[]){
        long sum=0;
        long max =0;

        for(int v:arr){
            sum = Math.max(0,sum+v);
            max = Math.max(max,sum);

        }
        return max;
    }

}
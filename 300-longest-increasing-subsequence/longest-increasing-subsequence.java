class Solution {
    public int lengthOfLIS(int[] arr) {

        int sol[] = new int[arr.length];
        Arrays.fill(sol,1);

        for(int i=0;i<arr.length;i++){
            int ma=0;
            for(int j = i-1;j>=0;j--){
                if(arr[i] > arr[j]){
                    ma = Math.max(ma,sol[j]);
                }
            }
            sol[i]+=ma;
        } 

        // int max=1;
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(sol[i]+" ");
        //     if(sol[i] > max){
        //         max = sol[i];
        //     }
        // }
        // return max;
        return Arrays.stream(sol).max().getAsInt();




































        // int dp[] =  new int[arr.length];
        // Arrays.fill(dp,1);
        // for(int i=1;i<dp.length;i++){
        //     for(int j=i-1;j>=0;j--){
        //         if(arr[i] > arr[j]){
        //             int x = dp[j];
        //             dp[i] = Math.max(dp[i],x+1);
        //         }
        //     }
        // }
        // return Arrays.stream(dp).max().getAsInt();
    }
}
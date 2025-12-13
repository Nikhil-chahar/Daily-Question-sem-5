class Solution {
    public String[] findRelativeRanks(int[] score) {
        int len = score.length;
        int arr[][] = new int[len][2];

        for(int i=0;i<len;i++){
            arr[i][0] = score[i];
            arr[i][1] = i;
        }
        Arrays.sort(arr,(a,b) -> b[0]-a[0]);

        for(int i=0;i<len;i++){
            System.out.println(arr[i][0]+ " " + arr[i][1]);
        }
        String ans[] = new String[len];
        if(len == 0){
            return ans;
        }
        ans[arr[0][1]] = "Gold Medal";
        if(len == 1){
            return ans;
        }
        ans[arr[1][1]] = "Silver Medal";
        if(len == 2){
            return ans;
        }
        ans[arr[2][1]] = "Bronze Medal";
        if(len == 3){
            return ans;
        }
        for(int i=3;i<len;i++){
            ans[arr[i][1]] = Integer.toString(i+1);
        }

        return ans;
    }
}
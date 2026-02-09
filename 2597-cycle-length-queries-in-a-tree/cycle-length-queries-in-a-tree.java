class Solution {
    public int[] cycleLengthQueries(int n, int[][] queries) {
        int ans[] = new int[queries.length];
        int ind =0;
        
        for(int ar[] : queries){
            int a = ar[0];
            int b = ar[1];
            int st=0;
            while(a != b){
                if(a >b){
                    a /=2;
                }else{
                    b/=2;
                }
                st++;
            }

            ans[ind++] = st+1;

        }
        return ans;
    }
      
}
class Solution {
    public int findChampion(int n, int[][] edges) {
        int inde[] = new int[n];

        for(int ar[] : edges){
            int a = ar[0];
            int b = ar[1];
            inde[b]++;
        }
        int mn = Integer.MAX_VALUE;
        for(int val : inde){
            if(mn > val){
                mn = val;
            }
        }
        int cnt = 0;
        int ind = -1;
        for(int i=0;i<n;i++){
            if(mn == inde[i]){
             cnt++;
             ind = i;
            }
        }
        return cnt == 1 ? ind :-1;
    }
}
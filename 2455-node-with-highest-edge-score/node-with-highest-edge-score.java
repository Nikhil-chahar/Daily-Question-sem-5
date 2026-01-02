class Solution {
    public int edgeScore(int[] edges) {
        int n = edges.length;
        long arr[] = new long[n];

        for(int i=0;i<n;i++){
            arr[edges[i]] += i;
        }

        long max = -1;
        int ind = 0;

        for(int i=0;i<n;i++){
            if(max < arr[i]){
                max = arr[i];
                ind = i;
            }
        }
        return ind;

        
    }
}

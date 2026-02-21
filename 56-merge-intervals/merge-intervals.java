class Solution {
    public int[][] merge(int[][] in) {
        Arrays.sort(in,(a,b)-> a[0]-b[0]);
        List<int[]> ll = new ArrayList<>();
        int prev[] = in[0];

        for(int i=1;i<in.length;i++){
            int curr[] = in[i];
            if(prev[1] >= curr[0]){
                prev[1] = Math.max(prev[1],curr[1]);
            }
            else{
                ll.add(prev);
                prev = curr;
            }
        }
        ll.add(prev);
        return ll.toArray(new int[ll.size()][]);
        
    }
}
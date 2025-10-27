class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<Integer> ll = new ArrayList<>();

        for(int i =0;i<mat.length;i++){
            int c=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 1){
                    c++;
                }
            }
            ll.add(c);
        }
        int arr[][] = new int[mat.length][2];
        for(int i=0;i<arr.length;i++){
            arr[i][0] = i;
            arr[i][1] = ll.get(i);
        }
        Arrays.sort(arr, (a,b) -> a[1] -b[1]);

        int ans[] = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = arr[i][0];
        }
        return ans;
    }
}
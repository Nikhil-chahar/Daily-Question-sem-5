class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<Integer> ll = new ArrayList<>();

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                ll.add(grid[i][j]);
            }
        }
        int arr[] = new int[ll.size()];
        int ind=0;

        k = k%(grid.length*grid[0].length);
        System.out.print(k);

        for(int i=ll.size()-k;i<ll.size();i++){
            arr[ind++] = ll.get(i);
        }
        for(int i=0;i<ll.size()-k;i++){
            arr[ind++] = ll.get(i);
        }
        List<List<Integer>> ans = new ArrayList<>();
        int c=0,tc=ll.size();
        ind=0;
        while(c<tc){
            List<Integer> nl = new ArrayList<>();
            while(nl.size() != grid[0].length){
                nl.add(arr[ind++]);
                c++;
            }
            ans.add(nl);
        }
        return ans;
    }
}
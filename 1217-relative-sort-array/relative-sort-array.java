class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> ll = new ArrayList<>();
        int ans[] = new int[arr1.length];
        int ind=0; 

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i] == arr1[j]){
                    ll.add(arr1[j]);
                    ans[ind++] = arr1[j];
                }
            }
        }
        Arrays.sort(arr1);

        for(int i=0;i<arr1.length;i++){
            if(ll.contains(arr1[i])){

            }else{
                ans[ind++] = arr1[i];
            }
        }
        return ans;
    }
}
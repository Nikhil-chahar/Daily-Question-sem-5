class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }

        combination(arr,k,0,ll,ans);
        return ans;
    }
    public void combination(int arr[],int k,int st,List<Integer> ll,List<List<Integer>> ans){
        if(ll.size() == k){
            ans.add(new ArrayList<>(ll));
            return;
        }

        for(int i=st;i<arr.length;i++){
            if(!ll.contains(arr[i])){
                ll.add(arr[i]);
                combination(arr,k,i+1,ll,ans);
                ll.remove(ll.size()-1);
            }
        }
    }
}
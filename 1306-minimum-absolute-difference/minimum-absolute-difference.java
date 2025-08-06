class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();

        int min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length-1;i++){
            int val = Math.abs(arr[i] - arr[i+1]);
            if(min > val){
                min = val;
            }
        }
        for(int i=0;i<arr.length-1;i++){
                List<Integer> ll = new ArrayList<>();
                if(Math.abs(arr[i] -arr[i+1]) == min){
                    ll.add(arr[i]);
                    ll.add(arr[i+1]);
                    ans.add(ll);
                }
        }
        System.out.print(min);
        return ans;
    }
}
class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] que, int x) {
        List<Integer> ll = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i] == x){
                ll.add(i);
            }
        }
        System.out.print(ll);

        int ans[] = new int[que.length];

        for(int i=0;i<que.length;i++){
            if(que[i] <= ll.size()){
                ans[i] = ll.get(que[i]-1);
            }else{
                ans[i] = -1;
            }
        }
        return ans;
    }
}
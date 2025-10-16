class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : friends){
            set.add(num);
        }
        int ans[] = new int[friends.length];
        int ind=0;

        for(int i=0;i<order.length;i++){
            if(set.contains(order[i])){
                ans[ind++] = order[i];
            }
        }
        return ans;
        // return Arrays.copyOf(ans, ind);
    }
}
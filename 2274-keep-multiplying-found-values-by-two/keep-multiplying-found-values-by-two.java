class Solution {
    public int findFinalValue(int[] nums, int or) {
        ArrayList<Integer> ll = new ArrayList<>();
        for(int v : nums){
            ll.add(v);
        }
        while(ll.contains(or)){
            or*=2;
        }
        return or;
    }
}
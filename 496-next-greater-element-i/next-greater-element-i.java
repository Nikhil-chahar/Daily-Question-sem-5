class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n : nums2){
            if(!st.isEmpty() && st.peek()<n){
                while(!st.isEmpty() && st.peek()<n){
                    map.put(st.pop(),n);
                }
                 st.push(n);
            }else{
                st.push(n);
            }
        }
        while(!st.isEmpty()){
            map.put(st.pop(),-1);
        }

        System.out.print(map);
            
        int ans[] = new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}
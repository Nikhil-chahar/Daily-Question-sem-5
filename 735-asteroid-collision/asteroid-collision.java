class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int as : asteroids){
            boolean des = false;
            while(!st.isEmpty() && st.peek() >0 && as < 0){
                int top = st.peek();
                if(Math.abs(top) < Math.abs(as)){
                    st.pop();
                    continue;
                }
                else if(Math.abs(top) == Math.abs(as)){
                    st.pop();
                    // break;
                }
                des = true;
                break;
            }
            if(!des) st.push(as);
        }
        int ans[] = new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}
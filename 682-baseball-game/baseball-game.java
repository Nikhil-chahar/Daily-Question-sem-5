class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st = new Stack<>();

        for(String v : op){
            if(v.equals("+")){
                int fi = st.pop();
                int val = fi+st.peek();
                st.push(fi);
                st.push(val);
            }
            else if(v.equals("D")){
                int val = st.peek()*2;
                st.push(val);
            }
            else if(v.equals("C")){
                st.pop();
            }
            else {
                st.push(Integer.parseInt(v));
            }
        }
        int sum =0;
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}
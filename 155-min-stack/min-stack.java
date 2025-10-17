class MinStack {
    private Stack<Integer> st1 = new Stack<>();
    private Stack<Integer> st2 = new Stack<>();
    public MinStack() {
    }
    
    public void push(int val) {
        st1.push(val);
        if(st2.isEmpty() || val <= st2.peek()) st2.push(val);
    }
    
    public void pop() {
        if(st2.peek().equals(st1.peek())) st2.pop();
        st1.pop();
    }
    
    public int top() {
        return st1.peek();
    }
    
    public int getMin() {
        return st2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
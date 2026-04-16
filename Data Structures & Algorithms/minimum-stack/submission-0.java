class MinStack {
    Stack<Integer> stack;
    Stack<Integer> min_stack = new Stack<>();
    int min = Integer.MAX_VALUE;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        if(min_stack.isEmpty()){
            min_stack.push(val);
        }
        else if(val < min_stack.peek()){
            min = val;
            min_stack.push(val);
        }
        else{
            min_stack.push(min_stack.peek());
        }
        stack.push(val);
    }
    
    public void pop() {
        min_stack.pop();
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min_stack.peek();
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
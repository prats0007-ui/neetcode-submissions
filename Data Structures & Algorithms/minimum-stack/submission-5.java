class MinStack {
    Stack<Integer> stack;
    Stack<Integer> stack1;
    int min=Integer.MAX_VALUE;
    
    public MinStack() {
        stack=new Stack<>();
        stack1=new Stack<>();
    }
    
    public void push(int val) {
         
        stack.push(val);
        if(stack1.isEmpty() || val<=stack1.peek()){ 
            stack1.push(val);
        }
    }
    
    public void pop() {
        if(stack.isEmpty()) return;
        int top=stack.pop();
        if(stack1.peek()==top){ 
            stack1.pop();
        }
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return stack1.peek();
    }
}

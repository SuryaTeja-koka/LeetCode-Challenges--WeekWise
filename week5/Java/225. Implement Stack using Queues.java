class MyStack {

    private Queue<Integer> q;

    /** Initialize your data structure here. */
    public MyStack() {
        q = new ArrayDeque<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q.add(x);
        var i=1;
        while(i < q.size()){
            q.add(q.remove());        
            i++;
        }
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return q.remove();
    }
    
    /** Get the top element. */
    public int top() {
        return q.peek();
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }
}

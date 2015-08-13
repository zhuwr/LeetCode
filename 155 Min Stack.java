class MinStack {
    Stack<Integer> myStack = new Stack<Integer>();
    Stack<Integer> help = new Stack<Integer>();
    public void push(int x) {
        myStack.push(x);
        if(help.isEmpty() || x < help.peek()) {
            help.push(x);
        } else {
            help.push(help.peek());
        }
    }

    public void pop() {
        myStack.pop();
        help.pop();
    }

    public int top() {
        return myStack.peek();
    }

    public int getMin() {
        return help.peek();
    }
}

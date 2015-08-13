class MyQueue {
    // Push element x to the back of queue.
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int x) {
        stack1.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        if(!stack2.isEmpty()) {
            stack2.pop();
            return;
        }
        while(!stack1.isEmpty()) {
            stack2.push(stack1.peek());
            stack1.pop();
        }
        stack2.pop();
    }

    // Get the front element.
    public int peek() {
        if(!stack2.isEmpty()) {
            return stack2.peek();
        }
        while(!stack1.isEmpty()) {
            stack2.push(stack1.peek());
            stack1.pop();
        }
        return stack2.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
        if(stack1.isEmpty() && stack2.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}

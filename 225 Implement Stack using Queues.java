class MyStack {
    // Push element x onto stack.
    Queue<Integer> queue1 = new LinkedList<Integer>();
    Queue<Integer> queue2 = new LinkedList<Integer>();
    public void push(int x) {
           if(!queue2.isEmpty()) {
               queue2.offer(x);
           } else {
               queue1.offer(x);
           }
        }

    // Removes the element on top of the stack.
    public void pop() {
        if(queue2.isEmpty()) {
            while(queue1.size()>1) {
                queue2.offer(queue1.peek());
                queue1.poll();
            }
            queue1.poll();
            return ;
        } else {
            while(queue2.size()>1) {
                queue1.offer(queue2.peek());
                queue2.poll();
            }
            queue2.poll();
            return;
        }
    }

    // Get the top element.
    public int top() {
        if(queue2.isEmpty()) {
            while(queue1.size()>1) {
                queue2.offer(queue1.peek());
                queue1.poll();
            }
            int ret = queue1.peek();
            queue2.offer(queue1.peek());
            queue1.poll();
            return ret;
            
        } else {
            while(queue2.size()>1) {
                queue1.offer(queue2.peek());
                queue2.poll();
            }
            int ret = queue2.peek();
            queue1.offer(queue2.peek());
            queue2.poll();
            return ret;
        }
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return (queue1.isEmpty() && queue2.isEmpty());
    }
}

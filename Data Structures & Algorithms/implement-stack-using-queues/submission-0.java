class LinkedNode {
    LinkedNode prev;
    LinkedNode after;
    int val;

    public LinkedNode() {
    }
    public LinkedNode(int value) {
        this.val = value;
    }
    
}

class MyStack {
    LinkedNode tail;
    LinkedNode head;
    public MyStack() {
        head = tail = new LinkedNode();
    } 
    
    public void push(int x) {
        LinkedNode node = new LinkedNode(x);
        tail.after = node;
        node.prev = tail;
        tail = node;
    }
    
    public int pop() {
        int val = tail.val;
        tail = tail.prev;
        tail.after = null;
        return val;
    }

    public int top() {
        return tail.val;
    }
    
    public boolean empty() {
        return head == tail;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
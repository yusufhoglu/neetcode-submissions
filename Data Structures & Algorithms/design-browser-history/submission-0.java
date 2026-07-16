class LinkedNode {
    String val;
    LinkedNode prev, after;

    public LinkedNode(String val, LinkedNode prev) {
        this.val = val;
        this.prev = prev;
        this.after = after;
    }
}

class BrowserHistory {
    public LinkedNode curr;

    public BrowserHistory(String homepage) {
        curr = new LinkedNode(homepage, null);

    }
    
    public void visit(String url) {
        curr.after = new LinkedNode(url, curr);
        curr = curr.after;
    }
    
    public String back(int steps) {
        while(curr.prev != null && steps > 0) {
            curr = curr.prev;
            steps--;
        }
        return curr.val;
    }
    
    public String forward(int steps) {
        while(curr.after != null && steps > 0) {
            curr = curr.after;
            steps--;
        }
        return curr.val;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
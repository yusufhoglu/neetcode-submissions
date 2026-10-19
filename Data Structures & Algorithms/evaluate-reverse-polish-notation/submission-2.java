class Solution {
    public int evalRPN(String[] tokens) {
        // create queue
        Deque<Integer> queue = new ArrayDeque<>();
        // put each not operand to queue
        int result = 0;
        // continue until the end of the array
        for (String s: tokens) {
            // yusuf::warn: what if the String arr starts with operand
            if (s.equals("+")) {
                int b = queue.pop();
                int a = queue.pop();
                queue.push(a + b);
            } else if (s.equals("-")) {
                int b = queue.pop();
                int a = queue.pop();
                queue.push(a - b);
            } else if(s.equals("/")) {
                int b = queue.pop();
                int a = queue.pop();
                queue.push(a / b);
            } else if(s.equals("*")) {
                int b = queue.pop();
                int a = queue.pop();
                queue.push(a * b);
            } else {
                queue.push(Integer.valueOf(s));
            }
        }
        return queue.pop();
    }
}
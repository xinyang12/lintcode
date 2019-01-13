public class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public MyQueue() {
        // do intialization if necessary
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    /*
     * @param element: An integer
     * @return: nothing
     */
    public void push(int element) {
        // write your code here
        stack1.push(element);
    }

    /*
     * @return: An integer
     */
    public int pop() {
        // write your code here
        while (!stack1.isEmpty()) {
            int element = stack1.pop();
            stack2.push(element);
        }
        
        int top = stack2.pop();
        
        while (!stack2.isEmpty()) {
            int element = stack2.pop();
            stack1.push(element);
        }
        
        return top;
    }

    /*
     * @return: An integer
     */
    public int top() {
        // write your code here
        while (!stack1.isEmpty()) {
            int element = stack1.pop();
            stack2.push(element);
        }

        int top = stack2.peek();

        while (!stack2.isEmpty()) {
            int element = stack2.pop();
            stack1.push(element);
        }

        return top;
    }
}
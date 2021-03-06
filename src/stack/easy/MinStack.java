package stack.easy;

/**
 * Problem: 155. Min Stack
 * Difficulty: Easy
 * Link: https://leetcode.com/problemsmin-stack
 */
class MinStack {

    Integer[] minStack;
    Integer[] stack;
    int top;
    int min;

    public MinStack() {
        minStack = new Integer[3 * (int) Math.pow(10, 4)];
        stack = new Integer[3 * (int) Math.pow(10, 4)];
        top = 0;
        min = 0;
    }

    public void push(int val) {
        stack[top++] = val;
        if (min == 0 || val <= minStack[min - 1])
            minStack[min++] = val;
    }

    public void pop() {
        if (stack[top - 1].intValue() == minStack[min - 1].intValue())
            minStack[min-- - 1] = null;
        stack[top-- - 1] = null;
    }

    public int top() {
        return stack[top - 1];
    }

    public int getMin() {
        return minStack[min - 1];
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
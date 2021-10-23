import java.util.Stack;

public class MyQueue {
    public static void main(String[] args) {

    }
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>(); // 负责进栈
        stack2 = new Stack<>(); // 负责出栈

    }
    // 将一个元素放入队列的尾部。
    public void push(int x) {

        stack1.push(x);
    }

    // 从队列首部移除元素。
    public int pop() {
        return stack2.pop();
    }

    //返回队列首部的元素。
    public int peek() {
        return stack2.peek();

    }

    // 返回队列是否为空。
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();

    }

    //如果stack2为空，那么stack1中的元素全部放到stack2中
    private void dumpStack1(){
        if (stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
    }
}

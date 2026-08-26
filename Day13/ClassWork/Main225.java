import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);

        int size = q.size();

        for (int i = 0; i < size - 1; i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}

public class  Main225{
    public static void main(String[] args) {

        MyStack obj = new MyStack();

        obj.push(1);
        obj.push(2);
        obj.push(3);

        System.out.println(obj.top());   // 3
        System.out.println(obj.pop());   // 3
        System.out.println(obj.top());   // 2
        System.out.println(obj.empty()); // false
    }
}
package classwork.collections;


import java.util.Stack;

/**
 * Պետք է ստեղծել Queue ֆունկցիոնալ։
 * Stack - LIFO
 * Queue - FIFO
 */
public class QueueStack<T> {
    private Stack<T> stack1 = new Stack<>();
    private Stack<T> stack2 = new Stack<>();

    /**
     * Ավելացնել էլեմենտ
     */
    public void add(T t) {
        stack1.push(t);
    }

    /**
     * Վերցնել առաջին էլեմենտը՝ ջնջելով այն
     */
    public T poll() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

    /**
     * Վերցնել առաջին էլեմենտը՝ առանց այն ջնջելու
     */
    public T peek() {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.peek();
    }

    public int size() {
        return stack1.size() + stack2.size();
    }
}

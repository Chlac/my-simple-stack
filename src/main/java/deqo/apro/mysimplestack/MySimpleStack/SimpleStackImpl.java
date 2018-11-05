package deqo.apro.mysimplestack.MySimpleStack;

import java.util.Stack;

/**
 * This has nothing to do with issue 2
 */

public class SimpleStackImpl implements SimpleStack {

    Stack<Object> stack = new Stack<Object>();

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int getSize() {
        return stack.size();
    }

    @Override
    public void push(Item item) {
        stack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return (Item) stack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item) stack.pop();
    }
}

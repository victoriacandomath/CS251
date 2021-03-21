/** Victoria Varela
 * victoriia25@unm.edu
 * Submitted: 3/9/2021
 * Creates a "stack" class using
 * LinkedList to be used in the postfix calculator.
 * Versatile stack to easily remove and add items.
 */

import java.util.LinkedList;

public class DoubleStack implements Stack<Double> {

    LinkedList<Double> stack = new LinkedList<>();

    /**
     * Determines if the stack is empty
     * @return true if empty, false if not
     */
    public boolean isEmpty() {
        if(stack.isEmpty()) {
            return true;
        }
        return false;
    }

    /**
     * Puts the arg on the stack
     * @param val operand put on the stack
     */
    public void push(Double val) {
        stack.push(val);
    }

    /**
     * Removes the first item on the list
     * @return value removed
     */
    public Double pop() {
        return stack.pop();
    }

    /**
     * Looks at the top or first element of the list
     * @return first element of list
     */
    public Double peek() {
        return stack.peek();
    }
}

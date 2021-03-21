/** Victoria Varela
 * victoriia25@unm.edu
 * Submitted: 3/9/2021
 * Calculator that evaluates postfix
 * expressions using maps, lists, and stacks.
 */

import java.util.*;

public class PostfixCalculator {

    private DoubleStack stack;
    private Map<String, Operator> opsMap;

    public static void main(String[] args) {

    }

    /**
     * Constructor puts all the operators
     * into a HashMap and creates our stack
     */
    public PostfixCalculator() {
        opsMap = new HashMap<String, Operator>();
        opsMap.put("+", new Addition());
        opsMap.put("add", new Addition());
        opsMap.put("-", new Subtraction());
        opsMap.put("sub", new Subtraction());
        opsMap.put("*", new Multiplication());
        opsMap.put("mult", new Multiplication());
        opsMap.put("/", new Division());
        opsMap.put("div", new Division());
        opsMap.put("=", new Print());
        opsMap.put("print", new Print());
        stack = new DoubleStack();
    }

    /**
     * Stores a number in the expression on the stack
     * @param operand the input number
     */
    public void storeOperand(double operand) {
        stack.push(operand);
    }

    /**
     * Determines which operator class
     * to ust to evaluate the expression
     * @param operator scanner detects an input that is not a number
     *                 and points to the correct class for evaluation
     */
    public void evalOperator(String operator) {
        List<Double> operandList = new ArrayList<>();
        Operator ops;
        int pop;
        ops = opsMap.get(operator);
        pop = ops.numArgs();
        for(int i = 0; i < pop; i++) {
            double j = stack.pop();
            operandList.add(j);
        }
        double result = ops.eval(operandList);
        stack.push(result);
    }

    public static class Addition implements Operator {

        /**
         * The number of arguments needed to evaluate
         * the expression
         * @return the number of arguments
         */
        public int numArgs() {
            return 2;
        }

        /**
         * Uses the list to add the two arguments together
         * @param args Argument list.
         * @return the result of the addition
         */
        public double eval(List<Double> args) {
            double result = 0;
            result = args.get(0) + args.get(1);
            return result;
        }
    }

    public static class Subtraction implements Operator {

        /**
         * The number of arguments needed to evaluate
         * the expression
         * @return the number of arguments
         */
        public int numArgs() {
            return 2;
        }

        /**
         * Uses list to subtract the first arg from the
         * second arg
         * @param args Argument list.
         * @return the result of the subtraction
         */
        public double eval(List<Double> args) {
            double result = 0;
            result =  args.get(1) - args.get(0);
            return result;
        }
    }

    public static class Multiplication implements Operator {

        /**
         * The number of arguments needed to evaluate
         * the expression
         * @return the number of arguments
         */
        public int numArgs() {
            return 2;
        }

        /**
         * Multiplies the two args together
         * @param args Argument list.
         * @ the result of the multiplication
         */
        public double eval(List<Double> args) {
            double result = 0;
            result =  args.get(0)*args.get(1);
            return result;
        }
    }

    public static class Division implements Operator {

        /**
         * The number of arguments needed to evaluate
         * the expression
         * @return the number of arguments
         */
        public int numArgs() {
            return 2;
        }

        /**
         * Divides the second term by the first term
         * @param args Argument list.
         * @return the result of division
         */
        public double eval(List<Double> args) {
            double result;
            result = args.get(1) / args.get(0);
            return result;
        }
    }

    public static class Print implements Operator {

        /**
         * The number of arguments needed to evaluate
         * the expression
         * @return the number of arguments
         */
        public int numArgs() {
            return 1;
        }

        /**
         * Prints the result of the calculator
         * @param args Argument list.
         * @return the first term of the new list
         * which is the final result of the calculation
         */
        public double eval(List<Double> args) {
            System.out.println(args);
            return args.get(0);
        }
    }

}

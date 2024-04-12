package main.java.CalculatorConundrum;

public class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        try {
            if (operation == null) {

                throw new IllegalArgumentException("Operation cannot be null");
            }

            if (operation.isEmpty()) {

                throw new IllegalArgumentException("Operation cannot be empty");
            }
            switch (operation) {
                case "+" -> {
                    return operand1 + " + " + operand2 + " = " + (operand1 + operand2);
                }
                case "*" -> {
                    return operand1 + " * " + operand2 + " = " + (operand1 * operand2);
                }
                case "/" -> {
                    return operand1 + " / " + operand2 + " = " + (operand1 / operand2);
                }
                default -> {
                    if (operation == null)
                        throw new IllegalArgumentException("Operation cannot be null");
                    else if(operation.isEmpty())
                        throw new IllegalArgumentException("Operation cannot be empty");
                    else
                        throw new IllegalOperationException("Operation '" + operation + "' does not exist");
                }
            }
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
    }
}

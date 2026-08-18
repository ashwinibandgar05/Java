/**
 * Represents a simple calculator for math operations.
 * @author Your Name
 */
public class Calculator {

    /**
     * Divides two numbers safely.
     * 
     * @param a The top number (numerator)
     * @param b The bottom number (denominator)
     * @return The final divided result as a double
     * @throws ArithmeticException If you try to divide by zero
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }
}

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class SimpleCalculatorTest {
    @Test
    public void testAdd() {
        // Arrange
        SimpleCalculator calculator = new SimpleCalculator();
        int a = 10;
        int b = 20;
        int expectedResult = 30;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(expectedResult, result); // Use Assertions.assertEquals
    }
    @Test
    public void testSubtract() {
        // Arrange
        SimpleCalculator calculator = new SimpleCalculator();
        int a = 30;
        int b = 20;
        int expectedResult = 10;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(expectedResult, result);
    }
    @Test
    public void testMultiply() {
        // Arrange
        SimpleCalculator calculator = new SimpleCalculator();
        int a = 10;
        int b = 20;
        int expectedResult = 200;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(expectedResult, result);
    }
    @Test
    public void testDivide() {
        // Arrange
        SimpleCalculator calculator = new SimpleCalculator();
        int a = 100;
        int b = 20;
        int expectedResult = 5;

        // Act
        double result = calculator.divide(a, b);

        // Assert
        assertEquals(expectedResult, result);
    }
    @Test
    public void testDivideByZero() {
        // Arrange
        SimpleCalculator calculator = new SimpleCalculator();
        int a = 10;
        int b = 0;

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(a, b));
    }
}
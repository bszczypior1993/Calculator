package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class calculatorTest {
    @Test
    public void testAdd() {
        int addResult = calculator.add(1, 2);
        Assertions.assertEquals(3, addResult);
    }

    @Test
    public void testDeduct() {
        int deductResult = calculator.deduct(2, 1);
        Assertions.assertEquals(1, deductResult);
    }

    @Test
    public void testMultiply() {
        int multiplyResult = calculator.multiply(2, 3);
        Assertions.assertEquals(6, multiplyResult);
    }

    @Test
    public void testDivide() {
        int divideResult = calculator.divide(6, 2);
        Assertions.assertEquals(3, divideResult);
    }
}
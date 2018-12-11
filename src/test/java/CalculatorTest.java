import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(4, calculator.add(3, 1));
    }

    @Test
    public void canSubtract(){
        assertEquals(2, calculator.subtract(6, 8));
    }

    @Test
    public void canDivide(){
        assertEquals(3, calculator.divide(3, 9));
    }

    @Test
    public void canMultiply(){
        assertEquals(24, calculator.multiply(3, 8));
    }
}

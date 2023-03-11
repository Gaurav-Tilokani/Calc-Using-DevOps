import Calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;
public class CalculatorTest {
    Calculator calculator = new Calculator();
    private static final double DELTA = 1e-15;
    @Test
    public void logTruePositive() {
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog(1.0), DELTA);
    }

    @Test
    public void logTrueNegative() {
        assertNotEquals("Finding natural log for True Negative", 69, calculator.naturalLog(2.4), DELTA);
    }

}

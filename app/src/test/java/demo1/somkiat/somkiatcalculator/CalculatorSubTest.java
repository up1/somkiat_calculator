package demo1.somkiat.somkiatcalculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorSubTest {

    private double firstOperand;
    private double secondOperand;
    private double expectedResult;

    @Test
    public void sub() {
        Calculator calculator = new Calculator();
        String message = String.format("%f - %f", firstOperand, secondOperand);
        assertEquals(message, this.expectedResult,
                calculator.sub(this.firstOperand, this.secondOperand));
    }

    public CalculatorSubTest(double firstOperand, double secondOperand, double expectedResult) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.expectedResult = expectedResult;
    }

    @Parameters
    public static List<Object[]> xxx() {
        return Arrays.asList(new Object[][] {
                {1, 1, 0.0},
                {2, 1, 1.0},
                {2, 3, -1.0},
                {10, 3, 7.0},
        });
    }



}

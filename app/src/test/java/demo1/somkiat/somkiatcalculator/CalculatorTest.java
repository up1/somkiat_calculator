package demo1.somkiat.somkiatcalculator;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void หนึ่งบวกหนึ่งเท่ากับสอง() {
        assertEquals(2.0, calculator.addplus(1, 1));
    }

    @Test
    public void ลบ() {
        assertEquals(0.0, calculator.sub(1, 1));
        assertEquals(1.0, calculator.sub(2, 1));
        assertEquals(-1.0, calculator.sub(2, 3));
    }


    @Test
    public void สองคูณหนึ่งเท่ากับสอง() {
        //Act
        double actualResult = calculator.mul(2, 1);
        //Assert
        assertEquals(2.0, actualResult);
    }

    @Test
    public void สองหารหนึ่งเท่ากับสอง() {
        //Act
        double actualResult = calculator.divide(2, 1);
        //Assert
        assertEquals(2.0, actualResult);
    }

    @Test(expected = DivideByZeroException.class)
    public void สองหารศูนย์จะเกิดข้อผิดพลาด_DivideByZeroException() {
        //Act
        calculator.divide(2, 0);
    }

    @Test
    public void สองหารศูนย์จะเกิดข้อผิดพลาด2_DivideByZeroException() {
        //Act
        try {
            calculator.divide(2, 0);
            fail("มึงบ้าหรือเปล่า !!!");
        }catch (DivideByZeroException e) {

        }
    }

}
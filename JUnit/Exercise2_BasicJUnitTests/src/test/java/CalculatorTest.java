import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calc = new Calculator();


    @Test
    public void testAdd() {

        assertEquals(

                10,

                calc.add(5,5)

        );

    }


    @Test
    public void testSubtract() {

        assertEquals(

                2,

                calc.subtract(5,3)

        );

    }

}
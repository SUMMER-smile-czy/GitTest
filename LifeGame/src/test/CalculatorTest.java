package test;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
* Calculator Tester.
*
* @author <Authors name>
* @since <pre>ʮ�� 13, 2017</pre>
* @version 1.0
*/
public class CalculatorTest {





private static Calculator calculator =new Calculator();

    @Before
    public void setUp() throws Exception {
        calculator.clear();
        System.out.print("hhhhhhhhhhh");
    }
    @After
    public void tearDown() throws Exception {
    }
    @Test(timeout=1000)
    public void testAdd() {
        calculator.add(2);
        calculator.add(3);
        //org.junit.Assert.assertEquals(5, calculator.getResult());
    }
    @Test
    public void testSubstract() {
        calculator.add(10);
        calculator.substract(2);
        org.junit.Assert.assertEquals(8,calculator.getResult());
    }
    @Ignore("Multiply() Not yet implemented")//忽略Multiple
    @Test
    public void testMultiply() {
    }
    @Test(expected =ArithmeticException.class)
    public void testDivide() {
        calculator.add(8);
        calculator.divide(0);
        org.junit.Assert.assertEquals(4,calculator.getResult());
    }



}

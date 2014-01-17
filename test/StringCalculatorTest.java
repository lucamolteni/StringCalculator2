import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class StringCalculatorTest {

    private StringCalculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new StringCalculator();
    }

    @Test
    public void onEmptyStringShouldReturnZero() {
        assertEquals(0, calculator.calculate(""));
    }

    @Test
    public void onASingleNumberShouldReturnItsValue() {
        assertEquals(2, calculator.calculate("2"));
    }

    @Test
    public void onASingleNumberShouldReturnItsValue2() {
        assertEquals(3, calculator.calculate("3"));
    }

    @Test
    public void onTwoNumbersShouldAddTheirValuesWhenSeparatedByComma() {
        assertEquals(2, calculator.calculate("2,0"));
    }

    @Test
    public void onTwoNumbersShouldAddTheirValuesWhenSeparatedByComma2() {
        assertEquals(5, calculator.calculate("5,0"));
    }

    @Test
    public void onTwoNumbersShouldAddTheirValuesWhenSeparatedByComma3() {
        assertEquals(10, calculator.calculate("10,0"));
    }

    @Test
    public void onTwoNumbersShouldAddTheirValuesWhenSeparatedByComma4() {
        assertEquals(100, calculator.calculate("100,0"));
    }

    @Test
    public void onTwoNumbersShouldAddTheirValuesWhenSeparatedByComma5() {
        assertEquals(12, calculator.calculate("10,2"));
    }

    @Test
    public void onThreeNumbersShouldAddTheirValuesWhenSeparatedByComma() {
        assertEquals(15, calculator.calculate("10,2,3"));
    }
    @Test
    public void onFourNumbersShouldAddTheirValuesWhenSeparatedByComma() {
        assertEquals(20, calculator.calculate("10,2,3,5"));
    }


}

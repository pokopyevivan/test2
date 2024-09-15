package test;

import main.FactorialCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {

    @Test
    public void testFactorialPositiveNumber() {
        Assert.assertEquals(FactorialCalculator.factorial(5), 120, "Факториал 5 должен быть 120");
        Assert.assertEquals(FactorialCalculator.factorial(0), 1, "Факториал 0 должен быть 1");
        Assert.assertEquals(FactorialCalculator.factorial(1), 1, "Факториал 1 должен быть 1");
    }

    @Test
    public void testFactorialLargeNumber() {
        Assert.assertEquals(FactorialCalculator.factorial(10), 3628800, "Факториал 10 должен быть 3628800");
    }
}
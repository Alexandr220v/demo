import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {


    @Test
    public void verifySumFirstPositiveAndSecondPositive() {
        Calculator demo = new Calculator();
        Assert.assertEquals(9,demo.calculateDiffOfIntegers(10,1));
    }

    @Test
    public void verifyMultiplicationOfFirstPositiveAndSecondPositive() {
        Calculator demo = new Calculator();
        Assert.assertEquals(6,demo.calculateMultiplyOfIntegers(3,2));
    }
}

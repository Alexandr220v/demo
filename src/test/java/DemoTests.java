import org.junit.Assert;
import org.junit.Test;

public class DemoTests {


    @Test
    public void verifySumFirstPositiveAndSecondPositive() {
        Demo demo = new Demo();
        Assert.assertEquals(9,demo.calculateDiffOfIntegers(10,1));
    }
}

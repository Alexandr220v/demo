import java.util.List;

public class Demo {


    public int calculateSumOfIntegers(int a, int b) {

        return a + b;

    }

    public int calculateDiffOfIntegers(int a, int b) {

        return a - b;

    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        int diff = demo.calculateDiffOfIntegers(4,5);
        System.out.println(diff);

    }
}

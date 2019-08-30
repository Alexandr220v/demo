public class Calculator {


    public int calculateSumOfIntegers(int a, int b) {

        return a + b;

    }

    public int calculateDiffOfIntegers(int a, int b) {

        return a - b;

    }

     public int calculateMultiplyOfIntegers(int a, int b) {

        return a * b;

    }

    public static void main(String[] args) {
        Calculator demo = new Calculator();
        int diff = demo.calculateDiffOfIntegers(4,5);
        int multipy = demo.calculateMultiplyOfIntegers(1,2);
        System.out.println(multipy);

    }
}

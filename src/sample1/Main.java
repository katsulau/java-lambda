package sample1;

public class Main {
    public static void main(String[] args) {
        CalculatorInterface multiplyCalculator = new MultiplyCalculator();

        int result = multiplyCalculator.calculate(2, 5);

        System.out.println(result);
    }
}

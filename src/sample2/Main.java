package sample2;

public class Main {
    public static void main(String[] args) {
        CalculatorInterface calculatorInterface = new CalculatorInterface() {
            @Override
            public int calculate(int a, int b) {
                return a * b;
            }
        };

        int result = calculatorInterface.calculate(2, 5);

        System.out.println(result);
    }
}

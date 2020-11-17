package sample3;

public class Main {
    public static void main(String[] args) {
        CalculatorInterface calculatorInterface = (a, b) -> {return a * b;};

        int result = calculatorInterface.calculate(2, 5);

        System.out.println(result);
    }
}

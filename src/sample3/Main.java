package sample3;

public class Main {
    public static void main(String[] args) {
        CalculatorInterface calculatorInterface = (a, b) -> {return a * b;};

        int result = calculatorInterface.calculate(2, 5);

        // returnだけなら、{}も省略できます
        CalculatorInterface calculatorInterface2 = (a, b) -> a * b;

        int result2 = calculatorInterface2.calculate(3, 4);

        System.out.println(result);
        System.out.println(result2);
    }
}

import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) {
        Double A = a;
        Double B = b;
        double Answer = A+B;
        return Answer;
    }

    public static double subtract(double a, double b) {
        return a-b;
    }

    public static double multiply(double a, double b) {
        return a*b;
    }

    public static double divide(double a, double b) {
        return a/b;
    }

    public static double power(double a, double b){
        double answer =a;

        for (int x=2; x<=b; x++){
            answer *= a;
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double answer = 0;
        double inputA, inputB;
        char operator;
        boolean done = false;

        while (done == false) {
            System.out.print("Введите выражение: ");

            inputA = input.nextDouble();
            operator = input.next().charAt(0);
            inputB = input.nextDouble();

            switch (operator) {
                case '+': answer = add(inputA, inputB);
                    break;
                case '-': answer = subtract(inputA, inputB);
                    break;
                case '*': answer = multiply(inputA, inputB);
                    break;
                case '/': answer = divide(inputA, inputB);
                    break;
                case '^': answer = power(inputA, inputB);
                    break;
            }

            System.out.println(answer);
        }

        input.close();

    }

}
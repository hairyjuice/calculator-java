package Calculator;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args){
        
        System.out.print("\033[H\033[2J");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Equation?");

        String equation = scanner.next();

        String[] numbers = equation.split("[+x/\\-]", 2);

        double firstNumber = Double.valueOf(numbers[0]);

        double secondNumber = Double.valueOf(numbers[1]);

        System.out.print("\033[H\033[2J");

        if (equation.contains("+")) {
            System.out.print(firstNumber + " + " + secondNumber + " = " + (int) add(firstNumber, secondNumber));
        } else if (equation.contains("-")) {
            System.out.print(firstNumber + " - " + secondNumber + " = " + (int) subtract(firstNumber, secondNumber));
        } else if (equation.contains("x")) {
            System.out.print(firstNumber + " x " + secondNumber + " = " + (int) multiply(firstNumber, secondNumber));
        } else if (equation.contains("/")) {
            if (secondNumber == 0) {
                System.out.print("Can't divide by 0");
            } else {
                System.out.print(firstNumber + " / " + secondNumber + " = " + divide(firstNumber, secondNumber));
            }
        }

        scanner.close();

    }
    public static double add(double num1, double num2) {
        double answer = num1 + num2;
        return answer;
    }
    public static double subtract(double num1, double num2) {
        double answer = num1 - num2;
        return answer;
    }
    public static double multiply(double num1, double num2) {
        double answer = num1 * num2;
        return answer;
    }
    public static double divide(double num1, double num2) {
        double answer = num1 / num2;
        return answer;
    }
}

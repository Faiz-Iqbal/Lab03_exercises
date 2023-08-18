import java.util.*;

public class Exercise4 {

    public static void main(String[] args) {
        String operator;
        Double operand1, operand2, result;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Select an operator: +, -, *, / ");
        operator = keyboard.nextLine();

        System.out.print("Enter number 1: ");
        operand1 = keyboard.nextDouble();

        System.out.print("Enter number 2: ");
        operand2 = keyboard.nextDouble();

        switch (operator) {
            case "+":
                result = operand1 + operand2;
                System.out.print(operand1 + "+" + operand2 + " = " + result);
                break;
            case "-":
                result = operand1 - operand2;
                System.out.print(operand1 + "-" + operand2 + " = " + result);
                break;
            case "*":
                result = operand1 * operand2;
                System.out.print(operand1 + "*" + operand2 + " = " + result);
                break;
            case "/":
                result = operand1 / operand2;
                System.out.print(operand1 + "/" + operand2 + " = " + result);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }

        keyboard.close();
    }
}

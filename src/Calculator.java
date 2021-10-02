import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First Number : ");

        int x;
        try {
            x = input.nextInt(); // Records The User Input Which Puts it Into The X Value.
        } catch (InputMismatchException e) { // It checks if the user puts a correct integer which if they didn't then it will print a statement telling them to type it again till the user puts a correct integer.
            System.out.println("You have entered a wrong number, please restart and retry.");
            return;
        }



        System.out.print("Enter Your Second Number : ");
        int y;

        try {
            y = input.nextInt(); // Records The User Input Which Puts it Into The Y Value.
        } catch (InputMismatchException e) {
            System.out.println("You have entered a wrong number, please restart and retry.");
            return;
        }

        System.out.print("Enter Your Expression : ");
        String expression = input.next();
        int total;
        switch (expression) { // It Switches Between 4 of the value +, -, *, and /. Depending on what the user puts it will go through one of the four cases then break once the output is completed. If the program deems that the input didn't match one of the four value then it would go to default which prints a statement.
            case "+":
                total = x + y;
                System.out.println("Total: " + total);
                break;
            case "-":
                total = x - y;
                System.out.println("Total: " + total);
                break;
            case "*":
                total = x * y;
                System.out.println("Total: " + total);
                break;
            case "/":
                total = x / y;
                System.out.println("Total: " + total);
                break;
            default:
                System.out.println("You have entered the wrong expression, please use either. +, -, *, or /");
                break;
        }




    }

}
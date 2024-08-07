package Decision_Making_Statement;

import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continueCalculation = 'y';

        while (continueCalculation == 'y' || continueCalculation == 'Y') {
            System.out.println("Enter your first Number ");
            float a = sc.nextFloat();

            System.out.println("Enter your operator (+ , - , / , *): ");
            char c = sc.next().charAt(0);

            System.out.println("Enter your second Number ");
            float b = sc.nextFloat();

            float result = 0;

            switch (c) {
                case '+':
                    result = a + b;
                    break;

                case '-':
                    result = a - b;
                    break;

                case '*':
                    result = a * b;
                    break;

                case '/':
                    if (b != 0) {
                        result = a / b;
                    } else {
                        System.out.println("Can't divide by zero");
                        continue; // Skip the rest of the loop and ask for input again
                    }
                    break;

                default:
                    System.out.println("Error: Invalid operator");
                    continue; // Skip the rest of the loop and ask for input again
            }

            System.out.println("The result is: " + result);

            System.out.println("Do you want to calculate again? (y/n): ");
            continueCalculation = sc.next().charAt(0);
        }

        System.out.println("Goodbye!");
    }
}

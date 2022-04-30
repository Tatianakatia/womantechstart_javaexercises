// *****Program: "Junior Software Developer Accelerate Program" *****
//      Version1 TechStart program
//      SkillNett Women Tech Start
// Training:
//      WorkJuggle and C2 : Technical and Professional Skills program
//
// Class: Introduction to Java
// Instructor: Martina Yusuf
// Developer: Tatiana Katia❤⛵

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // This method is used for Input information by users
        Scanner scanner = new Scanner(System.in);

        // Task 3 - Calculator Done✔ ❤⛵
        // 1 Create a new project called Calculator.
        // 2 Within the body of the main method ask the user for two numbers.
        // 3 Ask the user for an operator.
        // 4 Considering the user’s chosen operator, perform the correct mathematical operation on the supplied numbers.
        // 5 Make sure the user knows if they input an invalid operator.
        // 6 Print out the result.

        System.out.println("***** Let's go... Calculator numbers *****");
        int number1, number2, choice;
        System.out.println("Insert the first number: ");
        number1 = scanner.nextInt();
        System.out.println("Insert the first number: ");
        number2 = scanner.nextInt();
        System.out.print("\n1: Addition.\n2: Subtraction.");
        System.out.print("\n3: Multiplication.\n4: Divide.");
        System.out.print("\nEnter your choice: ");
        choice = scanner.nextInt();

        float result = 0;
        switch (choice) {
            case 1 -> result = (number1 + number2);
            case 2 -> result = (number1 - number2);
            case 3 -> result = (number1 * number2);
            case 4 -> result = (float) number1 / (float) number2;
            default -> System.out.println(" Please, Invalid choice!");
        }
        if (choice >= 1 && choice <= 5)
            System.out.println("Result is: " + result);


    }



}


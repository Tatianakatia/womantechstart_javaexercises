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

//        // 05 - Introduction to Java - Exercise 9
//        // Task 1 - if statement
//        //      item 1 Create a new project called Conditionals. Done✔ ❤⛵
//        //      item 2 Write your code within the main method. Done✔ ❤⛵
//
//        // item 3 Ask the user for two numbers and print the bigger one. Done✔ ❤⛵
//        // Ask the user for twe different numbers and print out the number is bigger.
//        // Create a code for check which number is bigger. Using if/else
//        System.out.println("*****Let's go calculate the numbers****");
//        System.out.println("Insert the first number: ");
//        // This method permit users insert numbers
//        int first = scanner.nextInt();
//
//        System.out.println("Insert the second number: ");
//        // This method permit users insert numbers
//        int second = scanner.nextInt();
//
//        if (first > second) {
//            System.out.println("Result " + first + " First is bigger than second ");
//        }else  {
//            System.out.println("Result: " + second + " Second is bigger than first");
//
//        }
//
//        // item 4 Ask the user for another number and print out if it’s odd or event. Done✔ ❤⛵
//        // Ask the user for another number and print out if it’s odd or event.
//        // Create a code for check odd or event. Using if/else
//        System.out.println("Insert the another number: ");
//        // This method permit users insert numbers
//        int third = scanner.nextInt();
//
//        if(third % 2 == 0){
//            System.out.println(third + "  is even");
//        } else {
//            System.out.println(third + "  is odd");
//        }
//
//        // item 5 Ask the user for a traffic light colour and print the corresponding Done✔ ❤⛵
//        // instruction: i.e. green means go, red means stop.
//        // Create a code for Traffic Light Colour Green or Red. Using if/else
//        System.out.println("*****Traffic Light****");
//        System.out.println("Digit Green or Red: ");
//        // This method permit users insert strings
//        String colour = scanner.nextLine();
//
//        if(colour.equalsIgnoreCase("green")){
//            System.out.println("You choice the colour " + colour + " => Well done ==>> ... GO");
//        } else if (colour.equalsIgnoreCase("red")){
//            System.out.println("You choice the colour " + colour + " => Please ❌❌❌... STOP");
//        } else {
//            System.out.println("Sorry, try again... You need choice Green or Red");
//        }

        // Task 2 - switch
        // 1 Comment out the previous code. Done✔ ❤⛵

        // 2 Ask the user for a number between 1 and 12. Done✔ ❤⛵

//        System.out.println("***** Insert Numbers about Months of the Year *****");
        // This method permit users insert numbers
//        int month = scanner.nextInt();
//
//            switch (month) {
//                case 1:
//                    System.out.println("It's January!");
//                    break;
//                case 2:
//                    System.out.println("It's February!");
//                    break;
//                case 3:
//                    System.out.println("It's March!");
//                    break;
//                case 4:
//                    System.out.println("It's April!");
//                    break;
//                case 5:
//                    System.out.println("It's May! ");
//                    break;
//                case 6:
//                    System.out.println("It's June!");
//                    break;
//                case 7:
//                    System.out.println("It's July!");
//                    break;
//                case 8:
//                    System.out.println("It's August!");
//                    break;
//                case 9:
//                    System.out.println("It's September!");
//                    break;
//                case 10:
//                    System.out.println("It's October ");
//                    break;
//                case 11:
//                    System.out.println("It's November ");
//                    break;
//                case 12:
//                    System.out.println("It's December! ");
//                default:
//                    System.out.println("Sorry this is not valid number for months of Year!");
//
//        }
        // 3 Based on the number, print if the corresponding month is in Spring,
        // Summer, Autumn or Winter. Done✔ ❤⛵
        System.out.println("***** Insert Numbers of Season *****");
        // This method permit users insert numbers
        int season = scanner.nextInt();
        switch (season) {
            case 2:
            case 3:
            case 4:
                System.out.println("The season is Spring!");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("The season is Summer!");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("The season is Autumn!");
                break;
            case 11:
            case 12:
            case 1:
                System.out.println("The season is Winter!");
                break;
            default:
                System.out.println("Sorry this is not valid number for months of Year!");

        }
        // 4 Make sure you let the user know if their number choice was invalid.
        // Done✔ ❤⛵

    }
}

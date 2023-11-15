// code is insider the ..code... package (where we should keep all of our software logic)
package code;

/**
 * Using the Requirements specification, I have coded up my interpretation of the program.
 * It is purely a console based application, that hasn't used classes. 
 * 
 * I have coded it in this fashion so I can demonstrate how to take user input from a console, within a void
 * method and how we could test a void method...one that doesn't return a value as this isn't as intuitive as
 * the other examples you would have seen.
 * @author lbkelly0
 *
 */

import java.util.InputMismatchException; // import the InputMismatchException class from the java.util package
import java.util.Scanner; // import the Scanner class from the java.util package to capture user input

public class IsoscelesTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a Scanner object to read user input from the console
        double side1, side2, side3; // declare three double variables to hold the values of the sides of the triangle

        // prompt the user to enter the values of the three sides of the triangle
        System.out.println("Enter the values of three sides of the triangle: ");

        try { // use try-catch block to handle exceptions
            side1 = scanner.nextDouble(); // read the value of the first side from the console
            side2 = scanner.nextDouble(); // read the value of the second side from the console
            side3 = scanner.nextDouble(); // read the value of the third side from the console

            // check whether the input is within the given range and whether the triangle is isosceles
            if ((side1 >= 2 && side1 <= 20) && (side2 >= 2 && side2 <= 20) && (side3 >= 2 && side3 <= 20)) { // check if all sides are within the range [2, 20]
                if (side1 == side2 || side1 == side3 || side2 == side3) { // check if the triangle is isosceles
                    System.out.println("This triangle is Isosceles!"); // if the triangle is isosceles, print a message
                } else {
                    System.out.println("This is an inferior triangle"); // if the triangle is not isosceles, print a message
                }
            } else {
                System.out.println("Please enter valid numeric lengths between 2 and 20."); // if any of the sides is outside the range [2, 20], print a message
            }
        } catch (InputMismatchException e) { // catch an InputMismatchException if the user enters non-numeric values
            System.out.println("Please, use numbers, triangles are measured in numeric lengths.."); // print a message asking the user to enter numeric values
        } finally {
            scanner.close(); // close the Scanner object to release system resources
        }
    }
}


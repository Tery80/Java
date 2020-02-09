package nonOOP;

import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.System.out;

public class QuadraticFormula {
    // user print numbers a, b, c ax^2+bx+c=0 , Console displays x1, x2

    public static void main(String[] args) {
        String numberAString, numberBString, numberCString;
        double numberA, numberB, numberC, discriminant;
        double numberX1, numberX2;

        out.println("The Quadratic Formula: For ax^2 + bx + c = 0.");
        out.println("System displays the values of x1, x2 which are the solutions of the equation");
        out.println("Number a can't be equal to zero");
        out.println("Enter number a =");
        Scanner scanner = new Scanner(System.in);
        numberAString = scanner.next();
        out.println("Enter number b =");
        numberBString = scanner.next();
        out.println("Enter number c =");
        numberCString = scanner.next();
        try {
            numberA = Double.parseDouble(numberAString);
            numberB = Double.parseDouble(numberBString);
            numberC = Double.parseDouble(numberCString);

            if (numberA == 0) {
                out.print("Sorry, but a can't be zero");
            } else                {

                if (numberB == 0) {
                    out.println("Your Quadratic is (" + numberA + ")*x^2+(" + numberC + ") = 0");
                } else if (numberC == 0) {
                    out.println("Your Quadratic is (" + numberA + ")*x^2+(" + numberB + ")*x" + "= 0");
                } else {

                    out.println("Your Quadratic is (" + numberA + ")*x^2+(" + numberB + ")*x+(" + numberC + ") = 0");
                }
                discriminant = (numberB * numberB) - (4.0 * numberA * numberC);
                out.println("Discriminant = " + discriminant);
                if (discriminant == 0) {
                    if (numberB == 0) {
                        numberX1 = 0;
                        out.println("x1 = x2 = " + numberX1);
                    } else {
                        numberX1 = (-numberB) / (2 * numberA);
                        out.println("x1 = x2 = " + numberX1);
                    }
                } else if (discriminant > 0) {
                    numberX1 = (-numberB + sqrt(discriminant)) / (2 * numberA);
                    numberX2 = (-numberB - sqrt(discriminant)) / (2 * numberA);
                    out.println("x1 = " + numberX1);
                    out.println("x2 = " + numberX2);
                } else {
                    out.println("Discriminant = " + discriminant + " so there are no x1, x2 on the set of real numbers");
                }
            }
        } catch (NumberFormatException e) {

            out.println("a, b, c - must be Numbers!");
        }
        scanner.close();
    }

}
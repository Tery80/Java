package nonOOP;

import java.util.Scanner;

public class Summa {
// if First Number< Second Number, then system count Sum= FirstNumber + (FirstNumber+1) +...+ Second Number

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber < secondNumber) {
            int summ = firstNumber;
            // using for cycle

//            for (int i = firstNumber; i <= secondNumber; i++) {
//                summ = summ + i;
//            }
            // using while cycle
            firstNumber++;
            while (firstNumber <= secondNumber){
                summ = summ + firstNumber;
                firstNumber++;
            }
            System.out.println("Summ from the first till the second number incl. is " + summ);
        } else {
            System.out.println("Sorry, but the Second number was equal or bigger to the first");
        }
        scanner.close();

    }
}

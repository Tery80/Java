package nonOOP;

import java.util.Scanner;

public class BiggestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter third number: ");
        int thirdNumber = scanner.nextInt();

        if((firstNumber == secondNumber) && (secondNumber == thirdNumber)) {
            System.out.println("All numbers are equals!");
        }else if((firstNumber == secondNumber)&&(secondNumber > thirdNumber)){
            System.out.println("Numbers the first and the second are equals and bigger then third!");
        }
        else if((thirdNumber == secondNumber)&&(thirdNumber > firstNumber)){
            System.out.println("Numbers the second and the third are equals and bigger then first!");
        }
        else if((thirdNumber == firstNumber)&&(thirdNumber > secondNumber)){
            System.out.println("Numbers the third and the first are equals and bigger then second!");
        }
        else if((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
            System.out.println("The first number is the greatest!");
        } else if((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
            System.out.println("The second number is the greatest!");
        } else {
            System.out.println("The third number is the greatest!");
        }
        scanner.close();
    }

}
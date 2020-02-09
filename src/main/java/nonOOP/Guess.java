package nonOOP;

import java.util.Objects;
import java.util.Scanner;

public class Guess {

    //1. Пользователь загадывает число от 1 до 100.
//2. Программа выводит число. Пользователь отвечает, было ли это число больше,меньше или равно загаданному.
//3. Если число не отгадано, переход к шагу 2.
//
//Возможны 2 реализации:
//1. Программа стремится сделать минимальное число ходов.
//2. Программа делает случайные ходы.
//В любом случае предполагаем, что пользователь не обманывает программу, т.е. если пользователь на число 50 ответил, что загаданное число больше,
// то программа не должна называть числа меньше 51.
    public static void main(String[] args) {
        int guess, minNumber, maxNumber;
        Scanner scanner = new Scanner(System.in);
        String answer;
        System.out.println("Conceive the number from 1 till 100");
        System.out.println("I will try to guess that number");
        System.out.println("use > if your number is bigger");
        System.out.println("use < if your number is smaller");
        System.out.println("use = if I guess your number");
        System.out.print("Press any char when you are ready!");
        scanner.next();
        minNumber = 1;
        maxNumber = 100;
        do {
            guess = (int) Math.floor((minNumber + maxNumber) / 2);
            System.out.println("Your number is " + guess + "?");
            System.out.println();
            answer = scanner.next();
            if ("<".equals(answer)) {
                maxNumber = guess;
            } else if (">".equals(answer)) {
                minNumber = guess;
            }

        } while (!"=".equals(answer));
        scanner.close();
        System.out.println("I guess it! Your number is " + guess);
    }
}
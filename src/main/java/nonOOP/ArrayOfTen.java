package nonOOP;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.out;

public class ArrayOfTen {
/*
1) создать массив целых чисел длиной 10 элементов
2) заполнить массив случайными числами
3) вывести его на консоль
4) найти в массиве наибольшее число и вывести его на консоль
4a) отсортировать массив методом пузырьковой сортировки
5) вывести отсортированный массив на консоль
6) Написать консольную программу, в которой создать отсортированный массив целых чисел и реализовать алгоритм двоичного поиска:
*/

    public static void main(String[] args) {
        int max;
        int[] arrayTen = new int[10];
        int maxNumberRandom = 100;
        int minNumber;
        int maxNumber;
        int lengthArray = 10;
        int change;
        int mediumNumber;
        Random randomGenerator = new Random();

        for (int i = 0; i < lengthArray; i++) {
            arrayTen[i] = randomGenerator.nextInt(maxNumberRandom);

        }
        out.println("Now you will see my array of ten numbers: ");

        for (int i = 0; i < lengthArray; i++) {
            out.print(arrayTen[i] + ";");
        }
        out.println();
        // looking for a biggest number of Array
        max = 0;
        for (int i = 0; i < lengthArray; i++) {
            if (arrayTen[i] > max) {
                max = arrayTen[i];
            }
        }
        out.println("The biggest Number is " + max);

        //buble search and array printout
        for (int n= 1; n < lengthArray; n++){
            for (int i = 1; i < lengthArray; i++) {
                if (arrayTen[i - 1] > arrayTen[i]) {
                    change = arrayTen[i];
                    arrayTen[i] = arrayTen[i - 1];
                    arrayTen[i - 1] = change;
                }
            }
        }
        for (int i = 0; i < lengthArray; i++) {
            out.print(arrayTen[i] + ";");
        }
        out.println();

        // binary search of entered number
        out.print("Enter searching Number from my array: ");
        Scanner scanner = new Scanner(System.in);
        int searchNumber = scanner.nextInt();
        minNumber = 0;
        maxNumber = lengthArray;
        mediumNumber = maxNumber/2;
        while (searchNumber != arrayTen[mediumNumber]){
            if (searchNumber > arrayTen[mediumNumber] ) {
                minNumber = mediumNumber;
            }
            else if (searchNumber < arrayTen[mediumNumber]) {
                maxNumber = mediumNumber;
            }
            mediumNumber = (minNumber+maxNumber)/2;
        }
        scanner.close();
        mediumNumber++;
        out.print("I found that! at array you can find that on " + mediumNumber + "place");
    }

}
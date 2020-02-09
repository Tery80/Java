package nonOOP;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class BiggestTheSameElementLine {
    public static void main(String[] args) {

        int maxNumberRandom = 2;
        int tempCount, tempIndex;
        int point[] = new int[4]; // 0 - amount of Numbers in line, 2 - amount of Numbers in row, 1 - line nr, 3- row nr
        out.println("I will make a random array , and will find the longest line/row in that");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        int lengthArray = scanner.nextInt();
        System.out.print("Enter deep of Array: ");
        int deepArray = scanner.nextInt();

        int[][] array = new int[deepArray][lengthArray];
        Random randomGenerator = new Random();
        for (int j = 0; j < deepArray; j++) {
            for (int i = 0; i < lengthArray; i++) {
                array[j][i] = randomGenerator.nextInt(maxNumberRandom);
            }
        }
        for (int j = 0; j < deepArray; j++) {
            for (int i = 0; i < lengthArray; i++) {
                out.print(array[j][i]);
            }
            out.println();
        }

        // looking for a line
        for (int j = 0; j < deepArray; j++) {
            tempCount = 1;
            for (int i = 0; i < (lengthArray - 1); i++) {
                if ((array[j][i]) == (array[j][i + 1])) {
                    tempCount++;
                    tempIndex = j;
                    if (tempCount > point[0]) {
                        point[0] = tempCount; // amount of numbers in line
                        point[1] = tempIndex; // line number
                    }
                } else {
                    tempCount = 1;
                }
            }
        }
        // looking for a row with max numbers
        tempIndex = 0;
        for (int j = 0; j < lengthArray; j++) {
            tempCount = 1;
            for (int i = 0; i < (deepArray - 1); i++) {
                if (array[i][j] == array[i + 1][j]) {
                    tempCount++;
                    tempIndex = j;
                }
                if (tempCount > point[2]) {
                    point[2] = tempCount; // amount of numbers in row
                    point[3] = tempIndex; // row number
                } else {
                    tempCount = 1;
                }
            }
        }

        if (point[0] > point[2]) {
            out.println("I found max It's line Nr. " + (point[1] + 1) + " with " + point[0] + "in line");
        } else if (point[0] < point[2]) {
            out.println("I found max It's row Nr." + (point[3] + 1) + " with " + point[3] + "in row");
        } else {
            out.println("I found max number in line " + (point[1] + 1) + " is equal to  max numbers in row " + (point[3] + 1) + " and equal to " + point[0] + " in line/row");
        }
        scanner.close();
    }
}
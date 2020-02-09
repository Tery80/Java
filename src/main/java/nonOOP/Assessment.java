package nonOOP;

import java.util.Random;

import static java.lang.System.out;

public class Assessment {
    //    Проанализировать оценки школьников.
//1. Найти максимальную оценку
//2. Найти минимальную оценку
//3. Найти среднюю оценку для всего класса
//4. Найти самую популярную оценку/оценки в классе,
    //    которая встречается чаще всех
//5. Найти самую не популярную оценку/оценки в классе,
//    которая встречается реже всех
//6. Отсортировать оценки по популярности
//            (в начале самые часто встречаемые оценки)
//7. Нарисовать в консоли гистограмму оценок
//    по популярности (ось x - оценки, ось y - количество
//            таких оценок в классе)
//
//    Входные данные для программы это
//    массив случайных чисел от 0 - 10 длиной 30 элементов.
//    В начале программы создать массив и заполнить
//    его случайными числами.

    public static final int ASSESSMENT_AMOUNT = 30;
    public static final int MAX_ASSESSMENT_NUMBER = 11;

    public static int[] assessmentMatrix() {
        Random randomGenerator = new Random();
        int[] matrix = new int[ASSESSMENT_AMOUNT];
        for (int i = 0; i < ASSESSMENT_AMOUNT; i++) {
            matrix[i] = randomGenerator.nextInt(MAX_ASSESSMENT_NUMBER);
        }
        return matrix;
    }

    public static void printMatrix(int[] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            out.print(matrix[i] + ";");
        }
    }

    public static int maxAssessment(int[] assessment) {
        int maxAssassment = 0;
        for (int anAssessment : assessment) {
            if (maxAssassment < anAssessment) {
                maxAssassment = anAssessment;
            }
        }
        return maxAssassment;
    }

    public static int minAssessment(int[] assessment) {
        int minAssassment = 10;
        for (int i = 0; i < assessment.length; i++) {
            if (minAssassment > assessment[i]) {
                minAssassment = assessment[i];
            }
        }
        return minAssassment;
    }

    public static double mediumAssessment(int[] assessment) {
        int summ = 0;
        for (int i = 0; i < assessment.length; i++) {
            summ = summ + assessment[i];
        }
        return (summ / assessment.length);
    }

    public static int mostPopularAssessment(int[] assessment) {
        int count = 1, tempCount;
        int popular = assessment[0];
        int temp;
        for (int i = 0; i < (assessment.length); i++) {
            temp = assessment[i];
            tempCount = 0;
            for (int j = 1; j < assessment.length; j++) {
                if (temp == assessment[j])
                    tempCount++;
            }
            if (tempCount > count) {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;
    }

    public static int[][] calculatedMatrix(int[] assessment) {
        int[][] tempMatrix = new int[2][MAX_ASSESSMENT_NUMBER];

        for (int i = 0; i < MAX_ASSESSMENT_NUMBER; i++) {
            tempMatrix[0][i] = i;
            tempMatrix[1][i] = 0;
        }

        for (int i = 0; i < assessment.length; i++) {
            tempMatrix[1][assessment[i]]++;
        }
        return tempMatrix;
    }

    public static int lessPopularAssessment(int[] assessment) {
        int[][] tempMatrix = calculatedMatrix(assessment);

        int lessPopularAmount = 100;
        int lessPopular = 0;
        for (int i = 0; i < MAX_ASSESSMENT_NUMBER; i++) {
            if (tempMatrix[1][i] > 0) {
                if (lessPopularAmount > tempMatrix[1][i]) {
                    lessPopularAmount = tempMatrix[1][i];
                    lessPopular = i;
                }
            }
        }
        return lessPopular;

    }

    public static int[] sortedByPopular(int[] assessment) {
        int[][] tempMatrix = calculatedMatrix(assessment);
        int[][] temp = new int[1][2];
        for (int j = 0; j < MAX_ASSESSMENT_NUMBER - 1; j++) {
            for (int i = 0; i < MAX_ASSESSMENT_NUMBER - 1; i++) {
                if (tempMatrix[1][i] < tempMatrix[1][i + 1]) {
                    temp[0][0] = tempMatrix[0][i + 1];
                    tempMatrix[0][i + 1] = tempMatrix[0][i];
                    tempMatrix[0][i] = temp[0][0];
                    temp[0][1] = tempMatrix[1][i + 1];
                    tempMatrix[1][i + 1] = tempMatrix[1][i];
                    tempMatrix[1][i] = temp[0][1];
                }
            }
        }
        int[] sorted = new int[assessment.length];
        int count = 0;
        for (int i = 0; i < MAX_ASSESSMENT_NUMBER; i++) {
            for (int j = 0; j < tempMatrix[1][i]; j++) {
                sorted[count] = tempMatrix[0][i];
                count++;
            }

        }
        return sorted;
    }

    public static void printBarChart(int[] assessment) {
        int[][] smallMatrix = calculatedMatrix(assessment);
        int maxOften = maxAssessment(smallMatrix[1]);
        String[][] horisontalMatrix = new String[MAX_ASSESSMENT_NUMBER][maxOften + 1];
        for (int i = 0; i < MAX_ASSESSMENT_NUMBER; i++) {
            horisontalMatrix[i][0] = String.valueOf(i);
            if (smallMatrix[1][i] > 0) {
                for (int j = 1; j < smallMatrix[1][i]; j++) {
                    horisontalMatrix[i][j] = "X";
                }
            }

        }


        for (int i = maxOften; i >= 0; i--) {
            for (int j = 0; j < MAX_ASSESSMENT_NUMBER; j++) {
                if ((horisontalMatrix[j][i])==null) {
                    out.print(" ");

                } else {
                    out.print(horisontalMatrix[j][i]);

                }
            }
            out.println();
        }
    }


    public static void main(String[] args) {
        int[] assessment = assessmentMatrix();
        out.println("I will will analyze your assessment");
        out.println("This is your assessments: ");
        printMatrix(assessment);
        out.println();
        out.println("Maximum assessment is " + maxAssessment(assessment));
        out.println("Minimum assessment is " + minAssessment(assessment));
        out.println("Medium assessment is " + mediumAssessment(assessment));
        out.println("Most popular assessment is " + mostPopularAssessment(assessment));
        out.println("Less popular assessment is " + lessPopularAssessment(assessment));
        out.println("Sorted Matrix:");
        printMatrix(sortedByPopular(assessment));
        out.println();
        out.println("Here will be bar chart of Assessments:");
        out.println();
        printBarChart(assessment);
    }
}
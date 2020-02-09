package nonOOP;

public class ValueAboveAverage {
    // is given array - count above average
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int summ = 0;
        for (int x: array){
            summ=summ+x;
        }
        float average = (float)summ/(array.length);
        for ( int i =0; i<array.length; i++) {
            if (average<array[i]){
                System.out.print(array[i]+";");
            }
        }
    }
}
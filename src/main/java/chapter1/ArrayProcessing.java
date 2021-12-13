package chapter1;

import java.util.Arrays;

public class ArrayProcessing {
    public static void main(String[] args) {
        double[] array = new double[]{ 1.1, 2, 4, 2, 234, 43, 23, 234, 99, 75, 837, 7, 0, 86 };

        double[][] first = new double[][]{ new double[]{ 1, 2, 3 } };
        double[][] second = new double[][]{ new double[]{ 1, 2, 3 } };
        System.out.println(maxValue(array));
        System.out.println(average(array));
        System.out.println(Arrays.toString(copyToAnother(array)));
        System.out.println(Arrays.toString(reverse(copyToAnother(array))));
        System.out.println(Arrays.deepToString(matrixMultiplication(first, second)));
    }

    private static double[][] matrixMultiplication(double[][] array, double[][] second) {
        int n = array.length;
        double[][] newArray = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    newArray[i][j] += array[i][k] * second[k][j];
                }
            }
        }
        return newArray;
    }

    private static double[] reverse(double[] copyToAnother) {
        int n = copyToAnother.length;
        for (int i = 0; i < n / 2; i++) {
            double temp = copyToAnother[i];
            copyToAnother[i] = copyToAnother[n - 1 - i];
            copyToAnother[n - 1 - i] = temp;
        }

        return copyToAnother;
    }

    private static double[] copyToAnother(double[] array) {
        int n = array.length;
        double[] newArray = new double[n];

        for (int i = 0; i < n; i++) {
            newArray[i] = array[i];
        }

        return newArray;
    }

    private static double average(double[] array) {
        int n = array.length;
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        return sum / n;
    }

    private static double maxValue(double[] array) {
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}

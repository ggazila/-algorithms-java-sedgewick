package chapter1;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(rank(12, new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }));
    }

    private static int rank(int key, int[] numbers) {
        return rank(key, numbers, 0, numbers.length - 1);
    }

    private static int rank(int key, int[] numbers, int low, int high) {
        if (low > high) {
            return -1;
        }

        int middle = low + (high - low) / 2;
        if (key < numbers[middle]) {
            return rank(key, numbers, low, middle - 1);
        } else if (key > numbers[middle]) {
            return rank(key, numbers, middle + 1, high);
        }
        return middle;
    }
}

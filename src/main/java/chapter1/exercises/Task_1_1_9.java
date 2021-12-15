package chapter1.exercises;

public class Task_1_1_9 {
    public static void main(String[] args) {
        System.out.println(binaryRepresentation(125));
    }

    private static String binaryRepresentation(int num) {
        StringBuilder s = new StringBuilder();
        for (int i = num; i > 0; i = i / 2) {
            s.insert(0, (i % 2));
        }
        return s.toString();
    }
}

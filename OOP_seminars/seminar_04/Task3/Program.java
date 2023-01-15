package OOP_seminars.seminar_04.Task3;

public class Program {
    public static void main(String[] args) {
        String[] arr = { "hgf", "tgf", "asd", "bgs", "duj" };
        for (String str : arr) {
            System.out.println(str);
        }
        System.out.println();
        sortArray(arr);
        for (String str : arr) {
            System.out.println(str);
        }

        Integer[] mas = { 6, 0, 3, 7, 2 };
        for (int item : mas) {
            System.out.println(item);
        }
        System.out.println();
        sortArray(mas);
        for (int item : mas) {
            System.out.println(item);
        }

    }

    private static <T extends Comparable<T>> void sortArray(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }

        }
    }
}

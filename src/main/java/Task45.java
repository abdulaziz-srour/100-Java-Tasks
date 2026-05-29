import java.util.Arrays;

public class Task45 {
    public static void main() {
        String[][] array = new String[][]{
                {"1", "2", "3", "4", "5", "6"},
                {"J", "K", "L", "M", "N", "7"},
                {"I", "V", "W", "X", "O", "8"},
                {"H", "U", "Z", "Y", "P", "9"},
                {"G", "T", "S", "R", "Q", "0"},
                {"F", "E", "D", "C", "B", "A"}
        };
        System.out.println("Iterative inplace rotate:");
        rotateInplace(array);

        System.out.println("\n\nRecursive inplace rotate:");
        rotateInplaceRecursive(array);
    }

    /**
     * Rotates an N x N 2D generic array (matrix) 90 degrees clockwise in-place.
     * 1. It transposes the matrix by swapping elements across the main diagonal.
     * 2. It flips the matrix horizontally by reversing the elements in each row.
     * Note: This algorithm requires a strictly square (N x N) matrix to function correctly.
     *
     * @param array the square 2D array to be rotated
     * @param <T>   the generic type of the array elements
     */
    static <T> void rotateInplace(T[][] array) {
        if (array == null || array.length == 0)
            return;

        printArray(array);
        System.out.println(" ".repeat(array.length * 3 / 2) + "↓");

        transposeMatrix(array);

        for (int i = 0; i < array.length; i++) {
            for (int y = 0, j = array[i].length - 1; y < array[i].length / 2; y++, j--) {
                switchIndex(array, i, y, j);
            }
        }

        printArray(array);
    }

    /**
     * Rotates an N x N 2D generic array (matrix) 90 degrees clockwise in-place.
     * This implementation uses a mathematical transposition followed by a
     * recursive approach to flip the matrix horizontally, avoiding nested for-loops.
     *
     * @param array the square 2D array to be rotated
     * @param <T>   the generic type of the array elements
     */
    public static <T> void rotateInplaceRecursive(T[][] array) {
        if (array == null || array.length == 0)
            return;

        printArray(array);
        System.out.println(" ".repeat(array.length * 3 / 2) + "↓");
        transposeMatrix(array);
        rotateInplaceRecursiveHelper(array, 0, 0, array[0].length - 1);
        printArray(array);
    }

    private static <T> void rotateInplaceRecursiveHelper(T[][] array, int i, int y, int j) {
        if (i >= array.length) {
            return;
        } else if (y >= array[i].length / 2) {
            rotateInplaceRecursiveHelper(array, i + 1, 0, array.length - 1);
            return;
        }
        switchIndex(array, i, y, j);
        rotateInplaceRecursiveHelper(array, i, y + 1, j - 1);
    }

    private static <T> void transposeMatrix(T[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int y = i + 1; y < array[i].length; y++) {
                T temp = array[i][y];
                array[i][y] = array[y][i];
                array[y][i] = temp;
            }
        }
    }

    private static <T> void switchIndex(T[][] array, int i, int y, int j) {
        T temp = array[i][y];
        array[i][y] = array[i][j];
        array[i][j] = temp;
    }

    private static <T> void printArray(T[][] array) {
        for (T[] a : array) {
            for (T item : a) {
                System.out.print(item + "  ");
            }
            System.out.println();
        }
    }
}
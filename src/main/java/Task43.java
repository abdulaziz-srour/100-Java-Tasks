import java.util.Arrays;

public class Task43 {
    /**
     * Flips a 2D generic array horizontally (left to right) in-place.
     * The method iterates through each row of the array and uses a two-pointer
     * approach to swap the elements across the vertical center axis.
     *
     * @param array the 2D array to be flipped
     * @param <T>   the generic type of the array elements
     */
    static <T> void flipHorizontally(T[][] array){
        if(array == null || array.length == 0)
            return;

        System.out.println("flipHorizontally()\n" +
            "------------------");
        printArray(array);
        System.out.println(" ".repeat(array[0].length / 2) + "↓");

        for (int i = 0; i < array.length; i++) {
            for (int y = 0, j = array[i].length - 1; y < array[i].length / 2; y++, j--) {
                T temp = array[i][j];
                array[i][j] = array[i][y];
                array[i][y] = temp;
            }
        }
        printArray(array);
    }

    /**
     * Flips a 2D generic array vertically (top to bottom) in-place.
     * For optimal performance, this method swaps the row references directly.
     *
     * @param array the 2D array to be flipped
     * @param <T>   the generic type of the array elements
     */
    static <T> void flipVertically(T[][] array){
        if(array == null || array.length == 0)
            return;

        System.out.println("flipVertically()\n" +
                "------------------");
        printArray(array);
        System.out.println(" ".repeat(array[0].length / 2) + "↓");

        for (int i = 0, y = array.length - 1; i < array.length / 2; i++, y--) {
            T[] temp = array[i];
            array[i] = array[y];
            array[y] = temp;
        }

        printArray(array);
    }

    private static <T> void printArray(T[][] array){
        for(T[] a: array){
            for(T item: a){
                System.out.print(item);
            }
            System.out.println();
        }
    }

    public static void main() {
        Integer[][] firstArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        flipHorizontally(firstArray);

        System.out.println();
        Integer[][] secondArray = {{1, 1, 4, 4}, {2, 2, 5, 5}, {3, 3, 6, 6}};
        flipVertically(secondArray);
    }

}

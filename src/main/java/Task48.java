import java.util.ArrayList;
import java.util.List;

public class Task48 {
    /**
     * Traverses a 2D generic array in a clockwise spiral order.
     * The algorithm peels the matrix layer by layer (top, right, bottom, left)
     * from the outside towards the center. It uses strict boundary checks to
     * safely handle non-square matrices, preventing duplicate reads when the
     * inner spiral collapses into a single row or column.
     *
     * @param array the 2D array to be traversed
     * @param <T>   the generic type of the array elements
     * @return a List containing the elements in the correct spiral order,
     * or an empty list if the input array is empty
     */
    static <T> List<T> spiralTraversal(T[][] array){
        List<T> result = new ArrayList<>();

        int count = 0;
        int lastRow = array.length - 1;
        int lastCol = array[0].length - 1;
        while(count < (array.length + 1) / 2){

            // Top
            for (int col = count; col <= lastCol - count; col++){
                result.add(array[count][col]);
            }

            // Right
            for (int row = count + 1; row <= lastRow - count; row++){
                result.add(array[row][lastCol - count]);
            }

            // Bottom
            if(lastRow - count > count) {
                for (int col = lastCol - count - 1; col >= count; col--) {
                    result.add(array[lastRow - count][col]);
                }
            }

            // Left
            if(lastCol - count > count) {
                for (int row = lastRow - count - 1; row >= count + 1; row--) {
                    result.add(array[row][count]);
                }
            }
            count++;
        }
        return result;
    }

    static void main() {
        Integer[][]  numbers = {
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}
        };
        System.out.println(spiralTraversal(numbers));

        String[][] letterPairs = {
                {"AB", "BC", "CD", "DE"},
                {"JK", "KL", "LM", "EF"},
                {"IJ", "HI", "GH", "FG"}
        };
        System.out.println(spiralTraversal(letterPairs));
    }


}

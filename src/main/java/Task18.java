public class Task18 {

    /**
     * Finds the minimum value in a given integer array using recursion.
     * If the array is empty, it returns Integer.MAX_VALUE.
     *
     * @param array The integer array to be searched
     * @return the smallest integer in the array, or Integer.MAX_VALUE if the array is empty
     */
    int min(int[] array){
        if(array.length == 0)
            return Integer.MAX_VALUE;
        return minHelper(array, 0, Integer.MAX_VALUE);
    }

    private int minHelper(int[] array, int index, int minValue) {
        if(array.length == index)
            return minValue;

        if(array[index] < minValue)
            minValue = array[index];

        return minHelper(array, index + 1, minValue);
    }
}

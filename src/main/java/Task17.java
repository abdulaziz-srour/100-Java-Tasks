public class Task17 {

    /**
     * Calculates the sum of all elements in an integer array
     * @param array The array of integers to be summed up
     * @return The total sum of the array elements
     */
    int sum(int[] array){
        return sumHelper(array, 0);
    }

    private int sumHelper(int[] array, int index) {
        if(array.length == index)
            return 0;
        return array[index] + sumHelper(array, index + 1);
    }
}

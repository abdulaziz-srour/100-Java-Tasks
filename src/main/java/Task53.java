public class Task53 {
    /**
     * Finds the minimum value in a given integer array.
     *
     * @param array the input array
     * @return the minimum integer value in the array, or -1 if the array is null or empty
     */
    int findMin(int[] array){
        if(array == null || array.length == 0)
            return -1;

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min)
                min = array[i];
        }
        return min;
    }

    /**
     * Finds the maximum value in a given integer array.
     *
     * @param array the input array
     * @return the maximum integer value in the array, or -1 if the array is null or empty
     */
    int findMax(int[] array){
        if(array == null || array.length == 0)
            return -1;

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max)
                max = array[i];
        }
        return max;
    }

    /**
     * Finds the minimum value within a specific sub-range of an array.
     *
     * @param array the input array
     * @param left  the starting index of the search range (inclusive)
     * @param right the ending index of the search range (exclusive)
     * @return the minimum value within the specified range, or -1 if the bounds are invalid or the array is empty/null
     */
    int findMinByPos(int[] array, int left, int right){
        int minPos = findMinPos(array, left, right);
        return minPos == -1 ? -1 : array[minPos];
    }

    private int findMinPos(int[] array, int left, int right){
        if(array == null || left > right ||
                right > array.length  || array.length == 0)
            return -1;

        int minNumber = array[left];
        int minIndex = left;
        for(int i = left + 1; i < right; i++){
            if(array[i] < minNumber) {
                minNumber = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    /**
     * Finds the maximum value within a specific sub-range of an array.
     *
     * @param array the input array
     * @param left  the starting index of the search range (inclusive)
     * @param right the ending index of the search range (exclusive)
     * @return the maximum value within the specified range, or -1 if the bounds are invalid or the array is empty/null
     */
    int findMaxByPos(int[] array, int left, int right){
        int maxPos = findMaxPos(array, left, right);
        return maxPos == -1 ? -1 : array[maxPos];
    }

    private int findMaxPos(int[] array, int left, int right){
        if(array == null || left > right ||
                right > array.length  || array.length == 0)
            return -1;

        int maxNumber = array[left];
        int maxIndex = left;
        for(int i = left + 1; i < right; i++){
            if(array[i] > maxNumber) {
                maxNumber = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}

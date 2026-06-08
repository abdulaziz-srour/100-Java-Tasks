import java.util.Arrays;

public class Task54 {
    /**
     * Appends a given number to the end of an integer array and sorts the newly created
     * array using a custom Merge Sort implementation.
     *
     * @param array  the original integer array
     * @param number the new integer to be added and sorted into the array
     * @return a new, fully sorted array containing all original elements plus the new number
     */
    int[] arraySplit(int[] array, int number){
        int[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = number;
        mergeSort(result, 0, result.length - 1);
        return result;
    }

    private void mergeSort(int[] array, int start, int end) {
        if(start >= end)
            return;

        int mid = start + (end - start) / 2;
        mergeSort(array, start, mid);
        mergeSort(array, mid + 1, end);

        merge(array, start, mid, end);
    }

    private void merge(int[] array, int start, int mid, int end) {
        int[] copy = Arrays.copyOfRange(array, start, end + 1);

        int left = 0;
        int right = mid - start + 1;
        int writeIndex = start;
        while(left <= mid - start && right <= end - start){
            if(copy[left] < copy[right]){
                array[writeIndex] = copy[left];
                left++;
            } else{
                array[writeIndex] = copy[right];
                right++;
            }
            writeIndex++;
        }

        while(left <= mid - start){
            array[writeIndex] = copy[left];
            left++;
            writeIndex++;
        }

        while(right <= end - start){
            array[writeIndex] = copy[right];
            right++;
            writeIndex++;
        }
    }
}

public class Task42 {
    /**
     * Rearranges the elements of an integer array so that all even numbers appear
     * before all odd numbers.
     * The method modifies the array in-place using a two-pointer technique.
     *
     * @param array the integer array to be rearranged
     * @return the modified array with evens before odds, or null if the input is null
     */
    int[] orderEvenBeforeOdd(int[] array){
        if(array == null)
            return null;

        int readPos = 0;
        int writePos = 0;

        while(readPos < array.length){
            if(array[readPos] % 2 == 0){
                int temp = array[readPos];
                array[readPos] = array[writePos];
                array[writePos] = temp;
                writePos++;
            }
            readPos++;
        }

        return array;
    }
}

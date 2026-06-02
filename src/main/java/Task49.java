public class Task49 {
    /**
     * Increments a large integer represented as an array of digits by one.
     * The digits are stored such that the most significant digit is at the
     * first index (index 0), and each element contains a single digit (0-9).
     * The algorithm iterates from right to left (least significant digit first).
     *
     * @param array the input integer array representing the digits
     * @return the modified array representing the incremented value,
     * or null if the input array is null or empty
     */
    int[] addOne(int[] array){
        if(array == null || array.length == 0)
            return null;
        for (int i = array.length - 1; i >= 0; i--) {
            if(array[i] < 9){
                array[i]++;
                return array;
            } else{
                array[i] = 0;
            }
        }

        array = new int[array.length + 1];
        array[0] = 1;
        return array;
    }
}

import java.util.Objects;

public class Task44 {
    /**
     * Checks if a given array of strings is a palindrome.
     * The method determines if the array reads the same forwards and backwards
     * by using an efficient two-pointer approach, comparing elements from the
     * outside towards the center. It safely handles null elements within the array.
     *
     * @param array the string array to be evaluated
     * @return true if the array is a palindrome or empty; false if it is not,
     * or if the input array itself is null
     */
    boolean isPalindrome(String[] array){
        if(array == null)
            return true;

        for (int i = 0, y = array.length - 1; i < array.length / 2; i++, y--) {
            if(!Objects.equals(array[i], array[y]))
                return false;
        }
        return true;
    }
}

public class Task22 {

    /**
     * Determines whether a given integer is a palindrome without converting it to a String.
     *
     * @param num The integer to be checked
     * @return true if the number is a palindrome, false otherwise
     */
    boolean isNumberPalindrome(int num){
        num = Math.abs(num);
        int digits = (int) Math.log10(num) + 1;
        return isNumberPalindromeHelper(num, digits);
    }

    private boolean isNumberPalindromeHelper(int num, int digits) {
        if(digits <= 1)
            return true;

        int temp = (int) Math.pow(10, digits - 1);
        int rightDigit = num % 10;
        int leftDigit = num / temp;
        if(rightDigit == leftDigit){
            num -= leftDigit * temp;
            num /= 10;
            return isNumberPalindromeHelper(num, digits - 2);
        }

        return false;
    }
}

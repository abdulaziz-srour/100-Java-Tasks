public class Task29 {

    /**
     * Checks if a given string is a palindrome (reads the same forwards and backwards)
     * The method is case-insensitive and uses two-pointer approach to compare
     * characters from the outside in, stopping at the middle of the string.
     *
     * @param text The string to be checked
     * @return true if the string is a palindrome, null or empty; false otherwise
     */
    boolean isPalindrome(String text){
        if(text == null || text.isEmpty())
            return true;

        int length = text.length();
        text = text.toUpperCase();
        for(int i = 0, y = length - 1; i < length/2; i++, y--)
            if(text.charAt(i) != text.charAt(y))
                return false;

        return true;
    }

    /**
     * Checks if a given string is a palindrome, ignoring differences in casing,
     * whitespace, punctuation, and special characters. The method removes all
     * non-alphanumeric characters (including underscores) using regular expression
     * and then performs two pointer comparison from the outside in.
     *
     * @param text The string to be checked
     * @return true if the cleaned text is palindrome, null or empty; false otherwise
     */
    boolean isPalindromeWithIgnoredCharacters(String text){
        if(text == null || text.isEmpty())
            return true;

        text = text.replaceAll("[\\W_]", "");
        text = text.toUpperCase();
        int length = text.length();

        for(int i = 0, y = length - 1; i < length/2; i++, y--)
            if(text.charAt(i) != text.charAt(y))
                return false;

        return true;
    }
}

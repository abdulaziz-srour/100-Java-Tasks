public class Task34 {
    /**
     * Checks if a given string contains balanced parentheses.
     * The method ignores non-parenthesis characters and iterates through a character array,
     * maintaining separate counters for opening and closing braces. It ensures that
     * a closing parenthesis never precedes an unmatched opening parenthesis and verifies
     * that both counters are exactly equal at the end.
     *
     * @param text the string to be evaluated
     * @return true if the parentheses are perfectly balanced, or if the string is null/empty;
     * false if the order is invalid or if there is a mismatch in brace counts
     */
    boolean checkBraces(String text){
        if(text == null || text.isEmpty())
            return true;

        int countOpeningBraces = 0;
        int countClosingBraces = 0;

        for(char c: text.toCharArray()){
            if(c == '(')
                countOpeningBraces++;
            else if (c == ')')
                countClosingBraces++;

            if(countClosingBraces > countOpeningBraces)
                return false;
        }
        return countOpeningBraces == countClosingBraces;
    }
}

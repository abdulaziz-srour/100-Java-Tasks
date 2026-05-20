public class Task30 {

    /**
     * Checks whether a given string has only unique characters (no duplicates)
     * The method is case-insensitive and uses Java Stream API to count the number of
     * distinct characters. It then compares this count to the original length of the text
     * input to check if any duplicates existed
     *
     * @param text  The string to be evaluated
     * @return      true if all characters are unique, or if the input is null or empty;
     *              false if duplicates are found
     */
    boolean checkNoDuplicateChars(String text){
        if(text == null || text.isEmpty())
            return true;

        text = text.toLowerCase();
        long noDuplicateLength = text.chars()
                                        .distinct()
                                        .count();
        return text.length() == noDuplicateLength;
    }
}

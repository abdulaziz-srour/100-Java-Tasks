public class Task28 {

    /**
     * Reverses the given string.
     * This method iterates through the characters of the input string in
     * reverse order and builds the reversed string using a StringBuilder
     *
     * @param text The string to be reversed
     * @return The reversed string, or null if the input text is null
     */
    String reverse(String text){
        if(text == null)
            return null;

        StringBuilder reversedText = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--)
            reversedText.append(text.charAt(i));

        return reversedText.toString();
    }
}

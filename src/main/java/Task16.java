public class Task16 {

    /**
     * Reverses a given String
     * @param text The original String to be reversed
     * @return The completely reversed string.
     */
    String reverseString(String text){
        return reverseStringHelper(text, "");
    }

    private String reverseStringHelper(String text, String result) {
        if(text.isEmpty())
            return result;
        int length = text.length();
        return reverseStringHelper(text.substring(0, length - 1), result + text.charAt(length - 1));
    }
}

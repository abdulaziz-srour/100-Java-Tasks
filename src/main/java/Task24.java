public class Task24 {

    /**
     * Counts the number of non-overlapping occurrences of a specific substring within a given text.
     *
     * @param text The main string to be searched
     * @param substring The target substring to count
     * @return The number of times the substring appears in the text,
     *          or 0 if the prefix is null or empty.
     */
    int countSubstrings(String text, String substring){
        if(substring == null || substring.isEmpty())
            return 0;
        return (text.length() - text.replace(substring, "").length()) / substring.length();
    }
}

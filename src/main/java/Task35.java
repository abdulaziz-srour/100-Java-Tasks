public class Task35 {
    /**
     * Checks if two given strings are anagrams of each other.
     * The method is case-insensitive and checks that both strings are of equal length.
     * It iteratively removes each character of the first string from the second string
     * using replacement. If the second string is empty at the end of the process,
     * the strings are considered valid anagrams.
     *
     * @param str1 the first string to be compared
     * @param str2 the second string to be compared
     * @return true if the strings are anagrams, false otherwise (including null inputs or unequal lengths)
     */
    boolean isAnagram(String str1, String str2){
        if(str1 == null || str2 == null || str1.length() != str2.length())
            return false;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            str2 = str2.replaceFirst(String.valueOf(c), "");
        }

        return str2.isEmpty();
    }
}

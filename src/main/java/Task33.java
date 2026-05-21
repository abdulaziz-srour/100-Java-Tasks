public class Task33 {

    /**
     * Checks if the second string is a substring of any valid rotation of the first string.
     * The method is case-insensitive. It systematically generates all possible rotations
     * of the base string using a loop and substring concatenation, checking each generated
     * rotation for the presence of the target string.
     *
     * @param str1 the base string whose rotations are to be generated and evaluated
     * @param str2 the target string to search for within the generated rotations
     * @return true if str2 is found within any rotation of str1; false otherwise (including null inputs)
     */
    boolean containsRotation(String str1, String str2){
        if(str1 == null || str2 == null || str1.length() < str2.length())
            return false;

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            String rotatedWord = str1.substring(i, str1.length()) + str1.substring(0, i);
            if(rotatedWord.contains(str2))
                return true;
        }
        return false;
    }
}

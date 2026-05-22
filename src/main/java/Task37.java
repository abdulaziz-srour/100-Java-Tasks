import java.util.HashMap;
import java.util.Map;

public class Task37 {

    /**
     * Checks if a given text follows a specific character pattern.
     * The method splits the text into words and uses a HashMap to map each character
     * of the pattern to the corresponding word in the text. It verifies that every time
     * a known pattern character appears, it maps to the exact same word.
     *
     * @param text    the space-separated string of words to be evaluated
     * @param pattern the string representing the character sequence
     * @return true if the text consistently maps characters to words according to the pattern; false otherwise
     */
    boolean matchesPattern(String text, String pattern){
        if(text == null || pattern == null || text.isEmpty() || pattern.isEmpty())
            return false;

        String[] array = text.split(" ");
        if(array.length != pattern.length())
            return false;

        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if(map.containsKey(c) && !map.get(c).equals(array[i]))
                    return false;
            map.put(c, array[i]);
        }
        return true;
    }
}

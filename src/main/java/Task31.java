import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Task31 {

    /**
     * Removes duplicate characters from a given string case-insensitively while
     * preserving the original casing of the first occurrence of each character.
     * This method uses a set which acts as a filter to allow only the first
     * instance of each character to pass through, effectively ignoring subsequent
     * duplicates regardless of their case.
     *
     * @param text The input string to be evaluated
     * @return a new string with all duplicates removed, or null if the input
     * is null
     */
    String removeDuplicates(String text){
        if(text == null || text.isEmpty())
            return null;

        Set<String> seenCharacters = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

        return text.chars()
                .mapToObj(e -> String.valueOf((char) e))
                .filter(seenCharacters::add)
                .collect(Collectors.joining());
    }
}

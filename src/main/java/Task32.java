import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task32 {

    /**
     * Capitalizes the first letter of every word in a given space-separated string.
     * This method splits the input string by spaces, uses the Java Stream API to
     * capitalize the first character of each resulting word, and then joins them
     * back together into a single string.
     *
     * @param text the input string to be processed
     * @return a new string with all words capitalized, or null if the input is null or empty
     */


    String capitalize(String text){
        if(text == null || text.isEmpty())
            return null;

        String capitalizedText = Arrays.stream(text.split(" "))
                .map((e) -> e.substring(0, 1).toUpperCase() + e.substring(1))
                .collect(Collectors.joining(" "));

        return capitalizedText;
    }

    /**
     * Capitalizes the first letter of every string within a given list.
     * This method utilizes the Java Stream API to process the elements and collects
     * the modified strings into a new, unmodifiable list to ensure immutability.
     *
     * @param words the list of strings to be capitalized
     * @return an unmodifiable list of capitalized strings, or null if the input list is null or empty
     */
    List<String> capitalize(List<String> words){
        if(words == null || words.isEmpty())
            return null;

        return words.stream()
                .map((e) -> e.substring(0, 1).toUpperCase() + e.substring(1))
                .collect(Collectors.toUnmodifiableList());
    }

    /**
     * Capitalizes the first letter of each string in a list, unless the string
     * is present in the provided exceptions list.
     * The method iterates through the input list and checks each word against the
     * exceptions before applying the capitalization, preserving the original formatting
     * of the excluded words.
     *
     * @param words      the list of strings to be processed
     * @param exceptions a list of specific words that should remain unchanged
     * @return a new list containing the processed strings, or null if the input list is null or empty
     */
    List<String> capitalizeSpecial(List<String> words, List<String> exceptions){
        if(words == null || words.isEmpty())
            return null;

        List<String> result = new ArrayList<>();
        for(String word: words){
            if(exceptions.contains(word))
                result.add(word);
            else
                result.add(word.substring(0, 1).toUpperCase() + word.substring(1));
        }

        return result;
    }

}

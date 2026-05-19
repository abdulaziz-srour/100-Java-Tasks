import java.util.List;
import java.util.stream.Collectors;

public class Task27 {
    /**
     * Joins a list of strings into a single string, separated by the specified delimiter.
     * This method manually joins the words using a loop and then removes the
     * delimiter at the end using the substring method.
     *
     * @param words     The list of strings to be joined
     * @param delimiter The characters used to separate each string
     * @return          The joined string, or null if the list is empty or null
     */
    String join(List<String> words, String delimiter){
        if(words.isEmpty() || words == null)
            return null;

        String text = "";
        for(String word: words)
            text += word + delimiter;
        return text.substring(0, text.length() - delimiter.length());
    }

    /**
     * Joins a list of strings into a single string, separated by the specified delimiter.
     * This method uses the Collectors.joining() to join the words.
     *
     * @param words     The list of strings to be joined
     * @param delimiter The characters used to separate each string
     * @return          The joined string
     */
    String joinStrings(List<String> words, String delimiter){
         String text = words.stream()
                                    .collect(Collectors.joining(delimiter));
        return text;
    }
}

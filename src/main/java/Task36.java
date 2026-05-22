import java.util.Map;

public class Task36 {
    /**
     * Converts a given string into Morse code.
     * The method iterates through the characters of the input text, looks up
     * their corresponding Morse code sequence in a predefined dictionary map,
     * and concatenates them separated by spaces.
     *
     * @param text the string to be converted
     * @return a string containing the Morse code representation, with trailing spaces removed
     */

    private static final Map<Character, String> morse = Map.of(
            'E', ".",
            'O', "- - -",
            'S', ". . .",
            'T', "-",
            'W', ". - -"
    );
    String toMorseCode(String text){
        if(text == null || text.isEmpty())
            return "";

        String morseText = "";
        for (int i = 0; i < text.length(); i++) {
            morseText += morse.get(text.charAt(i)) + "   ";
        }

        return morseText.strip();
    }
}

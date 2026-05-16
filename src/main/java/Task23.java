import java.util.HashSet;
import java.util.Set;

public class Task23 {

    /**
     * Calculates all unique permutations of a given String.
     * The HashSet filters out any duplicate permutations
     *
     * @param text The input String to be permuted
     * @return A Set containing all unique permutations of the input String.
     */
    Set<String> calcPermutations(String text){
        HashSet<String> permutations = new HashSet<>();
        calcPermutationsHelper("", text, permutations);
        return permutations;
    }

    private void calcPermutationsHelper(String prefix, String rest, Set<String> permutations) {
        if(rest.isEmpty()) {
            permutations.add(prefix);
            return;
        }
        for(int i = 0; i < rest.length(); i++){
            String newPrefix = prefix + rest.charAt(i);
            String newRest = rest.substring(0, i) + rest.substring(i + 1);
            calcPermutationsHelper(newPrefix, newRest, permutations);
        }
    }
}

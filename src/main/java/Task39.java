import java.util.Arrays;
import java.util.Comparator;

public class Task39 implements Comparator {
    /**
     * Compares two version strings and returns a character representing their relationship.
     * This method acts as a wrapper around the Comparator's compare method, translating
     * the numeric result into a simple mathematical symbol ('=', '>', or '<').
     *
     * @param ver1 the first version string to be evaluated
     * @param ver2 the second version string to be evaluated
     * @return '=' if the versions are identical, '>' if the first version is newer,
     * or '<' if the first version is older
     * @throws IllegalArgumentException if either input string is null or empty
     */
    char compareVersions(String ver1, String ver2){
        if(ver1 == null || ver2 == null || ver1.isEmpty() || ver2.isEmpty())
            throw new IllegalArgumentException("Invalid Argument/s");

        int compare = compare(ver1, ver2);
        if(compare == 0)
            return '=';
        else if(compare > 0)
            return '>';
        else
            return '<';
    }

    /**
     * Compares two version objects (expected to be strings) numerically by their semantic components.
     * The method splits the version strings by dots, validates that they consist of exactly
     * 2 or 3 components, and normalizes them by appending a ".0" patch version if missing.
     * It then performs a strict numerical comparison of the major, minor, and patch numbers.
     *
     * @param ver1 the first version object to be compared
     * @param ver2 the second version object to be compared
     * @return a negative integer, zero, or a positive integer as the first version
     * is less than, equal to, or greater than the second
     * @throws IllegalArgumentException if the versions do not contain exactly 2 or 3 parts
     */
    @Override
    public int compare(Object ver1, Object ver2) {
        String[] ver1Array = String.valueOf(ver1).split("\\.");
        String[] ver2Array = String.valueOf(ver2).split("\\.");

        if(ver1Array.length < 2 || ver1Array.length > 3
        || ver2Array.length < 2 || ver2Array.length > 3)
            throw new IllegalArgumentException("Invalid Arguemnt/s");

        if(ver1Array.length == 2) {
            ver1Array = Arrays.copyOf(ver1Array, 3);
            ver1Array[2] = "0";
        }
        if(ver2Array.length == 2) {
            ver2Array = Arrays.copyOf(ver2Array, 3);
            ver2Array[2] = "0";
        }

        for (int i = 0; i < ver1Array.length; i++) {
            int firstNumber = Integer.parseInt(ver1Array[i]);
            int secondNumber = Integer.parseInt(ver2Array[i]);
            int compare = Integer.compare(firstNumber, secondNumber);
            if(compare != 0)
                return compare;
        }

        return 0;
    }
}

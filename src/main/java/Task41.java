public class Task41 {
    /**
     * Prints a symmetrical tower (or pyramid) of hash ('#') characters to the console.
     * The tower consists of a central pipe ('|') pillar, with an increasing number of
     * hash blocks on the left (right-aligned) and right (left-aligned) sides for each row.
     *
     * @param n the height of the tower (maximum number of hashes on each side).
     * If n is less than or equal to 0, nothing is printed.
     */
    static void printTower(int n){
        if(n <= 0)
            return;
        int spacing = n + 1;
        String formatString = "%" + spacing + "s|%-" + spacing + "s";
        for (int i = 0; i <= n; i++) {
            String hashes = "#".repeat(i);
            System.out.println(String.format(formatString, hashes, hashes));
        }
        System.out.println("-".repeat(spacing * 2 + 1));
    }

    static void main() {
        printTower(30);
    }
}

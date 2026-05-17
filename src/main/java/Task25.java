public class Task25 {

    /**
     * Prints an "English Ruler" fractal pattern of a given length.
     *
     * @param length The total number of major intervals (inches) on the ruler
     */
    void printRuler(int length){
        if(length < 0)
            return;

        StringBuilder sb = new StringBuilder();
        sb.append("---- 0");
        for (int i = 1; i <= length; i++) {
            printRulerHelper(sb, 3);
            sb.append("\n");
            sb.append("---- ").append(i);
        }
        System.out.println(sb);
    }

    private void printRulerHelper(StringBuilder sb, int depth) {
        if(depth <= 0)
            return;

        printRulerHelper(sb, depth - 1);
        sb.append("\n").append("-".repeat(depth));
        printRulerHelper(sb, depth - 1);
    }

    void main() {
        printRuler(5);
    }
}

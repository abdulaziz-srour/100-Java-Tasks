public class Task21 {

    /**
     * Prints Pascal's Triangle up to a specified number of rows using recursion.
     *
     * @param num The total number of rows of Pascal's Triangle to be printed
     */
    void printPascal(int num){
        printPascalHelper(num, new int[0]);
    }

    private void printPascalHelper(int num, int[] array) {
        if(num <= 0)
            return;

        int[] temp = new int[array.length + 1];
        temp[0] = 1;
        temp[temp.length - 1] = 1;

        for(int i = 1; i < array.length; i++) {
            temp[i] = array[i - 1] + array[i];
        }

        System.out.print("   ".repeat(num));
        for(int i: temp)
            System.out.printf("%6d",i);
        System.out.println();
        printPascalHelper(num - 1, temp);
    }

    void main() {
        printPascal(10);
    }
}

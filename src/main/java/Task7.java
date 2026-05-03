public class Task7 {

    // Task a:
    // Converts a Roman numeral string to an integer, accounting for subtraction rules (like IV or IX)

    int fromRomanNumber(String rnumber){

        int num = 0;
        for(int i = 0; i < rnumber.length(); i++){
            char firstNumber = rnumber.charAt(i);
            int firstIntNumber = getDecimalDigit(firstNumber);
            if((i + 1) < rnumber.length()){
                char secondNumber = rnumber.charAt(i + 1);
                int secondIntNumber = getDecimalDigit(secondNumber);
                if(firstIntNumber >= secondIntNumber){
                    num += firstIntNumber;
                } else {
                    num += secondIntNumber - firstIntNumber;
                    i++;
                }
            } else {
                num += firstIntNumber;
            }
        }

        return num;
    }

    private int getDecimalDigit(char romanDigit){
        switch (romanDigit){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;
        }
    }

    // Task b:
    // Converts an integer to a Roman numeral using predefined mappings
    String toRomanNumber(int dnumber) {
        int[] decimalDigits = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] romanDigits = new String[]{"I", "IV", "V", "IX", "X", "XL", "L", "XC",
                "C", "CD", "D", "CM", "M"};
        StringBuilder rnumber = new StringBuilder();
        int index = decimalDigits.length - 1;
        while(dnumber > 0) {
            while (dnumber >= decimalDigits[index]) {
                rnumber.append(romanDigits[index]);
                dnumber -= decimalDigits[index];
            }
            index--;
        }
        return rnumber.toString();
    }
}
public class Task6 {

    // Calculates a weighted checksum: Sum of (digit * position) modulo 10
    int calcChecksum(String number){
        int sum = 0;
        for(int i = 1; i <= number.length(); i++){
            int num = number.charAt(i - 1) - '0';
            sum += num * i;
        }

        return sum % 10;
    }
}

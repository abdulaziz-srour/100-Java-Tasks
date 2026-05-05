import java.util.Arrays;

public class Task10 {

    // Calculates the maximum seamless amount of change that can be formed using the given coins
    int calcMaxPossibleChange(int[] values){
        Arrays.sort(values);

        int currentMax = 0;
        for (int i = 0; i < values.length; i++) {
            int coin = values[i];
            if (coin > currentMax + 1)
                break;
            currentMax += coin;
        }
        return currentMax;
    }
}
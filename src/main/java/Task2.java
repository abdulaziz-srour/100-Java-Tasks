import java.util.ArrayList;

public class Task2 {

    // Converts the individual digits of a positive integer into a sequence of words.
    String numberAsText(int n){
        StringBuilder valueAsText = new StringBuilder("");
        ArrayList<Integer> a = new ArrayList<>();
        while(n > 0){
            a.add(n % 10);
            n /= 10;
        }

        for(int i: a.reversed()){
            switch (i){
                case 0:
                    valueAsText.append("ZERO ");
                    break;
                case 1:
                    valueAsText.append("ONE ");
                    break;
                case 2:
                    valueAsText.append("TWO ");
                    break;
                case 3:
                    valueAsText.append("THREE ");
                    break;
                case 4:
                    valueAsText.append("FOUR ");
                    break;
                case 5:
                    valueAsText.append("FIVE ");
                    break;
                case 6:
                    valueAsText.append("SIX ");
                    break;
                case 7:
                    valueAsText.append("SEVEN ");
                    break;
                case 8:
                    valueAsText.append("EIGHT ");
                    break;
                case 9:
                    valueAsText.append("NINE ");
                    break;
            }
        }
        return valueAsText.toString().strip();
    }
}

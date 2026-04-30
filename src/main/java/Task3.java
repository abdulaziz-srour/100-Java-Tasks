import java.util.ArrayList;
import java.util.List;

public class Task3 {
    List<Integer> calcPerfectNumbers(int n){

        // Calculates all perfect numbers between 1 and 'n'
        List<Integer> l = new ArrayList<>();
        for(int i = 1; i <=n; i++){
            int sum = 0;
            int y;
            for(y = 1; y <= i/2; y++){
                if(i % y == 0){
                    sum += y;
                }
            }
            if(i == sum){
                l.add(i);
            }
        }
        return l;
    }
}

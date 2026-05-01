import java.util.ArrayList;
import java.util.List;

public class Task4 {

    // Calculates prime numbers using the Sieve of Eratosthenes algorithm
    List<Integer> calcPrimesUpTo(int n){
        List<Integer> l = new ArrayList<>();
        boolean[] a = new boolean[n];
        for(int i = 2; i < n; i++){
            if(a[i] == false){
                l.add(i);
                for(int y = i * 2; y < n;y += i){
                    a[y] = true;
                }
            }
        }
        return l;
    }
}

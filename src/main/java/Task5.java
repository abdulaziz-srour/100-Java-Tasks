public class Task5 {

    // Calculates all twin primes (prime pairs with a difference of 2) up to the limit n
    String calcTwinPrimeNumbers(int n){
        return calcPair(n, 2);
    }

    // Calculates all cousin primes (prime pairs with a difference of 4) up to the limit n
    String calcCousinPrimeNumbers(int n){
        return calcPair(n, 4);
    }

    // Calculates all sexy primes (prime pairs with a difference of 6) up to the limit n
    String calcSexyPrimeNumbers(int n){
        return calcPair(n, 6);
    }


    private boolean[] isPrime(int n){
        boolean[] a = new boolean[n];

        for(int i = 2; i < n; i++){
            if(a[i] == false){
                for(int y = i*2; y < n; y += i){
                    a[y] = true;
                }
            }
        }
        return a;
    }

    private String calcPair(int n, int range){
        boolean[] a = isPrime(n + range);
        StringBuilder result = new StringBuilder();

        for(int i = 2; i < a.length - range; i++){
            if(a[i] == false && a[i + range] == false){
                result.append(i + "=" + (i + range) + ", ");
            }
        }

        if(result.isEmpty())
            return null;
        else
            return result.substring(0, result.length()-2);
    }
}

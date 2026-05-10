public class Task13 {

    // Calculates the n-th Fibonacci number using recursion
    long fibRec(int n){
        if(n <= 0){
            throw new IllegalArgumentException("n must be greater than 0!");
        }

        if(n == 1 || n == 2){
            return 1;
        }

        return fibRec(n - 1) + fibRec(n - 2);
    }

    // Calculates the n-th Fibonacci number using iteration
    long fibIter(int n){
        if(n <= 0){
            throw new IllegalArgumentException("n must be greater than 0!");
        }

        if(n == 1 || n == 2){
            return 1;
        }

        long temp;
        long firstN = 1;
        long secondN = 1;

        while(n > 2){
            temp = secondN;
            secondN += firstN;
            firstN = temp;
            n--;
        }

        return secondN;
    }
}

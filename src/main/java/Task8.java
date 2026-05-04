import java.util.*;

public class Task8 {
    // Task a
    // Finds all Pythagorean triples (a, b, c) under 100 with a O(n^3) time complexity.
    List<int[]> calcPythagoreanTriples(){
        List<int[]> list = new ArrayList<>();
        for(int a = 1; a < 100; a++){
            for(int b = 1; b < 100; b++){
                for(int c = 1; c < 100; c++){
                    if(a * a + b * b == c * c){
                        list.add(new int[] {a, b, c});
                    }
                }
            }
        }
        return list;
    }


    // Task a (Bonus)
    // Finds all Pythagorean triples (a, b, c) under 100 with an optimized O(n^2) time complexity.
    List<int[]> calcEfficientPythagoreanTriples(){
        List<int[]> list = new ArrayList<>();
        for(int a = 1; a < 100; a++){
            for(int b = 1; b < 100; b++){
                double c = Math.sqrt(a * a + b * b);
                if (c < 100 && c % 1 == 0) {
                    list.add(new int[]{a, b, (int) c});
                }
            }
        }
        return list;
    }


    // Task b
    // Finds all combinations of a^2 + b^2 = c^2 + d^2 under 100 using a brute-force O(n^4) approach.
    List<int[]> calcEqualSquareSums(){
        List<int[]> list = new ArrayList<>();

        for(int a = 1; a < 100; a++){
            for(int b = 1; b < 100; b++){
                for(int c = 1; c < 100; c++){
                    for(int d = 1; d < 100; d++){
                        if(a * a + b * b == c * c + d * d){
                            list.add(new int[]{a, b, c, d});
                        }
                    }
                }
            }
        }
        return list;
    }

    // Task b (Bonus)
    // Efficiently finds combinations of a^2 + b^2 = c^2 + d^2 in O(n^2) time by grouping precalculated sums in a HashMap.
    List<int[]> calcEfficientEqualSquareSums(){
        HashMap<Integer, List<int[]>> sumMap = new HashMap<>();
        for(int c = 1; c < 100; c++){
            for(int d = 1; d < 100; d++){
                int sum = c * c + d * d;
                sumMap.putIfAbsent(sum, new ArrayList<>());
                sumMap.get(sum).add(new int[]{c, d});
            }
        }

        List<int[]> list = new ArrayList<>();
        for(int a = 1; a < 100; a++){
            for(int b = 1; b < 100; b++){
                    int sum = a * a + b * b;
                    List<int[]> sumList = sumMap.get(sum);
                    for(int[] combination: sumList){
                        list.add(new int[]{a, b, combination[0], combination[1]});
                    }
            }
        }
        return list;
    }
}

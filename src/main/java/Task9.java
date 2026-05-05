import java.util.ArrayList;
import java.util.List;

public class Task9 {

    // Task a
    // Calculates all 3-digit Armstrong numbers using the standard formula (x^3 + y^3 + z^3)
    List<Integer> calcArmstrongNumbers(){
        List<Integer> list = new ArrayList<>();
        for(int x = 1; x < 10; x++){
            for(int y = 1; y < 10; y++){
                for(int z = 1; z < 10; z++){
                    int sum = x * x * x + y * y * y + z * z * z;
                    int expected = x * 100 + y * 10 + z;
                    if(sum == expected){
                        list.add(sum);
                    }
                }
            }
        }
        return list;
    }

    // Task a (Bonus)
    // Iterates through all 3-digit combinations and checks them against a custom formula.
    @FunctionalInterface
    interface ArmstrongFormula {
        int calculate(int a, int b, int c);
    }

    private List<Integer> calcArmstrongNumbersBonus(ArmstrongFormula func){
        List<Integer> list = new ArrayList<>();
        for(int x = 1; x < 10; x++){
            for(int y = 1; y < 10; y++){
                for(int z = 1; z < 10; z++){
                    int sum = func.calculate(x, y, z);
                    int expected = x * 100 + y * 10 + z;
                    if(sum == expected){
                        list.add(sum);
                    }
                }
            }
        }
        return list;
    }

    List<Integer> calcArmstrongNumbersFirstFormula(){
        ArmstrongFormula func = (x, y, z)
                -> x * x * x + y * y * y + z * z * z;
        return calcArmstrongNumbersBonus(func);
    }

    List<Integer> calcArmstrongNumbersSecondFormula(){
        ArmstrongFormula func = (x, y, z)
                -> x + y * y + z * z * z;
        return calcArmstrongNumbersBonus(func);
    }

    List<Integer> calcArmstrongNumbersThirdFormula(){
        ArmstrongFormula func = (x, y, z)
                -> x * x * x + y * y + z;
        return calcArmstrongNumbersBonus(func);
    }
}

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {
    private static Task9 task;
    private static List<Integer> armstrongNumbers;
    private static List<Integer> armstrongNumbersFirstFormula;
    private static List<Integer> armstrongNumbersSecondFormula;
    private static List<Integer> armstrongNumbersThirdFormula;


    @BeforeAll
    static void setUp() {
        task = new Task9();
        armstrongNumbers = task.calcArmstrongNumbers();
        armstrongNumbersFirstFormula = task.calcArmstrongNumbersFirstFormula();
        armstrongNumbersSecondFormula = task.calcArmstrongNumbersSecondFormula();
        armstrongNumbersThirdFormula = task.calcArmstrongNumbersThirdFormula();
    }

    @Test
    void checkArmstrongNumbersLength(){
        assertEquals(2, armstrongNumbers.size());
    }

    @Test
    void checkArmstrongNumbers(){
        List<Integer> expected = List.of(153, 371);
        assertIterableEquals(expected, armstrongNumbers);
    }

    @Test
    void checkArmstrongNumbersFirstFormulaLength(){
        assertEquals(2, armstrongNumbersFirstFormula.size());
    }

    @Test
    void checkArmstrongNumbersFirstFormula(){
        List<Integer> expected = List.of(153, 371);
        assertIterableEquals(expected, armstrongNumbersFirstFormula);
    }

    @Test
    void checkArmstrongNumbersSecondFormulaLength(){
        assertEquals(4, armstrongNumbersSecondFormula.size());
    }

    @Test
    void checkArmstrongNumbersSecondFormula(){
        List<Integer> expected = List.of(135, 175, 518, 598);
        assertIterableEquals(expected, armstrongNumbersSecondFormula);
    }

    @Test
    void checkArmstrongNumbersThirdFormulaLength(){
        assertEquals(0, armstrongNumbersThirdFormula.size());
    }

    @Test
    void checkArmstrongNumbersThirdFormula(){
        List<Integer> expected = List.of();
        assertIterableEquals(expected, armstrongNumbersThirdFormula);
    }
}
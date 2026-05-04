import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {
    private static Task8 task;
    private static List<int[]> pythagoreanTriples;
    private static List<int[]> efficientPythagoreanTriples;
    private static List<int[]> equalSquareSums;
    private static List<int[]> efficientEqualSquareSums;

    @BeforeAll
    static void setUp() {
        task = new Task8();
        pythagoreanTriples = task.calcPythagoreanTriples();
        efficientPythagoreanTriples = task.calcEfficientPythagoreanTriples();
        equalSquareSums = task.calcEqualSquareSums();
        efficientEqualSquareSums = task.calcEfficientEqualSquareSums();
    }

    @Test
    void checkPythagoreanTriplesLength(){
        assertEquals(100, pythagoreanTriples.size());
    }

    @Test
    void checkPythagoreanTriples(){
        boolean check = true;
        for(int[] array: pythagoreanTriples){
            int a = array[0];
            int b = array[1];
            int c = array[2];

            if (a * a + b * b != c * c){
                check = false;
                break;
            }
        }

        assertTrue(check);
    }

    @Test
    void checkEfficientPythagoreanTriplesLength(){
        assertEquals(100, efficientPythagoreanTriples.size());
    }

    @Test
    void checkEfficientPythagoreanTriples(){
        boolean check = true;
        for(int[] array: efficientPythagoreanTriples){
            int a = array[0];
            int b = array[1];
            int c = array[2];

            if (a * a + b * b != c * c){
                check = false;
                break;
            }
        }

        assertTrue(check);
    }


    @Test
    void checkEqualSquareSumsLength(){
        assertEquals(32955, equalSquareSums.size());
    }

    @Test
    void checkEqualSquareSums(){
        boolean check = true;
        for(int[] array: equalSquareSums){
            int a = array[0];
            int b = array[1];
            int c = array[2];
            int d = array[3];

            if (a * a + b * b != c * c + d * d){
                check = false;
                break;
            }
        }

        assertTrue(check);
    }


    @Test
    void checkEfficientEqualSquareSumsLength(){
        assertEquals(32955, efficientEqualSquareSums.size());
    }

    @Test
    void checkEfficientEqualSquareSums(){
        boolean check = true;
        for(int[] array: efficientEqualSquareSums){
            int a = array[0];
            int b = array[1];
            int c = array[2];
            int d = array[3];

            if (a * a + b * b != c * c + d * d){
                check = false;
                break;
            }
        }

        assertTrue(check);
    }

}
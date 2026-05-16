import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task23Test {

    @ParameterizedTest
    @MethodSource("getValues")
    void testCalcPermutations(String text, Set<String> expected){
        Task23 task = new Task23();
        assertEquals(expected, task.calcPermutations(text));
    }

    static Stream<Arguments> getValues(){
        return Stream.of(
                Arguments.of("A", Set.of("A")),
                Arguments.of("AA", Set.of("AA")),
                Arguments.of("AB", Set.of("AB", "BA")),
                Arguments.of("ABC", Set.of("ABC", "BAC", "ACB", "CAB", "CBA", "BCA")),
                Arguments.of("AAC", Set.of("AAC", "ACA", "CAA"))
        );
    }
}
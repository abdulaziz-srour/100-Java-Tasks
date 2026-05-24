import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task40Test {

    @ParameterizedTest
    @MethodSource("getValidValues")
    void testStrToLong_ValidInputs(String text, long expected){
        Task40 task = new Task40();
        assertEquals(expected, task.strToLong(text));
    }


    static Stream<Arguments> getValidValues(){
        return Stream.of(
                Arguments.of("+123", 123),
                Arguments.of("-123", -123),
                Arguments.of("7271", 7271),
                Arguments.of("0123", 83),
                Arguments.of("-0123", -83)
        );
    }

    @ParameterizedTest
    @CsvSource({"ABC", "0128"})
    void testStrToLong_ThrowsException(String text){
        Task40 task = new Task40();
        assertThrows(IllegalArgumentException.class, () ->
                task.strToLong(text));
    }
}
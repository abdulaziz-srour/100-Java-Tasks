import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task32Test {
    private Task32 task;
    @BeforeEach
    void setUp(){
        task = new Task32();
    }

    @ParameterizedTest
    @CsvSource({"this is a very special title, This Is A Very Special Title",
            "effective java is great, Effective Java Is Great"})
    void testCapitalize(String text, String expected){
        assertEquals(expected, task.capitalize(text));
    }

    @ParameterizedTest
    @MethodSource("getValuesCapitalizeList")
    void testCapitalizeList(List<String> words, List<String> expected){
        assertEquals(expected, task.capitalize(words));
    }

    static Stream<Arguments> getValuesCapitalizeList(){
        return Stream.of(
                Arguments.of(List.of("this", "is", "a", "title"), List.of("This", "Is", "A", "Title"))
        );
    }

    @ParameterizedTest
    @MethodSource("getValuesCapitalizeSpecial")
    void testCapitalizeSpecial(List<String> words, List<String> exceptions, List<String> expected){
        assertEquals(expected, task.capitalizeSpecial(words, exceptions));
    }

    static Stream<Arguments> getValuesCapitalizeSpecial(){
        return Stream.of(
                Arguments.of(List.of("this", "is", "a", "title"), List.of("is", "a"), List.of("This", "is", "a", "Title"))
        );
    }

}
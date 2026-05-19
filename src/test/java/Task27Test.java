import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task27Test {
    private Task27 task;

    @BeforeEach
    void setUp(){
        task = new Task27();
    }

    @ParameterizedTest
    @MethodSource("getValues")
    void testJoin(List<String> words, String delimiter, String expected){
        assertEquals(expected, task.join(words, delimiter));
    }

    @ParameterizedTest
    @MethodSource("getValues")
    void testJoinStrings(List<String> words, String delimiter, String expected){
        assertEquals(expected, task.joinStrings(words, delimiter));
    }

    static Stream<Arguments> getValues(){
        return Stream.of(
                Arguments.of(List.of("hello", "world", "message"), " +++ ", "hello +++ world +++ message"),
                Arguments.of(List.of("Micha", "Zürich"), " likes ", "Micha likes Zürich")
        );
    }
}
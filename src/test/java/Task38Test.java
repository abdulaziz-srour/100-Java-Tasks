import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task38Test {

    @ParameterizedTest
    @CsvSource({
            "1:0, Micha, Tim, Fifteen Love",
            "2:2, Micha, Tim, Thirty Thirty",
            "2:3, Micha, Tim, Thirty Forty",
            "3:3, Micha, Tim, Deuce",
            "4:3, Micha, Tim, Advantage Micha",
            "4:4, Micha, Tim, Deuce",
            "5:4, Micha, Tim, Advantage Micha",
            "6:4, Micha, Tim, Game Micha",
    })
    void testTennisScore(String score, String pl1, String pl2, String expected){
        Task38 task = new Task38();
        assertEquals(expected, task.tennisscore(score, pl1, pl2));
    }

}
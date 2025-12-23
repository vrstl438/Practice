package Test_Practice;

import HomeTasks.Tests_Practice.CountWords;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class CountWordsTests {
    private CountWords countWords;

    @BeforeEach
    void preSet(){countWords = new CountWords();}

    @DisplayName("Позивтиные тесты") @ParameterizedTest @CsvSource({
            "'qw we rt', 3",
            "'qw wert', 2",
            "'qwwert', 1",
            "'qw we  rt 232', 4",
            "' ', 0",
            "'', 0",
            "'     ', 0"
    })
    void checkPositiveTests(String value, Integer expectedResult){
        assertEquals(expectedResult, countWords.countWords(value));
    }

    @DisplayName("при значение null") @Test
    void checkNullValue(){
        assertThrows(NullPointerException.class, () -> countWords.countWords(null));
    }
}

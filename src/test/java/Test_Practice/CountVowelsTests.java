package Test_Practice;

import HomeTasks.Tests_Practice.CountVowels;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class CountVowelsTests {
    private CountVowels countVowels;

    @BeforeEach
    void setUp(){
        countVowels = new CountVowels();
    }

    @DisplayName("Проверка позитивных сценариев") @ParameterizedTest @CsvSource({
            "'hello', 2", "'java', 2", "'AEIOU', 5",
            "'' , 0",
            "'qwrt', 0", "'sdvb', 0"

    })
    void chekForCountVowels(String word, int count){
        assertEquals(count, countVowels.countVowels(word));
    }

    @DisplayName("Проверка при значении null") @Test
    void chekForCountVowelsAtNullValue(){
        assertThrows(IllegalArgumentException.class, () -> {
            countVowels.countVowels(null);
        }, "Checking at null values should lead to IllegalArgumentException");
    }
}

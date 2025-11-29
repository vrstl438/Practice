package Test_Practice;

import Tests_Practice.StringReverse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class StringReverseTests {

    private StringReverse stringReverse;

    @BeforeEach
    void setUp(){
        stringReverse = new StringReverse();
    }

    @Nested
    class PositiveTests{
        @DisplayName("Позитивные сценарии") @ParameterizedTest
        @CsvSource({
                "'qwe', 'ewq'", "'poi', 'iop'", "'ilya', 'ayli'",
                "'12', '21'", "'0', '0'",
                "'',''", "' ', ' '"
        })
        void checkForStringReverse(String value, String reverseValue){
            assertEquals(reverseValue, stringReverse.reverse(value));
        }
    }


    @Nested
    class NullTests {
        @DisplayName("При передаче null") @Test
        void CheckForStringReverAtNullValue(){
            assertNull(stringReverse.reverse(null));
        }
    }



}
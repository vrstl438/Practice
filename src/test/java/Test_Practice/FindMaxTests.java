package Test_Practice;

import Tests_Practice.FindMax;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class FindMaxTests {
    private FindMax findMax;

    @BeforeEach
    void setUp(){
        findMax = new FindMax();
    }

    static Stream<Arguments> arraysProvider(){
        return Stream.of(
                Arguments.of(new int[]{3, 4, 7, 2}, 7),
                Arguments.of(new int[] {7}, 7),
                Arguments.of(new int[]{-7, -3, -5, -7}, -3),
                Arguments.of(new int[]{-7, -3, -5, 7}, 7)
        );
    }

    @DisplayName("Позитивные сценарии") @ParameterizedTest @MethodSource("arraysProvider")
    void CheckingFindMaxPositiveTests(int [] array, int expectedResult){
        assertEquals(expectedResult, findMax.findMax(array));
    }

    @DisplayName("Передача null") @Test
    void CheckFindMaxAtNull(){
        assertThrows(NullPointerException.class, () -> {
            findMax.findMax(null);
        }, "Cheking throws NullPointerException");
    }
}
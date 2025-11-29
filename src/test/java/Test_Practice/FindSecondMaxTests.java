package Test_Practice;

import Tests_Practice.FindSecondMax;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

public class FindSecondMaxTests {
    private FindSecondMax findSecondMax;

    @BeforeEach
    void preSet(){findSecondMax = new FindSecondMax();}

    static Stream<Arguments> arrays(){
        return Stream.of(
                Arguments.of(new int[] {1,2,3,4,5}, 4),
                Arguments.of(new int[] {1,2,3,89,90}, 89),
                Arguments.of(new int[] {1,2,3,121,90}, 90),
                Arguments.of(new int[] {1,2,3,821,5100}, 821),

                //дубли
                Arguments.of(new int[] {1, 832,821, 821 ,821}, 821),
                Arguments.of(new int[] {1,2,3,821,821}, 821)
        );
    }

    @DisplayName("Позивные тесты") @ParameterizedTest @MethodSource("arrays")
    void checkPositiveCasesForFindSecondMax(int [] array, int expectedResult){
        assertEquals(expectedResult, findSecondMax.findSecondMax(array));
    }

    @DisplayName("Проверка expetion") @Test
    void checkOneValueInArray (){
        assertThrows(IllegalArgumentException.class, () -> findSecondMax.findSecondMax(new int[] {1}));
    }
}

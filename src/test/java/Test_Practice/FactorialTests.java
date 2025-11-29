package Test_Practice;

import Tests_Practice.Factorial;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTests {
    private Factorial factorial;

    @BeforeEach
    void preSet(){
        factorial = new Factorial();
    }

    @DisplayName("Позитивные тесты") @ParameterizedTest @CsvSource({
            "0, 1", "1, 1", "5, 120", "7, 5040"
    })
    void checkPositiveCasesForValidFactorial(int value, int expected){
        assertEquals(expected, factorial.factorial(value), "неправильный факториал числа  -  " + value);
    }

    @DisplayName("Позитивные тесты") @ParameterizedTest @ValueSource(ints = {
            -1, -2, -1010, - 12121
    })
    void checkNegativeCasesForValidFactorial(int invalidValue){
        assertThrows(IllegalArgumentException.class, () -> factorial.factorial(invalidValue));
    }
}

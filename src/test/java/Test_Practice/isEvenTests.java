package Test_Practice;

import Tests_Practice.IsEven;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class isEvenTests {

    private IsEven isEven;

    @BeforeEach
    void setUp(){
        isEven = new IsEven();
    }

    @DisplayName("Позитивные тесты") @ParameterizedTest @ValueSource(ints = {
            2, 4, 56,
            -2, -4, -56,
            0
    })
    public void checkIsEvenPositive(int evenNum){
        boolean actualResult = isEven.isEven(evenNum);
        assertTrue(actualResult, "Число должно быть четным  " + evenNum);
    }


    @DisplayName("Негативные тесты") @ParameterizedTest @ValueSource(ints = {
            3, 5, 57,
            -3, -5, -57
    })
    public void checkIsEvenNegative(int evenNum){
        boolean actualResult = isEven.isEven(evenNum);
        assertFalse(actualResult);
    }
}

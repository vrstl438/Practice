import Tests_Practice.IsValidEmail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class IsValidEmailTests {
    private IsValidEmail isValidEmail;

    @BeforeEach
    void preSet(){isValidEmail = new IsValidEmail();}

    @DisplayName("Позитивные тесты, корректный email") @ParameterizedTest @ValueSource(strings = {
            "test@example.com", "bad@gmail.com"
    })
    void chekForValidEmail(String validEmail){
        assertTrue(isValidEmail.isValidEmail(validEmail), "email невалидный");
    }

    @DisplayName("Негативные тесты, некорректный email") @ParameterizedTest @ValueSource(strings = {
            "testexample.com", "bad@.com", "sqw@com", "@gmail.com"
    })
    void chekForNotValidEmail(String notValidEmail){
        assertFalse(isValidEmail.isValidEmail(notValidEmail), "email валидный");
    }

    @DisplayName("null cheker") @Test
    void chekForValueIsNull(){
        assertFalse(isValidEmail.isValidEmail(null));
    }
}

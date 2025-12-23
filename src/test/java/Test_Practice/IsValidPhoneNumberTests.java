package Test_Practice;

import HomeTasks.Tests_Practice.IsValidPhoneNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class IsValidPhoneNumberTests {
    private IsValidPhoneNumber isValidPhoneNumber;

    @BeforeEach
    void preSet(){isValidPhoneNumber = new IsValidPhoneNumber();}


    @DisplayName("Позитивные кейсы") @ParameterizedTest @ValueSource(strings = {
            "+1 1234567890", "+7 9762872323"
    })
    void checkValidPhone(String validPhone){
        assertTrue(isValidPhoneNumber.isValidPhoneNumber(validPhone));
    }

    @DisplayName("негативные кейсы") @ParameterizedTest @ValueSource(strings = {
            "1234", "dfwedw", "sdfsg1231", "+1 qwertyuiui"
    })
    void checkInvalidPhone(String invalidPhone){
        assertFalse(isValidPhoneNumber.isValidPhoneNumber(invalidPhone));
    }
}

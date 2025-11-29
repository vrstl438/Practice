import Final_HomeTasks.Task_2.UserValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


import static Final_HomeTasks.Task_2.UserValidator.validatingUser;
import static Final_HomeTasks.Task_2.UserValidator.nameValidator;
import static Final_HomeTasks.Task_2.UserValidator.ageValidator;
import static Final_HomeTasks.Task_2.UserValidator.emailValidator;


public class UserValidatorTests {
    @BeforeEach
    void activeFlag(){
        UserValidator.validationEnabledManager(true);
    }

    //nameValidator
    //проверка имени с большой буквы
    //проверка имени с маленькой буквы - ответ false
    //проверка одной буквы
    //передать null - ответ должен быть false
    //проверка на пустое имя - ответ должен быть false
    @DisplayName("Проверка метода nameValidator") @ParameterizedTest @CsvSource({
            "'A', true", "'QA', true","'Qa',true",
            "'a', false", "'qA', false", "'qa', false",
            "'', false", "' ', false"
    })
    void nameValidatorTests(String name, boolean expected){
        assertEquals(expected, nameValidator(name));
    }

    @DisplayName("Проверка метода nameValidator - при значении null") @Test
    void nameValidatorNullValue(){
        assertFalse(nameValidator(null));
    }

    //ageValidator
    //проверка передачи null, должна быть ошибка
    //проверка граничных значений 17,18,19. 99.100.101
    @DisplayName("Проверка метода - ageValidator") @ParameterizedTest @CsvSource({
            "18, true", "19, true", "99, true", "100, true",
            "17, false", "101, false",
            "0, false", "-29, false"
    })
    void ageValidatorTest(int age, boolean expected){
        assertEquals(expected, ageValidator(age));
    }

    //emailValidator
    //проверка на - null
    //спец.симолы до @
    //без @
    @DisplayName("Проверка метода - emailValidator") @ParameterizedTest
    @CsvSource({
            // Валидные
            "'test@example.com', true",
            "'a.b.c@domain.ru', true",
            "'user123@site.io', true",
            "'abc123@ab.co', true",
            "'name.surname@google.com', true",

            // Невалидные
            "'', false",
            "'test', false",
            "'@gmail.com', false",
            "'user@', false",
            "'user@domain', false",
            "'user@domain.c', false",
            "'User@domain.com', false",
            "'user@Domain.com', false",
            "'user@domain.c0m', false",
            "'user@@domain.com', false",
            "'user@domain..com', false",
            "'user@do main.com', false",
    })
    void emailValidatorTest(String email, boolean expected){
        assertEquals(expected, emailValidator(email));
    }

    @DisplayName("Проверка метода - emailValidator при значении null") @Test
    void emailValidatorNullValue(){
        assertFalse(emailValidator(null));
    }
}

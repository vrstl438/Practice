package Test_Practice;

import Tests_Practice.IsLeapYear;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

public class IsLeapYearTests {
    private IsLeapYear isLeapYear;

    @BeforeEach
    void preSet(){
        isLeapYear = new IsLeapYear();
    }

    @DisplayName("Невисокосные года") @ParameterizedTest @ValueSource(ints = {
            2023, 3223,2321,129,2014, 1900, 2100
    })
    void chekPositiveCasesIsNoteLeapYears(int testYear){
        assertFalse(isLeapYear.isLeapYear(testYear), "Указанный год должен быть невисокосным");
    }


    @DisplayName("Високосные года") @ParameterizedTest @ValueSource(ints = {
            2020, 2000, 1600
    })
    void chekPositiveCasesIsLeapYear(int testYear){
        assertTrue(isLeapYear.isLeapYear(testYear), "Указанный год должен быть високосным");
    }
}

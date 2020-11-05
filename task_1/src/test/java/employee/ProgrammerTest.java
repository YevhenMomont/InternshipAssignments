package employee;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class ProgrammerTest {

    private static final Integer PROGRAMMER_ID = 1;
    private static final String PROGRAMMER_FIRST_NAME = "Eugene";
    private static final String PROGRAMMER_LAST_NAME = "Momont";
    private static final Integer PROGRAMMER_WORKED_HOURS = 100;
    private static final BigDecimal PROGRAMMER_SALARY = BigDecimal.valueOf(3000);
    private static final BigDecimal EXPECTED_VALUE = BigDecimal.valueOf(1875).setScale(2,RoundingMode.FLOOR);

    @Test
    void getPercentWorkedTime() {
        Programmer programmer = Programmer.builder()
                .id(PROGRAMMER_ID)
                .firstName(PROGRAMMER_FIRST_NAME)
                .lastName(PROGRAMMER_LAST_NAME)
                .workedHours(PROGRAMMER_WORKED_HOURS)
                .salary(PROGRAMMER_SALARY)
                .build();

        assertEquals(BigDecimal.valueOf(0.625), programmer.getPercentWorkedTime());
    }

    @Test
    void getMonthlySalary() {
        Programmer programmer = Programmer.builder()
                .id(PROGRAMMER_ID)
                .firstName(PROGRAMMER_FIRST_NAME)
                .lastName(PROGRAMMER_LAST_NAME)
                .workedHours(PROGRAMMER_WORKED_HOURS)
                .salary(PROGRAMMER_SALARY)
                .build();

        assertEquals(EXPECTED_VALUE, programmer.getMonthlySalary());
    }
}
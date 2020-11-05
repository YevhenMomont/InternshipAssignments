package employee;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    private static final Integer MANAGER_ID = 2;
    private static final String MANAGER_FIRST_NAME = "Eugene";
    private static final String MANAGER_LAST_NAME = "Moments";
    private static final Integer MANAGER_WORKED_HOURS = 125;
    private static final Integer MANAGER_OVERWORKED_TIME = 160;
    private static final BigDecimal MANAGER_SALARY = BigDecimal.valueOf(4500);
    private static final BigDecimal EXPECTED_VALUE = BigDecimal.valueOf(3515).setScale(2, RoundingMode.FLOOR);


    @Test
    void getPercentWorkedTime() {
        Manager manager = Manager.builder()
                .id(MANAGER_ID)
                .firstName(MANAGER_FIRST_NAME)
                .lastName(MANAGER_LAST_NAME)
                .workedHours(MANAGER_WORKED_HOURS)
                .salary(MANAGER_SALARY)
                .build();

        assertEquals(BigDecimal.valueOf(0.78125), manager.getPercentWorkedTime());
    }

    @Test
    void getMonthlySalary() {
        Manager manager = Manager.builder()
                .id(MANAGER_ID)
                .firstName(MANAGER_FIRST_NAME)
                .lastName(MANAGER_LAST_NAME)
                .workedHours(MANAGER_WORKED_HOURS)
                .salary(MANAGER_SALARY)
                .build();

        assertEquals(EXPECTED_VALUE, manager.getMonthlySalary());
    }
}
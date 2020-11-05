import employee.Employee;
import employee.Manager;
import employee.Programmer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

class AccountantTest {

    private static final Integer PROGRAMMER_ID = 1;
    private static final String PROGRAMMER_FIRST_NAME = "Eugene";
    private static final String PROGRAMMER_LAST_NAME = "Momont";
    private static final Integer PROGRAMMER_WORKED_HOURS = 100;
    private static final BigDecimal PROGRAMMER_SALARY = BigDecimal.valueOf(3000);

    private static final Integer MANAGER_ID = 2;
    private static final String MANAGER_FIRST_NAME = "Eugene";
    private static final String MANAGER_LAST_NAME = "Moments";
    private static final Integer MANAGER_WORKED_HOURS = 125;
    private static final Integer MANAGER_OVERWORKED_TIME = 160;
    private static final BigDecimal MANAGER_SALARY = BigDecimal.valueOf(4500);

    private static final BigDecimal EXPECTED_VALUE = BigDecimal.valueOf(5390).setScale(2, RoundingMode.FLOOR);
    private static final BigDecimal EXPECTED_VALUE2 = BigDecimal.valueOf(6375, 2);



    @Test
    void calculateTheEntireSalary() {
        Programmer programmer = Programmer.builder()
                .id(PROGRAMMER_ID)
                .firstName(PROGRAMMER_FIRST_NAME)
                .lastName(PROGRAMMER_LAST_NAME)
                .workedHours(PROGRAMMER_WORKED_HOURS)
                .salary(PROGRAMMER_SALARY)
                .build();

        Manager manager = Manager.builder()
                .id(MANAGER_ID)
                .firstName(MANAGER_FIRST_NAME)
                .lastName(MANAGER_LAST_NAME)
                .workedHours(MANAGER_WORKED_HOURS)
                .salary(MANAGER_SALARY)
                .build();

        List<Employee> employees = List.of(programmer, manager);


        assertEquals(EXPECTED_VALUE, Accountant.calculateTheEntireSalary(employees));

//        manager.setWorkedHours(MANAGER_OVERWORKED_TIME);

//        assertEquals(EXPECTED_VALUE2, Accountant.calculateTheEntireSalary(employees).setScale(2, RoundingMode.FLOOR));
    }
}
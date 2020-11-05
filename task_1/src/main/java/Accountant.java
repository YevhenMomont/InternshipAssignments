import employee.Employee;

import java.math.BigDecimal;
import java.util.List;

public class Accountant {

    public static BigDecimal calculateTheEntireSalary(List<Employee> employees) {
        return employees.stream().map(Employee::getMonthlySalary).reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}

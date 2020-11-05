package employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Getter
@Setter
@SuperBuilder
public abstract class Employee {

    protected static final BigDecimal WORKING_WEEK_RATE = BigDecimal.valueOf(160);

    private Integer id;
    private String firstName;
    private String lastName;
    private BigDecimal salary;
    private Integer workedHours;

    public abstract BigDecimal getPercentWorkedTime();

    public abstract BigDecimal getMonthlySalary();


}

package employee;

import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.math.RoundingMode;

@SuperBuilder
public class Programmer extends Employee {


    public BigDecimal getPercentWorkedTime() {
        return BigDecimal.valueOf(getWorkedHours()).divide(WORKING_WEEK_RATE);
    }

    public BigDecimal getMonthlySalary() {
        return (getSalary().divide(WORKING_WEEK_RATE, 2, RoundingMode.FLOOR)).multiply(BigDecimal.valueOf(getWorkedHours()));
    }
}

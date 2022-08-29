
import org.junit.Assert;
import org.junit.Test;
import task.Employee;
import java.time.LocalDate;
import java.util.List;
public class TestForTask {



    @Test
    public void testMonthResult(){
        //  System.out.println(employeeService.getEmployees());
        String expectedMonth=LocalDate.now().getMonth().toString();
        List<Employee> employeesBirthDateInCurrentMonth = Employee.getEmployeeBirthDateInCurrentMonth();

        for (Employee employee : employeesBirthDateInCurrentMonth) {
            Assert.assertEquals(expectedMonth.toLowerCase(), employee.getBirthDate().getMonth().toString().toLowerCase());
        }

        System.out.println("employeesBirthDateInCurrentMonth = " + employeesBirthDateInCurrentMonth);

    }
}

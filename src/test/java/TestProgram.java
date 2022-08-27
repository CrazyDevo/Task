import dto.Employee;
import dto.bootstrap.DataGenerator;
import implementation.EmployeeServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.EmployeeService;

import java.time.LocalDate;
import java.util.List;


public class TestProgram {
    EmployeeService employeeService=new EmployeeServiceImpl();
    @Before
    public void generateEmployee(){
        DataGenerator.generateEmployee();
    }


    @Test
    public void testAddMethod(){



        for (Employee employee : employeeService.getEmployees()) {
            System.out.println(employee);
        }
        int expectedResult = employeeService.getEmployees().size() + 1;
        Employee employee=new Employee(1L,"Adam", "Dev",LocalDate.of(1989, 1, 14));
        employeeService.add(employee);
       int actualResult= employeeService.getEmployees().size();

        Assert.assertEquals(expectedResult, actualResult);

    }
    @Test
    public void testMonthResult(){
        String expectedMonth="March";
        List<Employee> employeesBirthDateInMarch = employeeService.getEmployeeBirthDateInMonth(expectedMonth);

        for (Employee employee : employeesBirthDateInMarch) {
            Assert.assertEquals(expectedMonth.toLowerCase(), employee.getBirthDate().getMonth().toString().toLowerCase());
        }

    }
}

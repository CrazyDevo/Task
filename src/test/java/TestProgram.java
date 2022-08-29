import dto.Employee;
import bootstrap.DataGenerator;
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
      //  System.out.println(employeeService.getEmployees());
        String expectedMonth=LocalDate.now().getMonth().toString();
        List<Employee> employeesBirthDateInMarch = employeeService.getEmployeeBirthDateInMonth(expectedMonth);

        for (Employee employee : employeesBirthDateInMarch) {
            Assert.assertEquals(expectedMonth.toLowerCase(), employee.getBirthDate().getMonth().toString().toLowerCase());
        }

        System.out.println(employeesBirthDateInMarch);

    }

    @Test
    public void testDeleteMethod(){
        int expectedResult = employeeService.getEmployees().size()-1;
        System.out.println(employeeService.getEmployees());
        System.out.println("========================");
        employeeService.delete(2L);
        System.out.println(employeeService.getEmployees());
        int actualResult = employeeService.getEmployees().size();

        System.out.println("expectedResult = " + expectedResult);
        System.out.println("actualResult = " + actualResult);
        Assert.assertEquals(expectedResult, actualResult);

    }
}

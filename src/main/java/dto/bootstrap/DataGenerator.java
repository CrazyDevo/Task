package dto.bootstrap;

import com.github.javafaker.Faker;
import dto.Employee;
import implementation.EmployeeServiceImpl;
import service.EmployeeService;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class DataGenerator {
    public static void generateEmployee(){


            Employee employee=new Employee(1L,"Adam", "Dev",LocalDate.of(1989, 1, 14));
            Employee employee1=new Employee(2L,"Mike", "Dev",LocalDate.of(1989, 2, 14));
            Employee employee2=new Employee(3L,"Can", "Dev",LocalDate.of(1989, 1, 14));
            Employee employee3=new Employee(4L,"Savcı", "QA",LocalDate.of(1989, 10, 14));
            Employee employee4=new Employee(5L,"Mike", "QA",LocalDate.of(1989, 3, 14));
            Employee employee5=new Employee(6L,"Aslan", "QA",LocalDate.of(1989, 5, 14));
            Employee employee6=new Employee(7L,"Akif", "PO",LocalDate.of(1989, 8, 14));
            Employee employee7=new Employee(8L,"Akın", "PO",LocalDate.of(1989, 7, 14));
            Employee employee8=new Employee(9L,"Barry", "PO",LocalDate.of(1989, 7, 14));
            Employee employee9=new Employee(10L,"John", "SM",LocalDate.of(1989, 5, 14));
        Employee employee10=new Employee(11L,"Rabia", "PM",LocalDate.of(1989, 8, 9));

        EmployeeService employeeService=new EmployeeServiceImpl();
        employeeService.add(employee);
        employeeService.add(employee1);
        employeeService.add(employee2);
        employeeService.add(employee3);
        employeeService.add(employee4);
        employeeService.add(employee5);
        employeeService.add(employee6);
        employeeService.add(employee7);
        employeeService.add(employee8);
        employeeService.add(employee9);
        employeeService.add(employee10);

        }



    }


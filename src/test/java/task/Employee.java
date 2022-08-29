package task;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
public class Employee {
    private Long id;
    private String name;
    private String jobTitle;
    private LocalDate birthDate;
   static List<Employee> employees=new ArrayList<>();
    public static List<Employee> getEmployeeBirthDateInCurrentMonth() {
        Employee employee=new Employee(1L,"Fatih", "Dev", LocalDate.of(1989, 8, 14));
        Employee employee1=new Employee(2L,"Mike", "Dev",LocalDate.of(1989, 2, 14));
        Employee employee2=new Employee(3L,"Can", "Dev",LocalDate.of(1989, 1, 14));
        Employee employee3=new Employee(4L,"Savcı", "QA",LocalDate.of(1989, 10, 14));

        employees.add(employee);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);




        List<Employee> result=new ArrayList<>();

        for (Employee emp : employees) {
            if (emp.getBirthDate().getMonth().toString().equalsIgnoreCase(LocalDate.now().getMonth().toString()))
                result.add(employee);
        }
        return result;
    }

}

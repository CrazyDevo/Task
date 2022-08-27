package implementation;

import dto.Employee;
import service.EmployeeService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    static List<Employee> employees = new ArrayList<>();


    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void delete(Employee employee) {
        employees.removeIf(e -> e.getId() == employee.getId());
    }

    @Override
    public void delete(Long id) {
        employees.removeIf(e -> e.getId() == id);
    }

    @Override
    public List<Employee> getEmployeeBirthDateInMonth(String month) {
      List<Employee> result=new ArrayList<>();

        for (Employee employee : employees) {
            if (employee.getBirthDate().getMonth().toString().equalsIgnoreCase(month))
                result.add(employee);
        }
        return result;
    }



    @Override
    public List<Employee> getEmployeeWithName(String name) {
        List<Employee> result=new ArrayList<>();

        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name))
                result.add(employee);
        }
        return result;
    }

    @Override
    public List<Employee> getEmployees() {
        return employees;
    }
}

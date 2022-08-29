package service;

import dto.Employee;

import java.util.List;

public interface EmployeeService {
   void add(Employee employee);
   void delete(Employee employee);
   void delete(Long id);
   List<Employee> getEmployeeBirthDateInMonth(String month);
   List<Employee> getEmployeeWithName(String name);
   List<Employee> getEmployees();



}

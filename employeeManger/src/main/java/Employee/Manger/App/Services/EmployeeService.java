package Employee.Manger.App.Services;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Employee.Manger.App.Repository.EmployeeRepository;
import Employee.Manger.App.exception.UserNotFoundException;
import Employee.Manger.App.model.Employee;

@Service
public class EmployeeService {
@Autowired
   private final EmployeeRepository employeeRepository;
 
   
   public EmployeeService(EmployeeRepository employeeRepository) {
      this.employeeRepository=employeeRepository;
   }
   
   public Employee addEmployee(Employee employee) {
	   employee.setEmployeeCode(UUID.randomUUID().toString());
	return employeeRepository.save(employee);
	   
   }
   
   public List<Employee> findAllEmployees(){
	   return employeeRepository.findAll();
   }
   
   
   public Employee updateEmployee(Employee employee) {
	   return employeeRepository.save(employee);
   }
   
   public Employee findEmployeeById(Long id)  {
	   return employeeRepository.findEmployeeById(id)
			   .orElseThrow(() ->new UserNotFoundException("user id" +id+ " was Not Found "));
   }
   
   public void deleteEmployee(Long id) {
  employeeRepository.deleteEmployeeById(id);
	
   }
}
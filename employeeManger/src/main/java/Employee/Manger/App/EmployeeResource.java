package Employee.Manger.App;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Employee.Manger.App.Services.EmployeeService;
import Employee.Manger.App.model.Employee;

@RestController
@Transactional
@RequestMapping("/employee")
public class EmployeeResource {
@Autowired
private final EmployeeService employeeService;
public EmployeeResource(EmployeeService employeeService) {
	this.employeeService=employeeService;
}
@GetMapping("/all")
public ResponseEntity<List<Employee>> getAllEmployees(){
	List<Employee> employees=employeeService.findAllEmployees();
	return new ResponseEntity<>(employees,HttpStatus.OK);
}
@GetMapping("/find/{id}")
public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id){
	Employee employee=employeeService.findEmployeeById(id);
	return new ResponseEntity<>(employee,HttpStatus.OK);
}
@PostMapping("/add")
public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
	Employee newEmployee=employeeService.addEmployee(employee);
	return new ResponseEntity<>(newEmployee,HttpStatus.CREATED);
}

@PutMapping("/update")
public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee){
	Employee updateemployee=employeeService.updateEmployee(employee);
	return new ResponseEntity<>(updateemployee,HttpStatus.OK);
	
}
@DeleteMapping("/delete/{id}")
public ResponseEntity<?>  deleteEmployee(@PathVariable("id") Long id){
      employeeService.deleteEmployee(id);
	return new ResponseEntity<>(HttpStatus.OK);
}
}

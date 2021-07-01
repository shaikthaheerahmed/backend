package Employee.Manger.App.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Employee.Manger.App.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

	

	Optional<Employee> findEmployeeById(Long id);

    void deleteEmployeeById(Long id);

}

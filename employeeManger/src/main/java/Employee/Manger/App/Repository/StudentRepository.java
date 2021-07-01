package Employee.Manger.App.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Employee.Manger.App.model.Student;



public interface StudentRepository extends JpaRepository<Student, Long> {
	Optional<Student> findStudentById(Long id);

    void deleteStudentById(Long id);
}

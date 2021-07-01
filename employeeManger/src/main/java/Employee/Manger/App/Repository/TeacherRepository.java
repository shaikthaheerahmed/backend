package Employee.Manger.App.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Employee.Manger.App.model.Employee;
import Employee.Manger.App.model.Teacher;


@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {

	Optional<Teacher> findTeacherById(Long id);

	void deleteTeacherById(Long id);




}

package Employee.Manger.App.Services;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Employee.Manger.App.Repository.TeacherRepository;
import Employee.Manger.App.exception.UserNotFoundException;
import Employee.Manger.App.model.Teacher;


@Service
public class TeacherService {
@Autowired
   private final TeacherRepository  teacherRepository;
 
   
   public TeacherService(TeacherRepository teacherRepository) {
      this.teacherRepository=teacherRepository;
   }
   
   public Teacher addTeacher(Teacher teacher) {
	   teacher.setEmployeeCode(UUID.randomUUID().toString());
	return teacherRepository.save(teacher);
	   
   }
   
   public List<Teacher> findAllTeachers(){
	   return teacherRepository.findAll();
   }
   
   
   public Teacher updateTeacher(Teacher teacher) {
	   return teacherRepository.save(teacher);
   }
   
   public Teacher findTeacherById(Long id)  {
	   return teacherRepository.findTeacherById(id)
			   .orElseThrow(() ->new UserNotFoundException("user id" +id+ " was Not Found "));
   }
   
   public void deleteTeacher(Long id) {
  teacherRepository.deleteTeacherById(id);
	
   }
}
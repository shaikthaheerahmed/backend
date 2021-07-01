package Employee.Manger.App.Services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Employee.Manger.App.Repository.StudentRepository;
import Employee.Manger.App.exception.UserNotFoundException;
import Employee.Manger.App.model.Student;



@Service

public class StudentService {
	@Autowired
	   private final StudentRepository studentRepository;
	 
	   
	   public StudentService(StudentRepository studentRepository) {
	      this.studentRepository=studentRepository;
	   }
	   
	   public Student addStudent(Student student) {
		   student.setStudentCode(UUID.randomUUID().toString());
		return studentRepository.save(student);
		   
	   }
	   
	   public List<Student> findAllStudents(){
		   return studentRepository.findAll();
	   }
	   
	   
	  
	   
	   public Student findStudentById(Long id)  {
		   return studentRepository.findStudentById(id)
				   .orElseThrow(() ->new UserNotFoundException("user id" +id+ " was Not Found "));
	   }
	   
	   public void deleteStudent(Long id) {
	  studentRepository.deleteStudentById(id);
		
	   }

	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}



	}


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

import Employee.Manger.App.Services.StudentService;
import Employee.Manger.App.model.Student;

@RestController
@Transactional
@RequestMapping("/student")
public class StudentResource {
	@Autowired
	private final StudentService studentService;
	public StudentResource(StudentService studentService) {
		this.studentService=studentService;
	}
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> students=studentService.findAllStudents();
		return new ResponseEntity<>(students,HttpStatus.OK);
	}
	@GetMapping("/find/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") Long id){
		Student student=studentService.findStudentById(id);
		return new ResponseEntity<>(student,HttpStatus.OK);
	}
	@PostMapping("/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		Student newStudent=studentService.addStudent(student);
		return new ResponseEntity<>(newStudent,HttpStatus.CREATED);
	}

	@PutMapping("/update")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student){
		Student updatestudent=studentService.updateStudent(student);
		return new ResponseEntity<>(updatestudent,HttpStatus.OK);
		
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?>  deleteStudent(@PathVariable("id") Long id){
	      studentService.deleteStudent(id);
		return new ResponseEntity<>(HttpStatus.OK);
}
}
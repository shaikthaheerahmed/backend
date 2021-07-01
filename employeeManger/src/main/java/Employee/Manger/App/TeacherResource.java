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

import Employee.Manger.App.Services.TeacherService;
import Employee.Manger.App.model.Teacher;

@RestController
@Transactional
@RequestMapping("/teacher")
public class TeacherResource {
@Autowired
private final TeacherService teacherService;
public TeacherResource(TeacherService teacherService) {
	this.teacherService=teacherService;
}
@GetMapping("/all")
public ResponseEntity<List<Teacher>> getAllTeachers(){
	List<Teacher> teachers=teacherService.findAllTeachers();
	return new ResponseEntity<>(teachers,HttpStatus.OK);
}
@GetMapping("/find/{id}")
public ResponseEntity<Teacher> getTeacherById(@PathVariable("id") Long id){
	Teacher teacher=teacherService.findTeacherById(id);
	return new ResponseEntity<>(teacher,HttpStatus.OK);
}
@PostMapping("/add")
public ResponseEntity<Teacher> addTeacher(@RequestBody Teacher teacher){
	Teacher newTeacher=teacherService.addTeacher(teacher);
	return new ResponseEntity<>(newTeacher,HttpStatus.CREATED);
}

@PutMapping("/update")
public ResponseEntity<Teacher> updateTeacher(@RequestBody Teacher teacher){
	Teacher updateteacher=teacherService.updateTeacher(teacher);
	return new ResponseEntity<>(updateteacher,HttpStatus.OK);
	
}
@DeleteMapping("/delete/{id}")
public ResponseEntity<?>  deleteTeacher(@PathVariable("id") Long id){
      teacherService.deleteTeacher(id);
	return new ResponseEntity<>(HttpStatus.OK);
}
}

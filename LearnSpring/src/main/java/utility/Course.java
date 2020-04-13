package utility;

import org.springframework.beans.factory.annotation.Autowired;

import helloWorld.Student;

public class Course {

	
	public void setStudent(Student student) {
		this.student = student;
	}

	private Student student;
	
	
	
	public void register(Student student) {
		this.student = student;
	}
	
	public String getRegisterdStudents() {
		
		return this.student.getName();
	}



	public Student getStudent() {
		return student;
	}

	

	
}

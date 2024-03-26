package com.example.cruddemo;

import com.example.cruddemo.dao.StudentDAO;
import com.example.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner ->{
			// createStudent(studentDAO);

			createMultiStudent(studentDAO);

			// readStudent(StudentDao);

			//queryForStudents(studentDAO);

			//queryForStudentsByLastName(studentDAO);

			//updateStudent(studentDAO);

			//deleteStudent(studentDAO);

			//deleteAllStudents(studentDAO);

			//createStudent(studentDAO);
			//createMultiStudent(studentDAO);
			//readStudent(studentDAO);
		};
	}

	private void deleteAllStudents(StudentDAO studentDAO) {
		System.out.println("Deleting all students ");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted row count: " + numRowsDeleted);
	}

	/*private void deleteStudent(StudentDAO studentDAO) {
		int studentId =3;
		System.out.println("Deleting student id: " + studentId);
		studentDAO.delete(studentId);
	}

	/*private void updateStudent(StudentDAO studentDAO) {
		//retrieve student based on the id: primary key
		int studentId = 1;
		System.out.println("Getting student with id: " + studentId);
		Student myStudent = studentDAO.findById(studentId);

		//change first name to "Scobby"
		System.out.println("Updating student ...");
		myStudent.setFirstName("Scobby");

		//update the stundet
		studentDAO.update(myStudent);

		//display the updated
		System.out.println("Update student: " + myStudent);
	}

	/*private void queryForStudentsByLastName(StudentDAO studentDAO) {
		// get a list of students
		List<Student> theStudents = studentDAO.findByLastName("Duck");


		//display list of stutends
		for(Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {

		// get a list of students
		List<Student> theStudents = studentDAO.findAll();

		//display list of stutends
		for(Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
	}

	/*private void readStudent(StudentDAO studentDAO) {
		//create a student object
		System.out.println("Creating new Student object...");
		Student tempStudent = new Student("Daffy" , "Duck" , "daffyduck@gmail.com" );

		//save the student
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		//display id of the saved student
		int theId = tempStudent.getId();
		System.out.println("Saved student. Generated id:"  + theId);

		//retrieve student based on the id: primary key
		System.out.println("Retrieving student with id: " + theId + " Name:" + tempStudent.getFirstName());
		Student myStudent = studentDAO.findById(theId);

		//display student
		System.out.println("Found the student:" + myStudent);

	}*/

	private void createMultiStudent(StudentDAO studentDAO) {
		//CREATE THE Multi STUDENT OBJECT
		System.out.println("Creating 3 student object ...");
		Student tempStudent1 = new Student("Jhon" , "Doe", "Jhon6262@gmail.com" );
		Student tempStudent2 = new Student("Hans" , "Tyson", "Mike23@gmail.com" );
		Student tempStudent3 = new Student("Adam" , "Ali", "beAdam010@gmail.com" );

		//SAVE THE Multi STUDENT OBJECT
		System.out.println("Save the student ...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

		//DISPLAY ID OF THE SAVED STUDENT
		System.out.println("Save student. Generated id: " + tempStudent1.getId());
		System.out.println("Save student. Generated id: " + tempStudent2.getId());
		System.out.println("Save student. Generated id: " + tempStudent3.getId());
	}

	/*private void createStudent(StudentDAO studentDAO){

		//CREATE THE STUDENT OBJECT
		System.out.println("Creating new student object ...");
		Student tempStudent = new Student("Paul" , "Doe", "paul6262@gmail.com" );

		//SAVE THE STUDENT OBJECT
		System.out.println("Save the student ...");
		studentDAO.save(tempStudent);

		//DISPLAY ID OF THE SAVED STUDENT
		System.out.println("Save student. Generated id: " + tempStudent.getId());
	}*/


}

package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student;

public class App {
	public static void main(String[] args) {
//		System.out.println("my programm started");
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		// insert
//		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
////
//		String query = "insert into student values(?,?,?) ";
//		int result = template.update(query,35,"Vishal","Gorakhpur");
//		System.out.println("Number of records inserted...."+result);
		// StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
//	Student student =new Student();
//	student.setId(666);
//	student.setName("john");
//	student.setCity("Lucknow");
//	int result = studentDao.insert(student);
//	System.out.println("Student added "+result);
		// update
//		Student student = new Student();
//		student.setId(356);
//		student.setName("RAjkumar");
//		student.setCity("Bettiah");
//	   int result = studentDao.change(student);
//		System.out.println("changed data is "+result);
//		delete
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter existing id");
//		int id = sc.nextInt();
//		int result = studentDao.delete(id);
//		System.out.println("Deleted "+result);
		// fetch data
//		Scanner sc= new Scanner(System.in);
//         System.out.println("Enter existing id");
//         int id = sc.nextInt();
//	Student student = studentDao.getStudent(id);
//	System.out.println(student);	

//		List<Student> styList = studentDao.getAllStudents();
//		for(Student s:styList) {
//			System.out.println(s);
//		}

		ApplicationContext context = new AnnotationConfigApplicationContext(jdbcConfig.class);
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		Student student = new Student();
		student.setId(4);
		student.setName("Deepak");
		student.setCity("Bihar");
		int result = studentDao.insert(student);
		System.out.println("student added " + result);

		List<Student> styList = studentDao.getAllStudents();
		for (Student s : styList) {
			System.out.println(s);
		}

	}
}

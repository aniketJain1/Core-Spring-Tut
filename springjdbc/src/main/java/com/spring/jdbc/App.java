package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("My program started...");

		// spring jdbc => JdbcTemplate
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");

//        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

		// insert query
//        String query = "insert into student(id,name,city) values(?,?,?)";

		// fire query
//        int result = template.update(query,502,"jain","kanpur");

//        System.out.println("Number of record inserted.. " + result);

		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		// INSERT
//        Student student= new Student();
//        student.setId(503);
//        student.setName("Sumit jain");
//        student.setCity("Delhi");
//        
//        int result = studentDao.insert(student);
//        
//        System.out.println("student added : "+result);

		// UPDATE
//        Student student = new Student();
//        student.setId(102);
//        student.setName("Ambani");
//        student.setCity("Bombay");
//        
//        int result = studentDao.change(student);
//        System.out.println("Data change... " + result);

//        DELETE
//		int result = studentDao.delete(503);
//		System.out.println("Data deleted..." + result);
		
		// Sel
		Student student = studentDao.getStudent(501);
		System.out.println(student);

	}
}

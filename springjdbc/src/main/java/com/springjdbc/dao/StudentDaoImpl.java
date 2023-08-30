package com.springjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springjdbc.entities.Student;
@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		String query = "insert into student values(?,?,?) ";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}

	@Override
	public int change(Student student) {

		String query = "update student set name=?,city=? where id=?";
		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());

		return r;
	}

	@Override
	public int delete(int studentid) {
		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query, studentid);
		return 0;
	}

	@Override
	public Student getStudent(int studentid) {
		String query = "select * from student where id=?";
//		RowMapper<Student> rowMapper = new RowMapperimpl();

		Student student = this.jdbcTemplate.queryForObject(query, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setCity(rs.getString(3));

				return student;
			}

		}, studentid);
		return student;
	}

	@Override
	public List<Student> getAllStudents() {
	String query = "select * from student";	
	List<Student> students = this.jdbcTemplate.query(query, new RowMapperimpl());	
		return students;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	/*
	 * @Override public Student getStudent(int studentid) { String query =
	 * "select * from student where id=?"; RowMapper<Student> rowMapper = new
	 * RowMapperimpl();
	 * 
	 * Student student =
	 * this.jdbcTemplate.queryForObject(query,rowMapper,studentid); return student;
	 * }
	 * 
	 */

	
}

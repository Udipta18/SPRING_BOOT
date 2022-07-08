package com.smart.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;

import com.smart.model.Student;

public class StudentRowMapper implements org.springframework.jdbc.core.RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student st=new Student();
		st.setName(rs.getString("name"));
		st.setID(rs.getInt("ID"));
		st.setCollege(rs.getString("college"));
		
		
		return st;
	}

}

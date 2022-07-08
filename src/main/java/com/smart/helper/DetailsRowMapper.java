package com.smart.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.smart.model.Details;

public class DetailsRowMapper implements RowMapper<Details> {

	@Override
	public Details mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub

		Details details = new Details();
		details.setName(rs.getString("name"));
		details.setAddress(rs.getString("address"));
		details.setMarks(rs.getString("marks"));
		details.setRollNo(rs.getInt("rollNo"));
		return details;

	}

}

package com.smart.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.smart.helper.DetailsRowMapper;
import com.smart.model.Details;
import com.smart.service.DetailsService;

@Repository
public class DetailsDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Details createDetails(Details details) {
		String query = "insert into details(name,address,marks,rollNo) value(?,?,?,?)";
		int update = jdbcTemplate.update(query, details.getName(), details.getAddress(), details.getMarks(),
				details.getRollNo());
		System.out.println(update + "row effected");
		return details;

	}

	public List<Details> getAllDetails() {
		String query = "select * from details";
		List<Details> list = jdbcTemplate.query(query, new DetailsRowMapper());
		return list;
	}

	public Details updatedDetails(Details details, int rollNo) {
		String query = "update details set address=?,marks=? where rollNo=?";
		int update = jdbcTemplate.update(query, details.getAddress(), details.getMarks(), rollNo);
		System.out.println(update + "row effected");
		details.setRollNo(rollNo);
		return details;

	}
	
	public void deleteDetails(int rollNo) {
		String query="delete from details where rollNo=?";
		int update = jdbcTemplate.update(query, rollNo);
		System.out.println(update + "row effected");
	}
	
	public Details getDetailsByRollNo(int rollNo) {
		String query="select * from Details where rollNo=? ";
		Details details = jdbcTemplate.queryForObject(query, new DetailsRowMapper(), rollNo);
		return details;
	}
}

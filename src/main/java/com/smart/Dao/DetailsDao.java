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
		String query="insert into details(name,address,marks,rollNo) value(?,?,?,?)";
		int update = jdbcTemplate.update(query, details.getName(),details.getAddress(),details.getMarks(),details.getRollNo());
		System.out.println(update+"row effected");
		return details;
		
	}
	
	public List<Details> getAllDetails() {
		String query="select * from details";
		List<Details> list = jdbcTemplate.query(query, new DetailsRowMapper());
		return list;
	}
}

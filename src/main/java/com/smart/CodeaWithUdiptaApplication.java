package com.smart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.*;

@SpringBootApplication
public class CodeaWithUdiptaApplication   {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(CodeaWithUdiptaApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception { // TODO
	 * Auto-generated method stub System.out.println("Application started....");
	 * 
	 * String query="Select * from das";
	 * 
	 * List<Map<String, Object>> list = jdbcTemplate.queryForList(query);
	 * 
	 * list.forEach(row ->{ System.out.print(row.get("name")+"\t");
	 * System.out.print(row.get("ID")+"\t");
	 * System.out.print(row.get("college")+"\t");
	 * System.out.println("------------------------------------------");
	 * 
	 * });
	 * 
	 * }
	 */
}

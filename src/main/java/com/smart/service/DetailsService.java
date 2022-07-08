package com.smart.service;

import com.smart.model.Details;
import java.util.*;

public interface DetailsService {

	public Details createDetails(Details details);
	public List<Details> getAllDetails(); 
	public Details updateDetails(Details details,int rollNo);
	public void deleteDetails(int rollNo);
	
}

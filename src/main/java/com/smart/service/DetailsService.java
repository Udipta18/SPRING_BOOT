package com.smart.service;

import com.smart.model.Details;
import java.util.*;

public interface DetailsService {

	public Details createDetails(Details details);
	public List<Details> getAllDetails();
}

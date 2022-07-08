package com.smart.seviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.Dao.DetailsDao;
import com.smart.model.Details;
import com.smart.service.*;
@Service
public class DetailsServiceImpl implements DetailsService {
	
	@Autowired
	private DetailsDao detailsDao;

	@Override
	public Details createDetails(Details details) {
		// TODO Auto-generated method stub
		return detailsDao.createDetails(details);
	}

	@Override
	public List<Details> getAllDetails() {
		// TODO Auto-generated method stub
		return detailsDao.getAllDetails();
	}

}

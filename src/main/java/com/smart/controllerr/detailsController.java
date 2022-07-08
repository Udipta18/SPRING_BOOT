package com.smart.controllerr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smart.model.Details;
import com.smart.service.DetailsService;

@RestController
@RequestMapping("/details")
public class detailsController {

	@Autowired
	private DetailsService detailsService;
	
	@PostMapping("/")
	public Details createDetails( @RequestBody Details details) {
		Details createDetails = detailsService.createDetails(details);
		System.out.println("successfully created");
		return createDetails;
	}
	@GetMapping("/")
	public List<Details> getAllDetails(){
		List<Details> allDetails = detailsService.getAllDetails();
		System.out.println("successfully fetched");
		return allDetails;
	}
	@PutMapping("/{rollNo}")
	public Details updateDetails( @RequestBody Details details,@PathVariable int rollNo) {
		Details updateDetails = detailsService.updateDetails(details, rollNo);
		return updateDetails;
	}
	@DeleteMapping("/{rollNo}")
	public void deleteDetails(@PathVariable int rollNo) {
		detailsService.deleteDetails(rollNo);
		System.out.println("DELETED SUCCESSFULLY");
	}
}

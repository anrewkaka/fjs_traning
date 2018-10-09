package vn.fujinet.employee.presentation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import vn.fujinet.employee.infrastructure.repository.EmplopyeeRepository;
import vn.fujinet.employee.infrastructure.entity.EmployeeEntity;
@Controller		 // This means that this class is a Controller
@RequestMapping("/employeemanagerapi")
//public class EmployeeConrtroller{
public class EmployeeConrtroller implements ErrorController{

	private static final String PATH = "/error";

	@RequestMapping(PATH)
	public String error() {
	        return "Error handling";
	    }

	@Override
	public String getErrorPath() {
	        return PATH;
	    }
	
	@Autowired		// This means to get the Repository
					// Which is auto-generated by Spring, we will use it to handle the data
	private EmplopyeeRepository emplopyeeRepository;
	
//	@RequestMapping(value = "/employees/", method = RequestMethod.GET)
//	public ResponseEntity<List< EmployeeEntity>> listAllContact(){
//		List<EmployeeEntity> listContact= emplopyeeRepository.findAll();
//		
//	}
	

}

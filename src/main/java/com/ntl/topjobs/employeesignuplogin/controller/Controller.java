/**
 * 
 */
package com.ntl.topjobs.employeesignuplogin.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ntl.topjobs.employeesignuplogin.model.EmployerLoginDetails;
import com.ntl.topjobs.employeesignuplogin.model.EmployerSignupDetails;
//import com.ntl.topjobs.employeesignuplogin.service.EmployeeProxyService;
import com.ntl.topjobs.employeesignuplogin.service.ServiceClass;

/**
 * @author Training
 *
 */
@CrossOrigin(origins="http://localhost:4201",maxAge=3600)
@RestController
public class Controller {
	@Autowired
	ServiceClass serviceClass;
//	@Autowired 
	//EmployeeProxyService proxy;
	
	EmployerSignupDetails beanSignup;

	/**
	 * @param serviceClass
	 */
	public Controller(ServiceClass serviceClass) {
		super();
		this.serviceClass = serviceClass;
	}

	public Controller() {
		super();
		beanSignup = new EmployerSignupDetails();
	}

	@PostMapping("/employer/signup/emp")
	public EmployerSignupDetails signup(@RequestBody EmployerSignupDetails signupBean) {
		return (serviceClass.addEmployee(signupBean));

	}

	@GetMapping("/employer/login/emp/{id}/{password}")
	public Optional<EmployerLoginDetails> login(@PathVariable("id") String id, @PathVariable("password") String password) {
		Optional<EmployerLoginDetails> tempLogin;
		Optional<EmployerLoginDetails> temporaryLogin=serviceClass.getUser(id, password);
		//boolean res=true;
		//if (temporaryLogin!=null) {
			tempLogin=temporaryLogin;
			//res=true;
		//} else
			//tempLogin=null;
	return tempLogin;
	}

}

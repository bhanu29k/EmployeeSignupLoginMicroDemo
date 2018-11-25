/**
 * 
 */
package com.ntl.topjobs.employeesignuplogin.service;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntl.topjobs.employeesignuplogin.dao.Dao;
import com.ntl.topjobs.employeesignuplogin.dao.LoginDao;
import com.ntl.topjobs.employeesignuplogin.dao.SubscriptionDao;
import com.ntl.topjobs.employeesignuplogin.model.EmployerLoginDetails;
import com.ntl.topjobs.employeesignuplogin.model.EmployerSignupDetails;
import com.ntl.topjobs.employeesignuplogin.model.SubscriptionFeeDetails;

/**
 * @author Training
 *
 */
@Service
public class ServiceClass {
	
	@Autowired
	Dao dao;
	@Autowired
	LoginDao loginDao;
	@Autowired
	SubscriptionDao subscriptionDao; 
	
	EmployerLoginDetails loginBean;
	

	SubscriptionFeeDetails subscriptionFeeDetails; 
	
	
/**
	 * @param dao
	 */
	public ServiceClass(Dao dao,LoginDao loginDao) {
		super();
		this.dao = dao;
		this.loginDao=loginDao;
	}
	

/**
 * @param subscriptionDao
 */
public ServiceClass(SubscriptionDao subscriptionDao) {
	super();
	this.subscriptionDao = subscriptionDao;
}


/**
 * @param loginDao
 */
public ServiceClass(LoginDao loginDao) {
	super();
	this.loginDao = loginDao;
}


public ServiceClass() {
		super();
		
	}

public String generateEmpId(String firstName)
{
	Random randomNo=new Random();
	int x=1000+randomNo.nextInt(9000);
	 String str=Integer.toString(x);
	char[] a= {firstName.charAt(0),firstName.charAt(1),str.charAt(0),str.charAt(1),str.charAt(2),str.charAt(3)};
	return (new String(a));
}

public EmployerSignupDetails addEmployee(EmployerSignupDetails signupBean) {
	
	if(dao.findByEmailId(signupBean.getEmailId())==0)
	{
	loginBean=new EmployerLoginDetails();
	signupBean.setEmpId();
	loginBean.setEmailId(signupBean.getEmailId());
	loginBean.setEmpId(signupBean.getEmpId()); 
	loginBean.setPassword(signupBean.getPassword());
	loginDao.save(loginBean);
	return dao.save(signupBean);  
	}
	else return null;
}

public Optional<EmployerLoginDetails> getUser(String id,String password) {

	
	Optional<EmployerLoginDetails> temporaryLogin;
	Optional<EmployerLoginDetails> tempLogin=loginDao.findById(id);
	if(tempLogin.isPresent())
	{
	if(tempLogin.get().getPassword().equals(password))
	{
		temporaryLogin=tempLogin;
		
	}
	else temporaryLogin=null;
	}
	else temporaryLogin=null;
	return temporaryLogin;
}

public SubscriptionFeeDetails addFeeDetails(SubscriptionFeeDetails subscriptionFeeDetails) {
	/*
	
	subscriptionFeeDetail=new SubscriptionFeeDetails();
	subscriptionFeeDetail.setBankName(subscriptionFeeDetails.getBankName());
	subscriptionFeeDetails.setCardName(subscriptionFeeDetails.getCardName());
	subscriptionFeeDetails.setCardNo(subscriptionFeeDetails.getCardNo()); 
	subscriptionFeeDetails.setEmpId(subscriptionFeeDetails.getEmpId());
	subscriptionFeeDetails.setFee(subscriptionFeeDetails.getFee());	
	*/
	return subscriptionDao.save(subscriptionFeeDetails);  
	
}


}

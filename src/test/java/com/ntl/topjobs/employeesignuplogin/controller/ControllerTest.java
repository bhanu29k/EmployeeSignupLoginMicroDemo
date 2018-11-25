/**
 * 
 */
package com.ntl.topjobs.employeesignuplogin.controller;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.ntl.topjobs.employeesignuplogin.model.EmployerLoginDetails;
import com.ntl.topjobs.employeesignuplogin.model.EmployerSignupDetails;
import com.ntl.topjobs.employeesignuplogin.model.SubscriptionFeeDetails;
import com.ntl.topjobs.employeesignuplogin.service.ServiceClass;

/**
 * @author Training
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ControllerTest {

	@Mock
	ServiceClass serviceClass;
	Controller controller;
	EmployerSignupDetails signupBean;
	EmployerLoginDetails loginBean;
	SubscriptionFeeDetails subscriptionFeeDetail;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.ntl.topjobs.employeesignuplogin.controller.Controller#signup(com.ntl.topjobs.employeesignuplogin.model.EmployerSignupDetails)}.
	 */
	@Test
	public void testSignup() {
		signupBean=new EmployerSignupDetails();
		signupBean.setEmailId("bhanu29k@gmail.com");
		signupBean.setFirstName("Bhanu");
		signupBean.setEmpId();
		signupBean.setLastName("Khandelwal");
		signupBean.setGender("male");
		signupBean.setCountry("India");
		signupBean.setPassword("Bhanu@123");
	controller=new Controller(serviceClass);
	when(serviceClass.addEmployee(signupBean)).thenReturn(signupBean);
	assertEquals(signupBean.getEmailId(),controller.signup(signupBean).getEmailId());
	}

	/**
	 * Test method for {@link com.ntl.topjobs.employeesignuplogin.controller.Controller#login(java.lang.String, java.lang.String)}.
	 */
	@Test 
	public void testLogin() {
		loginBean=new EmployerLoginDetails();
		loginBean.setEmailId("bhanu29k@gmail.com");
		loginBean.setEmpId("bhanu29k");
		loginBean.setPassword("Bhanu@123");
		when(serviceClass.getUser("bhanu29k", "Bhanu@123")).thenReturn(Optional.of(loginBean));
		controller=new Controller(serviceClass);
		assertEquals("bhanu29k@gmail.com",controller.login("bhanu29k", "Bhanu@123").get().getEmailId());
		//assertEquals(null,controller.login("bhanu29k", "Bhanu@12").get().getEmailId());
		
	}

	@Test
	public void testPostFeeDetails()
	{
		subscriptionFeeDetail=new SubscriptionFeeDetails();
		subscriptionFeeDetail.setBankName("Sbi");
		subscriptionFeeDetail.setCardName("Debit");
		subscriptionFeeDetail.setFee("300");
		subscriptionFeeDetail.setCardNo("12345678");
		subscriptionFeeDetail.setEmpId("bhanu29k");	
		controller=new Controller(serviceClass);
		when(serviceClass.addFeeDetails(subscriptionFeeDetail)).thenReturn(subscriptionFeeDetail);
		assertEquals(subscriptionFeeDetail.getBankName(),controller.postFeeDetails(subscriptionFeeDetail).getBankName());
	}
	
	
}

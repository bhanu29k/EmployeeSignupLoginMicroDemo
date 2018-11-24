/**
 * 
 */
package com.ntl.topjobs.employeesignuplogin.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

import java.util.Optional;

import com.ntl.topjobs.employeesignuplogin.dao.Dao;
import com.ntl.topjobs.employeesignuplogin.dao.LoginDao;
import com.ntl.topjobs.employeesignuplogin.model.EmployerLoginDetails;
import com.ntl.topjobs.employeesignuplogin.model.EmployerSignupDetails;

/**
 * @author Training
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class ServiceClassTest {

	ServiceClass serviceClass;
	ServiceClass serviceClass1;
	
	EmployerSignupDetails signupBean;
	EmployerSignupDetails signupBeanTemp;	
	EmployerLoginDetails loginBean;
	@Mock
	Dao dao;
	
	@Mock
	LoginDao loginDao;
	
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
	 * Test method for {@link com.ntl.topjobs.employeesignuplogin.service.ServiceClass#addEmployee(com.ntl.topjobs.employeesignuplogin.model.EmployerSignupDetails)}.
	 */
	@Test
	public void testAddEmployee() {
		
		signupBean=new EmployerSignupDetails();
		signupBeanTemp=new EmployerSignupDetails();
		loginBean=new EmployerLoginDetails();
		signupBean.setEmailId("bhanu29k@gmail.com");
		signupBean.setFirstName("Bhanu");
		signupBean.setEmpId();
		signupBean.setLastName("Khandelwal");
		signupBean.setGender("male");
		signupBean.setCountry("India");
		signupBean.setPassword("Bhanu@123");
		loginBean.setEmailId(signupBean.getEmailId());
		loginBean.setPassword(signupBean.getPassword());
		loginBean.setEmpId(signupBean.getEmpId());
		
		signupBeanTemp.setEmailId("bhanu29k@gmail.com");
		signupBeanTemp.setFirstName("Bhanu");
		signupBeanTemp.setEmpId();
		signupBeanTemp.setLastName("Khandelwal");
		signupBeanTemp.setGender("male");
		signupBeanTemp.setCountry("India");
		signupBeanTemp.setPassword("Bhanu@123");
		
		when(loginDao.save(loginBean)).thenReturn(loginBean);
		when(dao.save(signupBean)).thenReturn(signupBean);
		when(dao.findByEmailId(signupBean.getEmailId())).thenReturn(0);	
		when(dao.findByEmailId(signupBeanTemp.getEmailId())).thenReturn(1);	
		serviceClass=new ServiceClass(dao,loginDao);
		assertEquals(signupBean.getEmailId(),serviceClass.addEmployee(signupBean).getEmailId());
		assertEquals(null,serviceClass.addEmployee(signupBeanTemp).getEmailId());
	}

	/**
	 * Test method for {@link com.ntl.topjobs.employeesignuplogin.service.ServiceClass#getUser(java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testGetUser() {
		loginBean=new EmployerLoginDetails();
		loginBean.setEmailId("bhanu29k@gmail.com");
		loginBean.setEmpId("bhanu29k");
		loginBean.setPassword("Bhanu@123");
		when(loginDao.findById(loginBean.getEmpId())).thenReturn(Optional.of(loginBean));
		serviceClass=new ServiceClass(loginDao);
		assertEquals("bhanu29k@gmail.com",serviceClass.getUser("bhanu29k", "Bhanu@123").get().getEmailId());
		assertEquals(null,serviceClass.getUser("bhanu29k", "Bhanu@12").get().getEmailId());
		assertEquals(null,serviceClass.getUser("bhanu29", "Bhanu@123").get().getEmailId());
		
	}

}

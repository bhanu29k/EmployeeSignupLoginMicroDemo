/**
 * 
 */
package com.ntl.topjobs.employeesignuplogin.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ntl.topjobs.employeesignuplogin.model.EmployerSignupDetails;

/**
 * @author Training
 *
 */
public class SignupBeanTest {

	EmployerSignupDetails signupBean;
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
	 * Test method for {@link com.ntl.topjobs.employeesignuplogin.model.EmployerSignupDetails#getFirstName()}.
	 */
	@Test
	public void testGetFirstName() {
	signupBean=new EmployerSignupDetails();
	signupBean.setFirstName("Bhanu");
	assertEquals("Bhanu",signupBean.getFirstName());
	}

	/**
	 * Test method for {@link com.ntl.topjobs.employeesignuplogin.model.EmployerSignupDetails#getlastName()}.
	 */
	@Test
	public void testGetlastName() {
		signupBean=new EmployerSignupDetails();
		signupBean.setLastName("Khandelwal");
		assertEquals("Khandelwal",signupBean.getLastName());
	}

	/**
	 * Test method for {@link com.ntl.topjobs.employeesignuplogin.model.EmployerSignupDetails#getPassword()}.
	 */
	@Test
	public void testGetPassword() {
		signupBean=new EmployerSignupDetails();
		signupBean.setPassword("Bhanu@123");
		assertEquals("Bhanu@123",signupBean.getPassword());
	}

	/**
	 * Test method for {@link com.ntl.topjobs.employeesignuplogin.model.EmployerSignupDetails#getEmailId()}.
	 */
	@Test
	public void testGetEmailId() {
		signupBean=new EmployerSignupDetails();
		signupBean.setEmailId("bhanu29k@gmail.com");
		assertEquals("bhanu29k@gmail.com",signupBean.getEmailId());
	}


	/**
	 * Test method for {@link com.ntl.topjobs.employeesignuplogin.model.EmployerSignupDetails#getEmpId()}.
	 */
	@Test
	public void testGetEmpId() {
		signupBean=new EmployerSignupDetails();
		signupBean.setFirstName("bhanu");
		signupBean.setEmpId();
		assertEquals(6,signupBean.getEmpId().length());
	}
	
	@Test
	public void testGetGender() {
		signupBean=new EmployerSignupDetails();
		signupBean.setGender("male");
		assertEquals("male",signupBean.getGender());
	}
	
	@Test
	public void testGetCountry() {
		signupBean=new EmployerSignupDetails();
		signupBean.setCountry("India");
		assertEquals("India",signupBean.getCountry());
	}
	
}

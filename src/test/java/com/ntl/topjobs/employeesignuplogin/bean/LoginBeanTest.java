/**
 * 
 */
package com.ntl.topjobs.employeesignuplogin.bean;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ntl.topjobs.employeesignuplogin.model.EmployerLoginDetails;

/**
 * @author Training
 *
 */
public class LoginBeanTest {

	EmployerLoginDetails loginBean;


	/**
	 * Test method for {@link com.ntl.topjobs.employeesignuplogin.model.EmployerLoginDetails#getEmpId()}.
	 */
	@Test
	public void testGetEmpId() {
	loginBean=new EmployerLoginDetails();
	loginBean.setEmpId("bhanu29k");
	assertEquals("bhanu29k",loginBean.getEmpId());
	}

	/**
	 * Test method for {@link com.ntl.topjobs.employeesignuplogin.bean.LoginBean#setEmpId(java.lang.String)}.
	 */

	/**
	 * Test method for {@link com.ntl.topjobs.employeesignuplogin.model.EmployerLoginDetails#getEmailId()}.
	 */
	@Test
	public void testGetEmailId() {
		loginBean=new EmployerLoginDetails();
		loginBean.setEmailId("bhanu29k@gmail.com");
		assertEquals("bhanu29k@gmail.com",loginBean.getEmailId());

	}

		/**
	 * Test method for {@link com.ntl.topjobs.employeesignuplogin.model.EmployerLoginDetails#getPassword()}.
	 */
	@Test
	public void testGetPassword() {
		loginBean=new EmployerLoginDetails();
		loginBean.setPassword("Bhanu@123");
		assertEquals("Bhanu@123",loginBean.getPassword());

	}



}

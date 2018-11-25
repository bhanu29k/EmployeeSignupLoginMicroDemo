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
import com.ntl.topjobs.employeesignuplogin.model.SubscriptionFeeDetails;

/**
 * @author Training
 *
 */
public class SubscriptionFeeDetailsTest {

	SubscriptionFeeDetails subscriptionFeeDetails;
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
	 * Test method for {@link com.ntl.topjobs.employeesignuplogin.model.SubscriptionFeeDetails#getBankName()}.
	 */
	@Test
	public void testGetBankName() {
		subscriptionFeeDetails=new SubscriptionFeeDetails();
		subscriptionFeeDetails.setBankName("Sbi");
		assertEquals("Sbi",subscriptionFeeDetails.getBankName());
	}

	/**
	 * Test method for {@link com.ntl.topjobs.employeesignuplogin.model.SubscriptionFeeDetails#getCardName()}.
	 */
	@Test
	public void testGetCardName() {
		subscriptionFeeDetails=new SubscriptionFeeDetails();
		subscriptionFeeDetails.setCardName("Debit");
		assertEquals("Debit",subscriptionFeeDetails.getCardName());
	}

	/**
	 * Test method for {@link com.ntl.topjobs.employeesignuplogin.model.SubscriptionFeeDetails#getFee()}.
	 */
	@Test
	public void testGetFee() {
		subscriptionFeeDetails=new SubscriptionFeeDetails();
		subscriptionFeeDetails.setFee("300");
		assertEquals("300",subscriptionFeeDetails.getFee());
	}

	/**
	 * Test method for {@link com.ntl.topjobs.employeesignuplogin.model.SubscriptionFeeDetails#getCardNo()}.
	 */
	@Test
	public void testGetCardNo() {
		subscriptionFeeDetails=new SubscriptionFeeDetails();
		subscriptionFeeDetails.setCardNo("12345678");
		assertEquals("12345678",subscriptionFeeDetails.getCardNo());
	}

	/**
	 * Test method for {@link com.ntl.topjobs.employeesignuplogin.model.SubscriptionFeeDetails#getEmpId()}.
	 */
	@Test
	public void testGetEmpId() {
		subscriptionFeeDetails=new SubscriptionFeeDetails();
		subscriptionFeeDetails.setEmpId("bhanu29k");
		assertEquals("bhanu29k",subscriptionFeeDetails.getEmpId());
	}

}

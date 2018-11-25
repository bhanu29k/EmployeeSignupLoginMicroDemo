/**
 * 
 */
package com.ntl.topjobs.employeesignuplogin.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import com.ntl.topjobs.employeesignuplogin.model.EmployerSignupDetails;

/**
 * @author Training
 *
 */
@Repository
public interface Dao extends JpaRepository<EmployerSignupDetails, String> {

	
@Transactional
@Query(value="SELECT count(*) FROM employer_signup_details WHERE email_id=?",nativeQuery=true)
public int findByEmailId(String emailId);
}

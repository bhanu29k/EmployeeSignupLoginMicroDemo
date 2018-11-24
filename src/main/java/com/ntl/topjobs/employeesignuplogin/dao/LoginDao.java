/**
 * 
 */
package com.ntl.topjobs.employeesignuplogin.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ntl.topjobs.employeesignuplogin.model.EmployerLoginDetails;

/**
 * @author Training
 *
 */
@Repository
public interface LoginDao extends JpaRepository<EmployerLoginDetails, String> {

}

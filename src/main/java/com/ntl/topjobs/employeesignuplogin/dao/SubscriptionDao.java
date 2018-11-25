/**
 * 
 */
package com.ntl.topjobs.employeesignuplogin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ntl.topjobs.employeesignuplogin.model.SubscriptionFeeDetails;

/**
 * @author Training
 *
 */
public interface SubscriptionDao extends JpaRepository<SubscriptionFeeDetails,String> {

}

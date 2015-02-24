package com.cb.dao;

import java.util.List;

import com.cb.model.CustomerInformation;

/**
 * CustomerInformation Data Access Object (GenericDao) interface.
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 */
public interface CustomerInformationDao extends GenericDao<CustomerInformation, Long> {

 
    /**
     * Gets a list of users ordered by the uppercase version of their username.
     *
     * @return List populated list of users
     */
    List<CustomerInformation> getCustomerInformations();

    /**
     * Saves a CustomerInformation's information.
     * @param CustomerInformation the object to be saved
     * @return the persisted CustomerInformation object
     */
    CustomerInformation saveCustomerInformation(CustomerInformation customerInformation);
 
    
}

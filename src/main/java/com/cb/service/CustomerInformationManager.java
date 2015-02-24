package com.cb.service;

import java.util.List;
import com.cb.dao.CustomerInformationDao;
import com.cb.model.CustomerInformation;

/**
 * Business Service Interface to handle communication between web and
 * persistence layer.
 * 
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a> Modified by
 *         <a href="mailto:dan@getrolling.com">Dan Kibler </a>
 */
public interface CustomerInformationManager extends
		GenericManager<CustomerInformation, Long> {
	/**
	 * Convenience method for testing - allows you to mock the DAO and set it on
	 * an interface.
	 * 
	 * @param CustomerInformationDao
	 *            the CustomerInformationDao implementation to use
	 */
	void setCustomerInformationDao(CustomerInformationDao customerInformationDao);

	/**
	 * Retrieves a user by CustomerInformationId. An exception is thrown if user not found
	 * 
	 * @param CustomerInformationId
	 *            the identifier for the CustomerInformation
	 * @return CustomerInformation
	 */
	CustomerInformation getCustomerInformation(String customerInformationId);

	/**
	 * Finds a CustomerInformation by their Customername.
	 * 
	 * @param username
	 *            the CustomerInformation's Customername used to login
	 * @return CustomerInformation a populated CustomerInformation object
	 * @throws org.springframework.security.core.userdetails.CustomerInformationnameNotFoundException
	 *             exception thrown when CustomerInformation not found
	 */
	CustomerInformation getCustomerInformationByCustomername(String Customername);

	/**
	 * Retrieves a list of all CustomerInformations.
	 * 
	 * @return List
	 */
	List<CustomerInformation> getCustomerInformations();

	/**
	 * Saves a CustomerInformation's information.
	 * 
	 * @param CustomerInformation
	 *            the CustomerInformation's information
	 * @throws CustomerInformationExistsException
	 *             thrown when CustomerInformation already exists
	 * @return CustomerInformation the updated CustomerInformation object
	 */
	CustomerInformation saveCustomerInformation(
			CustomerInformation customerInformation);

	/**
	 * Removes a CustomerInformation from the database
	 * 
	 * @param CustomerInformation
	 *            the CustomerInformation to remove
	 */
	void removeCustomerInformation(CustomerInformation customerInformation);

	/**
	 * Removes a CustomerInformation from the database by their userId
	 * 
	 * @param userId
	 *            the CustomerInformation's id
	 */
	void removeCustomerInformation(String customerInformationId);

	/**
	 * Search a CustomerInformation for search terms.
	 * 
	 * @param searchTerm
	 *            the search terms.
	 * @return a list of matches, or all if no searchTerm.
	 */
	List<CustomerInformation> search(String searchTerm);

}

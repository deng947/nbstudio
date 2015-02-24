package com.cb.service.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import com.cb.dao.CustomerInformationDao;
import com.cb.model.CustomerInformation;
import com.cb.model.User;
import com.cb.service.CustomerInformationManager;
import com.cb.service.MailEngine;

/**
 * Implementation of UserManager interface.
 * 
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 */
@Service("customerInformationManager")
public class CustomerInformationManagerImpl extends
		GenericManagerImpl<CustomerInformation, Long> implements
		CustomerInformationManager {

	private CustomerInformationDao customerInformationDao;
	private MailEngine mailEngine;
	private SimpleMailMessage message;

	@Override
	@Autowired
	public void setCustomerInformationDao(
			final CustomerInformationDao customerInformationDao) {
		this.dao = customerInformationDao;
		this.customerInformationDao = customerInformationDao;
	}

	@Autowired(required = false)
	public void setMailEngine(final MailEngine mailEngine) {
		this.mailEngine = mailEngine;
	}

	@Autowired(required = false)
	public void setMailMessage(final SimpleMailMessage message) {
		this.message = message;
	}

	private void sendUserEmail(final User user, final String template,
			final String url) {
		message.setTo(user.getFullName() + "<" + user.getEmail() + ">");
		final Map<String, Serializable> model = new HashMap<String, Serializable>();
		model.put("user", user);
		model.put("applicationURL", url);
		mailEngine.sendMessage(message, template, model);
	}

	@Override
	public CustomerInformation getCustomerInformation(
			String customerInformationId) {
		return customerInformationDao.get(new Long(customerInformationId));
	}

	@Override
	public CustomerInformation getCustomerInformationByCustomername(
			String Customername) {
		// return (CustomerInformation) customerInformationDao.loadUserByUsername(Customername);
		return null;
	}

	@Override
	public List<CustomerInformation> getCustomerInformations() {
		return customerInformationDao.getAllDistinct();
	}

	@Override
	public CustomerInformation saveCustomerInformation(
			CustomerInformation customerInformation) {
		return customerInformationDao.saveCustomerInformation(customerInformation);
	}

	@Override
	public void removeCustomerInformation(
			CustomerInformation customerInformation) {
		log.debug("removing customerInformation: " + customerInformation);
		customerInformationDao.remove(customerInformation);
	}

	@Override
	public void removeCustomerInformation(String customerInformationId) {
		log.debug("removing CustomerInformation: " + customerInformationId);
		customerInformationDao.remove(new Long(customerInformationId));

	}

	@Override
	public List<CustomerInformation> search(String searchTerm) {
		return super.search(searchTerm, CustomerInformation.class);
	}

}

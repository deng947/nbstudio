package com.cb.dao.hibernate;

import java.util.List;

import javax.persistence.Table;

import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.hibernate4.SessionFactoryUtils;
import org.springframework.stereotype.Repository;

import com.cb.dao.CustomerInformationDao;
import com.cb.model.CustomerInformation;
/**
 * This class interacts with Hibernate session to save/delete and
 * retrieve User objects.
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 *         Modified by <a href="mailto:dan@getrolling.com">Dan Kibler</a>
 *         Extended to implement Acegi UserDetailsService interface by David Carter david@carter.net
 *         Modified by <a href="mailto:bwnoll@gmail.com">Bryan Noll</a> to work with
 *         the new BaseDaoHibernate implementation that uses generics.
 *         Modified by jgarcia (updated to hibernate 4)
 */
@Repository("customerInformationDao")
public class CustomerInformationDaoHibernate extends GenericDaoHibernate<CustomerInformation, Long> implements CustomerInformationDao{

    /**
     * Constructor that sets the entity to User.class.
     */
    public CustomerInformationDaoHibernate() {
        super(CustomerInformation.class);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<CustomerInformation> getCustomerInformations() {
        Query qry = getSession().createQuery("from CustomerInformation c order by upper(c.customerName)");
        return qry.list();
    }

    /**
     * {@inheritDoc}
     */
    public CustomerInformation saveCustomerInformation(CustomerInformation customerInformation) {
        if (log.isDebugEnabled()) {
            log.debug("CustomerInformation's id: " + customerInformation.getId());
        }
        getSession().saveOrUpdate(customerInformation);
        // necessary to throw a DataIntegrityViolation and catch it in UserManager
        getSession().flush();
        return customerInformation;
    }

    /**
     * Overridden simply to call the saveUser method. This is happening
     * because saveUser flushes the session and saveObject of BaseDaoHibernate
     * does not.
     *
     * @param user the user to save
     * @return the modified user (with a primary key set if they're new)
     */
    @Override
    public CustomerInformation save(CustomerInformation customerInformation) {
        return this.saveCustomerInformation(customerInformation);
    } 
}

package com.cb.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

/**
 * This class represents the basic "user" object in AppFuse that allows for authentication
 * and user management.  It implements Acegi Security's UserDetails interface.
 *
 * @author cb
 */
@Entity
@Table(name = "TAB_CUSTOMER_ORDER")
@Indexed
@XmlRootElement
public class CustomerOrder extends BaseObject implements Serializable {
    private static final long serialVersionUID = 3832626162173359411L;

    private Long id;
    private String orderNumber;                //订单编号
    private CustomerInformation customer;      //订单客户
    private java.math.BigDecimal orderAmount;  //订单总金额
    private java.math.BigDecimal deliverGoodsAmount;  //已发货金额
    private User orderAgent;                   //制单人
    private String orderRemark;                //订单备注
	private Date createDate;//创建日期
	private Date lastUpdateDate;//最后更新时间
    private boolean enabled;//是否有效
    //订单行信息
    private Set<CustomerOrderLine> orderLines = new HashSet<CustomerOrderLine>(); 

    /**
     * Default constructor - creates a new instance with no values set.
     */
    public CustomerOrder() {
    }

    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
    public Long getId() {
        return id;
    }
 
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH }, fetch = FetchType.LAZY)
    public CustomerInformation getCustomer() {
		return customer;
	}



	public void setCustomer(CustomerInformation customer) {
		this.customer = customer;
	}



	@ManyToMany(fetch = FetchType.EAGER)
    @Fetch(FetchMode.SELECT)    
    @JoinTable(
            name = "TAB_CUSTOMER_ORDER_ORDERLINES",
            joinColumns = { @JoinColumn(name = "order_id") },
            inverseJoinColumns = @JoinColumn(name = "order_line_id")
    )
    public Set<CustomerOrderLine> getOrderLines() {
        return orderLines;
    }

    /**
     * Convert user roles to LabelValue objects for convenience.
     *
     * @return a list of LabelValue objects with role information
     */
    @Transient
    public List<LabelValue> getOrderLineList() {
        List<LabelValue> orderLinesList = new ArrayList<LabelValue>();

        if (this.orderLines != null) {
            for (CustomerOrderLine customerOrderLine : orderLines) {
                // convert the user's roles to LabelValue Objects
            	//orderLinesList.add(new LabelValue(customerOrder.getName(), customerOrderLine.getName()));
            }
        }

        return orderLinesList;
    }

    /**
     * Adds a role for the user
     *
     * @param role the fully instantiated role
     */
    public void addCustomerOrderLine(CustomerOrderLine customerOrderLine) {
    	getOrderLines().add(customerOrderLine);
    }

    
    public void setOrderLines(Set<CustomerOrderLine> orderLines) {
        this.orderLines = orderLines;
    }

     
    public String getOrderNumber() {
		return orderNumber;
	}



	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}


	@Column(precision=19,scale=4)  
	 @Field
	public java.math.BigDecimal getOrderAmount() {
		return orderAmount;
	}



	public void setOrderAmount(java.math.BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}



	public User getOrderAgent() {
		return orderAgent;
	}



	public void setOrderAgent(User orderAgent) {
		this.orderAgent = orderAgent;
	}



	public String getOrderRemark() {
		return orderRemark;
	}



	public void setOrderRemark(String orderRemark) {
		this.orderRemark = orderRemark;
	}



	public Date getCreateDate() {
		return createDate;
	}



	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}



	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}



	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}



	public boolean isEnabled() {
		return enabled;
	}



	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}



	public void setId(Long id) {
		this.id = id;
	}

	@Column(precision=19,scale=4)  
	 @Field

	public java.math.BigDecimal getDeliverGoodsAmount() {
		return deliverGoodsAmount;
	}



	public void setDeliverGoodsAmount(java.math.BigDecimal deliverGoodsAmount) {
		this.deliverGoodsAmount = deliverGoodsAmount;
	}



	/**
     * {@inheritDoc}
     */
    public boolean equals(Object o) {
        

        return true;

    }

    /**
     * {@inheritDoc}
     */
    public int hashCode() {
         return 0;
    }

    /**
     * {@inheritDoc}
     */
    public String toString() { return null;}
}

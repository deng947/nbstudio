package com.cb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Indexed;

/**
 * This class represents the basic "user" object in AppFuse that allows for authentication
 * and user management.  It implements Acegi Security's UserDetails interface.
 *
 * @author cb
 */
@Entity
@Table(name = "TAB_CUSTOMER_ORDER_LINE")
@Indexed
@XmlRootElement
public class CustomerOrderLine extends BaseObject implements Serializable {
    private static final long serialVersionUID = 3832626162173359411L;

    private Long id;
    private String orderLineNumber;                //订单行编号
    private CustomerOrder customerOrder;      //订单信息
    private java.math.BigDecimal orderLineAmount;  //订单行金额
    private java.math.BigDecimal deliverGoodsAmount;//已发货金额
    private String orderLineStatus;             //订单行状态
    private String orderLineRemark;                //订单行备注
	private Date createDate;//创建日期
	private Date lastUpdateDate;//最后更新时间
    private boolean enabled;//是否有效
     

    /**
     * Default constructor - creates a new instance with no values set.
     */
    public CustomerOrderLine() {
    }
 

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
    public Long getId() {
        return id;
    }


	public String getOrderLineNumber() {
		return orderLineNumber;
	}


	public void setOrderLineNumber(String orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE,
			CascadeType.REFRESH }, fetch = FetchType.LAZY)
	public CustomerOrder getCustomerOrder() {
		return customerOrder;
	}


	public void setCustomerOrder(CustomerOrder customerOrder) {
		this.customerOrder = customerOrder;
	}


	public java.math.BigDecimal getOrderLineAmount() {
		return orderLineAmount;
	}


	public void setOrderLineAmount(java.math.BigDecimal orderLineAmount) {
		this.orderLineAmount = orderLineAmount;
	}


	public java.math.BigDecimal getDeliverGoodsAmount() {
		return deliverGoodsAmount;
	}


	public void setDeliverGoodsAmount(java.math.BigDecimal deliverGoodsAmount) {
		this.deliverGoodsAmount = deliverGoodsAmount;
	}


	public String getOrderLineStatus() {
		return orderLineStatus;
	}


	public void setOrderLineStatus(String orderLineStatus) {
		this.orderLineStatus = orderLineStatus;
	}


	public String getOrderLineRemark() {
		return orderLineRemark;
	}


	public void setOrderLineRemark(String orderLineRemark) {
		this.orderLineRemark = orderLineRemark;
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


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

    
}

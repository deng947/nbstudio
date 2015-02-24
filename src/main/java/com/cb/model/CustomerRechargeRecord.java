package com.cb.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

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
@Table(name = "TAB_CUSTOMER_INFO")
@Indexed
@XmlRootElement
public class CustomerRechargeRecord extends BaseObject implements Serializable{
    private static final long serialVersionUID = 3832626162173359411L;

    private Long id;
    private String customerName; //客户名称
    private String customerSite;  //客户地点
    private String customerAddress; //客户地址                                  
    private String deliverGoodsAddress;     //送货地址
    private String description; //客户描述
    private String customerContactPerson;// 供应商联系人
	private String contact;// 联系方式
	private String contactNumberOrEmail;// 联系号码或电邮
	private String contactQqNumber;// 联系人QQ号码
	private String registrationNumber;// 工商注册号
	private String certificateRegistration;// 注册证书
	private String taxRegistrationNo;// 纳税登记号
	private String taxCertificate;// 纳税证书 
	private String customerQualificationCertificate;// 供应商资质证书
	private String legalRepresentativePerson;// 法定代表人/负责人 
	private String bankName;// 开户银行
	private String accountName;// 户名
	private String bankAccount;// 银行账号    
	private java.math.BigDecimal preChargeAmount;//充值金额
	private Date createDate;//创建日期
	private Date lastUpdateDate;//最后更新时间
    private boolean enabled;//是否有效
    private boolean customerExpired;//是否过期
    private boolean customerLocked;//是否锁定
    /**
     * Default constructor - creates a new instance with no values set.
     */
    public CustomerRechargeRecord() {
    }

    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @DocumentId
    public Long getId() {
        return id;
    } 

    public void setId(Long id) {
        this.id = id;
    }



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getCustomerSite() {
		return customerSite;
	}



	public void setCustomerSite(String customerSite) {
		this.customerSite = customerSite;
	}



	public String getCustomerAddress() {
		return customerAddress;
	}



	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}



	public String getDeliverGoodsAddress() {
		return deliverGoodsAddress;
	}



	public void setDeliverGoodsAddress(String deliverGoodsAddress) {
		this.deliverGoodsAddress = deliverGoodsAddress;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getCustomerContactPerson() {
		return customerContactPerson;
	}



	public void setCustomerContactPerson(String customerContactPerson) {
		this.customerContactPerson = customerContactPerson;
	}



	public String getContact() {
		return contact;
	}



	public void setContact(String contact) {
		this.contact = contact;
	}



	public String getContactNumberOrEmail() {
		return contactNumberOrEmail;
	}



	public void setContactNumberOrEmail(String contactNumberOrEmail) {
		this.contactNumberOrEmail = contactNumberOrEmail;
	}



	public String getContactQqNumber() {
		return contactQqNumber;
	}



	public void setContactQqNumber(String contactQqNumber) {
		this.contactQqNumber = contactQqNumber;
	}



	public String getRegistrationNumber() {
		return registrationNumber;
	}



	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}



	public String getCertificateRegistration() {
		return certificateRegistration;
	}



	public void setCertificateRegistration(String certificateRegistration) {
		this.certificateRegistration = certificateRegistration;
	}



	public String getTaxRegistrationNo() {
		return taxRegistrationNo;
	}



	public void setTaxRegistrationNo(String taxRegistrationNo) {
		this.taxRegistrationNo = taxRegistrationNo;
	}



	public String getTaxCertificate() {
		return taxCertificate;
	}



	public void setTaxCertificate(String taxCertificate) {
		this.taxCertificate = taxCertificate;
	}



	public String getCustomerQualificationCertificate() {
		return customerQualificationCertificate;
	}



	public void setCustomerQualificationCertificate(
			String customerQualificationCertificate) {
		this.customerQualificationCertificate = customerQualificationCertificate;
	}



	public String getLegalRepresentativePerson() {
		return legalRepresentativePerson;
	}



	public void setLegalRepresentativePerson(String legalRepresentativePerson) {
		this.legalRepresentativePerson = legalRepresentativePerson;
	}



	public String getBankName() {
		return bankName;
	}



	public void setBankName(String bankName) {
		this.bankName = bankName;
	}



	public String getAccountName() {
		return accountName;
	}



	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}



	public String getBankAccount() {
		return bankAccount;
	}



	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}



	 


	 @Column(precision=19,scale=4)  
	 @Field
	public java.math.BigDecimal getPreChargeAmount() {
		return preChargeAmount;
	}



	public void setPreChargeAmount(java.math.BigDecimal preChargeAmount) {
		this.preChargeAmount = preChargeAmount;
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



	public boolean isCustomerExpired() {
		return customerExpired;
	}



	public void setCustomerExpired(boolean customerExpired) {
		this.customerExpired = customerExpired;
	}



	public boolean isCustomerLocked() {
		return customerLocked;
	}



	public void setCustomerLocked(boolean customerLocked) {
		this.customerLocked = customerLocked;
	}



	@Override
	public String toString() { 
		return null;
	}



	@Override
	public boolean equals(Object o) { 
		return false;
	}



	@Override
	public int hashCode() { 
		return 0;
	} 
    
}

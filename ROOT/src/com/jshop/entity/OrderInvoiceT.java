package com.jshop.entity;

// Generated 2012-10-10 12:34:32 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * OrderInvoiceT generated by hbm2java
 */
public class OrderInvoiceT implements java.io.Serializable {

	private String orderInvoiceid;
	private String orderid;
	private String invType;
	private String invPayee;
	private String amount;
	private String userid;
	private String state;
	private String username;
	private String invContent;
	private Date createtime;

	public OrderInvoiceT() {
	}

	public OrderInvoiceT(String orderInvoiceid, String orderid, String invType,
			String invPayee, String amount, String userid, String state,
			String username, Date createtime) {
		this.orderInvoiceid = orderInvoiceid;
		this.orderid = orderid;
		this.invType = invType;
		this.invPayee = invPayee;
		this.amount = amount;
		this.userid = userid;
		this.state = state;
		this.username = username;
		this.createtime = createtime;
	}

	public OrderInvoiceT(String orderInvoiceid, String orderid, String invType,
			String invPayee, String amount, String userid, String state,
			String username, String invContent, Date createtime) {
		this.orderInvoiceid = orderInvoiceid;
		this.orderid = orderid;
		this.invType = invType;
		this.invPayee = invPayee;
		this.amount = amount;
		this.userid = userid;
		this.state = state;
		this.username = username;
		this.invContent = invContent;
		this.createtime = createtime;
	}

	public String getOrderInvoiceid() {
		return this.orderInvoiceid;
	}

	public void setOrderInvoiceid(String orderInvoiceid) {
		this.orderInvoiceid = orderInvoiceid;
	}

	public String getOrderid() {
		return this.orderid;
	}

	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}

	public String getInvType() {
		return this.invType;
	}

	public void setInvType(String invType) {
		this.invType = invType;
	}

	public String getInvPayee() {
		return this.invPayee;
	}

	public void setInvPayee(String invPayee) {
		this.invPayee = invPayee;
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getInvContent() {
		return this.invContent;
	}

	public void setInvContent(String invContent) {
		this.invContent = invContent;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}

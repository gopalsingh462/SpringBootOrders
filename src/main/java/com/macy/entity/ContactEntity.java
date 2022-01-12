package com.macy.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.macy.dto.Address;
import com.macy.dto.Name;

@Entity
@Table(name="contacts")
public class ContactEntity {
	@GeneratedValue
	@Id
	private int id;
	private String custID;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="name_id")
	private NameEntity name;
	private Address address;
	private String daytimePhoneNbr;
	private String homePhoneNbr;
	private String alternatePhoneNbr;
	private boolean sendSMSMessage;
	private String emailAddress;
	private int seperatorContact0;

	public ContactEntity() {
	}

	public ContactEntity(int id, String custID, NameEntity name, Address address, String daytimePhoneNbr, String homePhoneNbr,
			String alternatePhoneNbr, boolean sendSMSMessage, String emailAddress, int seperatorContact0) {
		super();
		this.custID = custID;
		this.name = name;
		this.address = address;
		this.daytimePhoneNbr = daytimePhoneNbr;
		this.homePhoneNbr = homePhoneNbr;
		this.alternatePhoneNbr = alternatePhoneNbr;
		this.sendSMSMessage = sendSMSMessage;
		this.emailAddress = emailAddress;
		this.seperatorContact0 = seperatorContact0;
		this.id = id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public String getCustID() {
		return custID;
	}

	public void setCustID(String custID) {
		this.custID = custID;
	}

	public NameEntity getName() {
		return name;
	}

	public void setName(NameEntity name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getDaytimePhoneNbr() {
		return daytimePhoneNbr;
	}

	public void setDaytimePhoneNbr(String daytimePhoneNbr) {
		this.daytimePhoneNbr = daytimePhoneNbr;
	}

	public String getHomePhoneNbr() {
		return homePhoneNbr;
	}

	public void setHomePhoneNbr(String homePhoneNbr) {
		this.homePhoneNbr = homePhoneNbr;
	}

	public String getAlternatePhoneNbr() {
		return alternatePhoneNbr;
	}

	public void setAlternatePhoneNbr(String alternatePhoneNbr) {
		this.alternatePhoneNbr = alternatePhoneNbr;
	}

	public boolean isSendSMSMessage() {
		return sendSMSMessage;
	}

	public void setSendSMSMessage(boolean sendSMSMessage) {
		this.sendSMSMessage = sendSMSMessage;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getSeperatorContact0() {
		return seperatorContact0;
	}

	public void setSeperatorContact0(int seperatorContact0) {
		this.seperatorContact0 = seperatorContact0;
	}

	@Override
	public String toString() {
		return "Contact [custID=" + custID + ", name=" + name + ", address=" + address + ", daytimePhoneNbr="
				+ daytimePhoneNbr + ", homePhoneNbr=" + homePhoneNbr + ", alternatePhoneNbr=" + alternatePhoneNbr
				+ ", sendSMSMessage=" + sendSMSMessage + ", emailAddress=" + emailAddress + ", seperatorContact0="
				+ seperatorContact0 + "]";
	}

}

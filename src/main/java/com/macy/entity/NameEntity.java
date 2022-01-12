package com.macy.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="names")
public class NameEntity {
	@GeneratedValue
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private int seperatorName0;
	private int seperatorName1;

	public NameEntity() {
	}

	public NameEntity(int id, String firstName, String lastName, int seperatorName0, int seperatorName1) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.seperatorName0 = seperatorName0;
		this.seperatorName1 = seperatorName1;
		this.id = id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSeperatorName0() {
		return seperatorName0;
	}

	public void setSeperatorName0(int seperatorName0) {
		this.seperatorName0 = seperatorName0;
	}

	public int getSeperatorName1() {
		return seperatorName1;
	}

	public void setSeperatorName1(int seperatorName1) {
		this.seperatorName1 = seperatorName1;
	}

	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + ", seperatorName0=" + seperatorName0
				+ ", seperatorName1=" + seperatorName1 + "]";
	}
}

package com.treeset;

import java.util.Set;

public class Person
{

	int personid;
	String personName;
	String personAddress;
	public Person(int personid, String personName, String personAddress) {
		super();
		this.personid = personid;
		this.personName = personName;
		this.personAddress = personAddress;
	}
	public int getPersonid() {
		return personid;
	}
	public void setPersonid(int personid) {
		this.personid = personid;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	@Override
	public String toString() {
		return "Person [personid=" + personid + ", personName=" + personName + ", personAddress=" + personAddress + "]";
	}
	
	

}

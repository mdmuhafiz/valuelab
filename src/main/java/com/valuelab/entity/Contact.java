package com.valuelab.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contacts")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String pleaseSpecifyTheNatureOfYourEnquiry;
	@Column(name = "first_name",length = 45,nullable = false)
	private String firstName;
	@Column(name = "last_name",length = 45,nullable = false)
	private String lastName;
	@Column(name = "email",length = 45,nullable = false,unique = true)
	private String email;
	@Column(name = "company_name",length = 45,nullable = false)
	private String companyName;
	private String howDidYouHearAboutUs;
	
	private String country;
	@Column(name = "comments",length = 45,nullable = false)
	private String comments;
	public Contact() {
		
	}
	
	public Contact(String pleaseSpecifyTheNatureOfYourEnquiry, String firstName, String lastName, String email,
			String companyName, String howDidYouHearAboutUs, String country, String comments) {
		
		this.pleaseSpecifyTheNatureOfYourEnquiry = pleaseSpecifyTheNatureOfYourEnquiry;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.companyName = companyName;
		this.howDidYouHearAboutUs = howDidYouHearAboutUs;
		this.country = country;
		this.comments = comments;
	}

	public long getId() {
		return id;
	}
	public String getPleaseSpecifyTheNatureOfYourEnquiry() {
		return pleaseSpecifyTheNatureOfYourEnquiry;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getCompanyName() {
		return companyName;
	}
	public String getHowDidYouHearAboutUs() {
		return howDidYouHearAboutUs;
	}
	public String getCountry() {
		return country;
	}
	public String getComments() {
		return comments;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setPleaseSpecifyTheNatureOfYourEnquiry(String pleaseSpecifyTheNatureOfYourEnquiry) {
		this.pleaseSpecifyTheNatureOfYourEnquiry = pleaseSpecifyTheNatureOfYourEnquiry;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setHowDidYouHearAboutUs(String howDidYouHearAboutUs) {
		this.howDidYouHearAboutUs = howDidYouHearAboutUs;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	


}


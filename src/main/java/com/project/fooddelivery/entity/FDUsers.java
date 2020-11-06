package com.project.fooddelivery.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FD_USERS")
public class FDUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "US_ID")
	private Long id;
	
	@Column(name = "US_NAME", nullable = false)
	private String name;
	
	@Column(name = "US_DOB")
	private Date dob;
	
	@Column(name = "US_TYPE", nullable = false)
	private String type;
	
	@Column(name = "US_CONTACT_NUMBER", nullable = false)
	private String contactNumber;
	
	@Column(name = "US_MAIL_ID", nullable = false)
	private String mailId;
	
	@Column(name = "US_PROF")
	private String profession;
	
	@Column(name = "US_PROMOTION")
	private String promotion;
	
	@Column(name = "US_BIO")
	private String bio;
	
	@Column(name = "US_REG_TYPE")
	private String registerType;
	
	@Column(name = "US_STATUS")
	private String status;
	
	@Column(name = "CREATED_TIMESTAMP")
	private Timestamp createdTimestamp;
	
	@Column(name = "UPDATED_TIMESTAMP")
	private Timestamp updatedTimestamp;
	
	@Column(name = "DELETED_TIMESTAMP")
	private Timestamp deletedTimestamp;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}

	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
	 * @return the mailId
	 */
	public String getMailId() {
		return mailId;
	}

	/**
	 * @param mailId the mailId to set
	 */
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	/**
	 * @return the profession
	 */
	public String getProfession() {
		return profession;
	}

	/**
	 * @param profession the profession to set
	 */
	public void setProfession(String profession) {
		this.profession = profession;
	}

	/**
	 * @return the promotion
	 */
	public String getPromotion() {
		return promotion;
	}

	/**
	 * @param promotion the promotion to set
	 */
	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	/**
	 * @return the bio
	 */
	public String getBio() {
		return bio;
	}

	/**
	 * @param bio the bio to set
	 */
	public void setBio(String bio) {
		this.bio = bio;
	}

	/**
	 * @return the registerType
	 */
	public String getRegisterType() {
		return registerType;
	}

	/**
	 * @param registerType the registerType to set
	 */
	public void setRegisterType(String registerType) {
		this.registerType = registerType;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the createdTimestamp
	 */
	public Timestamp getCreatedTimestamp() {
		return createdTimestamp;
	}

	/**
	 * @param createdTimestamp the createdTimestamp to set
	 */
	public void setCreatedTimestamp(Timestamp createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	/**
	 * @return the updatedTimestamp
	 */
	public Timestamp getUpdatedTimestamp() {
		return updatedTimestamp;
	}

	/**
	 * @param updatedTimestamp the updatedTimestamp to set
	 */
	public void setUpdatedTimestamp(Timestamp updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}

	/**
	 * @return the deletedTimestamp
	 */
	public Timestamp getDeletedTimestamp() {
		return deletedTimestamp;
	}

	/**
	 * @param deletedTimestamp the deletedTimestamp to set
	 */
	public void setDeletedTimestamp(Timestamp deletedTimestamp) {
		this.deletedTimestamp = deletedTimestamp;
	}
	
	
}

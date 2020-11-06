package com.project.fooddelivery.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FD_USER_PASSWORD")
public class FDUsersPassword {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "UP_ID")
	private Long id;

	@Column(name = "UP_PASSWORD")
	private String password;

	@Column(name = "UP_ATTEMPT")
	private Integer attemp;

	@Column(name = "US_ID")
	private String userId;

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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the attemp
	 */
	public Integer getAttemp() {
		return attemp;
	}

	/**
	 * @param attemp the attemp to set
	 */
	public void setAttemp(Integer attemp) {
		this.attemp = attemp;
	}

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
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

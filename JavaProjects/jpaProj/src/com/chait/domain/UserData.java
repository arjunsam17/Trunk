package com.chait.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_data database table.
 * 
 */
@Entity
@Table(name="user_data")
@NamedQuery(name="UserData.findAll", query="SELECT u FROM UserData u")
public class UserData implements Serializable {
	private static final long serialVersionUID = 1L;
	private int userDataId;
	private String fullName;
	private String password;
	private String userName;

	public UserData() {
	}


	@Id
	@Column(name="user_data_id")
	public int getUserDataId() {
		return this.userDataId;
	}

	public void setUserDataId(int userDataId) {
		this.userDataId = userDataId;
	}


	@Column(name="full_name")
	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	@Column(name="user_name")
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
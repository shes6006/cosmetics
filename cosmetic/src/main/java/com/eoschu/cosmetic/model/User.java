package com.eoschu.cosmetic.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	private String account;
	private String password;
	private String email;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [account=" + account + ", password=" + password + ", email=" + email + "]";
	}
	public User(String account, String password, String email) {
		super();
		this.account = account;
		this.password = password;
		this.email = email;
	}
	
}

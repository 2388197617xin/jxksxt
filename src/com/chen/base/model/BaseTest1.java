package com.chen.base.model;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseTest1<M extends BaseTest1<M>> extends Model<M> implements IBean {

	public void setId(Integer id) {
		set("id", id);
	}

	public Integer getId() {
		return get("id");
	}

	public void setFirstname(String firstname) {
		set("firstname", firstname);
	}

	public String getFirstname() {
		return get("firstname");
	}

	public void setLastname(String lastname) {
		set("lastname", lastname);
	}

	public String getLastname() {
		return get("lastname");
	}

	public void setPhone(String phone) {
		set("phone", phone);
	}

	public String getPhone() {
		return get("phone");
	}

	public void setEmail(String email) {
		set("email", email);
	}

	public String getEmail() {
		return get("email");
	}

}

package com.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student  {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private int student_id;
	
	@Column(name = "student_name", nullable = false)
	private String student_name;
	
	@Column(name = "student_email", nullable = false)
	private String student_email;
	
	
	@Column(name = "phone", nullable = false)
	private String phone;
	
	@Column(name = "address", nullable = false)
	private String address;
	

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_email() {
		return student_email;
	}

	public void setAdmin_email(String student_email) {
		this.student_email = student_email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	public Student() {}

	public Student(int student_id, String student_name, String student_email, String phone, String address) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_email = student_email;
		this.phone = phone;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_email="
				+ student_email + ", phone=" + phone + ", address=" + address + "]";
	}
	
	

	
	
	
	
	
	
}

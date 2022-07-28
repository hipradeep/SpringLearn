package com.springlearn.c7_stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("StudentNew1")
@Scope("prototype")  // by default Singleton  type 
public class StudentNew {
	@Value("265465")
	private String studentId;
	@Value("Pradeep Maurya")
	private String studentName;
	@Value("LKO")
	private String address;
	@Value("#{list1}")
	private List<String> phone;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public StudentNew(String studentId, String studentName, String address, List<String> phone) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
		this.phone = phone;
	}

	public StudentNew() {
		super();
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "StudentNew [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address
				+ ", phone=" + phone + "]";
	}

	
}

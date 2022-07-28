package com.springlearn.c1_2;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class C2_Persion {
	
	private String pName;
	private List<String> phone;
	private Set<String> address;
	private Map<String, String> mark;
	private Properties props;
	


	public C2_Persion(String pName, List<String> phone, Set<String> address, Map<String, String> mark,
			Properties props) {
		super();
		this.pName = pName;
		this.phone = phone;
		this.address = address;
		this.mark = mark;
		this.props = props;
	}

	public Map<String, String> getMark() {
		return mark;
	}

	public void setMark(Map<String, String> mark) {
		this.mark = mark;
	}

	public C2_Persion() {
		super();
	}

	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	
	
	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	@Override
	public String toString() {
		return "C2_Persion [pName=" + pName + ", phone=" + phone + "]";
	}

}
